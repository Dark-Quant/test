package ru.quantumemperor.testmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import ru.quantumemperor.testmod.TestMod;
import ru.quantumemperor.testmod.block.ModBlocks;

import static ru.quantumemperor.testmod.TestMod.MOD_ID;

public class ModItems {
    public static final Item MYTHRIL_BLOCK = register(ModBlocks.MYTHRIL_BLOCK, ModItemGroup.MYTHRIL);
    public static final Item MYTHRIL_ORE = register(ModBlocks.MYTHRIL_ORE, ModItemGroup.MYTHRIL);
    public static final Item DEEPSLATE_MYTHRIL_ORE = register(ModBlocks.DEEPSLATE_MYTHRIL_ORE, ModItemGroup.MYTHRIL);
    public static final Item NETHERRACK_MYTHRIL_ORE = register(ModBlocks.NETHERRACK_MYTHRIL_ORE, ModItemGroup.MYTHRIL);
    public static final Item RAW_MYTHRIL_BLOCK = register(ModBlocks.RAW_MYTHRIL_BLOCK, ModItemGroup.MYTHRIL);
    public static final Item MYTHRIL_BLASTER_BLOCK = register(ModBlocks.MYTHRIL_BLASTER_BLOCK, ModItemGroup.MYTHRIL);
	public static final Item MYTHRIL_INGOT = register("mythril_ingot", new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL)));
	public static final Item MYTHRIL_NUGGET = register("mythril_nugget", new MythrilCaneItem(new FabricItemSettings().group(ModItemGroup.MYTHRIL)));
	public static final Item RAW_MYTHRIL = register("raw_mythril", new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL)));
	public static final Item RED_GEM = register("red_gem", new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL)));
    public static final Item FIRE_FUEL = register("fire_fuel", new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL)));

    private static Item register(String id, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, id), item);
    }
    private static Item register(Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, Registry.BLOCK.getId(block), new BlockItem(block, new FabricItemSettings().group(group)));
    }
    public static void registerItems(){
        TestMod.LOGGER.info("Registering Mod Items for " + MOD_ID);
    }
}
