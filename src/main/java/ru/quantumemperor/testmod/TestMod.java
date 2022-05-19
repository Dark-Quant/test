package ru.quantumemperor.testmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.quantumemperor.testmod.block.ModBlocks;
import ru.quantumemperor.testmod.block.entity.ModBlockEntities;
import ru.quantumemperor.testmod.item.ModItems;
import ru.quantumemperor.testmod.util.ModRegistry;

public class TestMod implements ModInitializer {
	public static final String MOD_ID = "testmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ModBlocks.registerBlocks();
		ModItems.registerItems();

		ModRegistry.registerStuff();
		ModBlockEntities.register();
	}
}
