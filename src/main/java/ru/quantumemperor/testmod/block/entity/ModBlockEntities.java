package ru.quantumemperor.testmod.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import ru.quantumemperor.testmod.block.ModBlocks;

import static ru.quantumemperor.testmod.TestMod.MOD_ID;

public class ModBlockEntities {
    public static BlockEntityType<MythrilBlasterBlockEntity> MYTHRIL_BLASTER;

    public static void register(){
        MYTHRIL_BLASTER = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(MOD_ID, "mythril_blaster"), FabricBlockEntityTypeBuilder.create(MythrilBlasterBlockEntity::new, ModBlocks.MYTHRIL_BLASTER_BLOCK).build(null));
    }
}
