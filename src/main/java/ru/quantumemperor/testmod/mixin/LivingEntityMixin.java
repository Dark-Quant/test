package ru.quantumemperor.testmod.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageTracker;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.quantumemperor.testmod.TestMod;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin {

    @Inject(method = "applyDamage", at = @At("HEAD"), cancellable = true)
    private void applyDamage(DamageSource source, float amount, CallbackInfo info) {
        if (source.getSource() instanceof PlayerEntity) {
            info.cancel();
            LivingEntity self = (LivingEntity) (Object) this;
            if (self.isInvulnerableTo(source)) {
                return;
            }
            amount = 1;
            amount = this.applyArmorToDamage(source, amount);
            float f = amount = this.applyEnchantmentsToDamage(source, amount);
            amount = Math.max(amount - self.getAbsorptionAmount(), 0.0f);
            self.setAbsorptionAmount(self.getAbsorptionAmount() - (f - amount));
            float g = f - amount;
            if (g > 0.0f && g < 3.4028235E37f && source.getAttacker() instanceof ServerPlayerEntity) {
                ((ServerPlayerEntity) source.getAttacker()).increaseStat(Stats.DAMAGE_DEALT_ABSORBED, Math.round(g * 10.0f));
            }
            if (amount == 0.0f) {
                return;
            }
            float h = self.getHealth();
            self.setHealth(h - amount);
            self.getDamageTracker().onDamage(source, h, amount);
            self.setAbsorptionAmount(self.getAbsorptionAmount() - amount);
            self.emitGameEvent(GameEvent.ENTITY_DAMAGED, source.getAttacker());
            TestMod.LOGGER.info("Player attack on " + amount + " damage");
        }
    }

    @Shadow
    protected abstract float applyArmorToDamage(DamageSource source, float amount);

    @Shadow
    protected abstract float applyEnchantmentsToDamage(DamageSource source, float amount);

}