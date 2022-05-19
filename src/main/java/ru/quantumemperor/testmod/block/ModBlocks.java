package ru.quantumemperor.testmod.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import ru.quantumemperor.testmod.TestMod;

import static ru.quantumemperor.testmod.TestMod.MOD_ID;

public class ModBlocks {
    public static final Block DEEPSLATE_MYTHRIL_ORE = ModBlocks.register("deepslate_mythril_ore", new Block(FabricBlockSettings.of(Material.METAL, MapColor.CYAN).strength(5.0F)));
    public static final Block MYTHRIL_ORE = ModBlocks.register("mythril_ore", new Block(FabricBlockSettings.of(Material.METAL, MapColor.CYAN).strength(3.5F)));
    public static final Block NETHERRACK_MYTHRIL_ORE = ModBlocks.register("netherrack_mythril_ore", new Block(FabricBlockSettings.of(Material.METAL, MapColor.CYAN).strength(3.5F)));
    public static final Block RAW_MYTHRIL_BLOCK = ModBlocks.register("raw_mythril_block", new Block(FabricBlockSettings.of(Material.METAL, MapColor.CYAN).strength(4.5F)));
    public static final Block MYTHRIL_BLOCK = ModBlocks.register("mythril_block", new Block(FabricBlockSettings.of(Material.METAL, MapColor.CYAN).strength(5F)));
    public static final Block MYTHRIL_BLASTER_BLOCK = ModBlocks.register("mythril_blaster", new MythrilBlasterBlock(FabricBlockSettings.of(Material.METAL).strength(5)));
    private static Block register(String id, Block block){
        return Registry.register(Registry.BLOCK, new Identifier(MOD_ID, id), block);
    }

    public static void registerBlocks(){
        TestMod.LOGGER.info("Register blocks for " + MOD_ID);
    }
}
