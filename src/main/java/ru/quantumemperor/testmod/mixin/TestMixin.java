package ru.quantumemperor.testmod.mixin;

import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.quantumemperor.testmod.TestMod;

@Mixin(TitleScreen.class)
public class TestMixin {
	@Inject(method = "init()V", at = @At("HEAD"))
	private void init(CallbackInfo info) {
		TestMod.LOGGER.info("This line is printed by an example mod mixin!");
	}
}
