package ru.quantumemperor.testmod.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import ru.quantumemperor.testmod.TestMod;
import ru.quantumemperor.testmod.item.ModItems;

import static ru.quantumemperor.testmod.TestMod.MOD_ID;

public class ModRegistry {
    public static void registerStuff(){
        registerFuels();
    }

    private static void registerFuels(){
        TestMod.LOGGER.info("Register fuels for " + MOD_ID);
        FuelRegistry fuelRegistry = FuelRegistry.INSTANCE;
        fuelRegistry.add(ModItems.FIRE_FUEL, 250);
    }
}
