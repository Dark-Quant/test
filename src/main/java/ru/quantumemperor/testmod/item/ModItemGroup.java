package ru.quantumemperor.testmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import static ru.quantumemperor.testmod.TestMod.MOD_ID;

public class ModItemGroup {
    public static final ItemGroup MYTHRIL = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "mythril"), ()-> new ItemStack(ModItems.MYTHRIL_INGOT));
}
