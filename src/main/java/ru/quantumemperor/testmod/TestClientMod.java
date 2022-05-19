package ru.quantumemperor.testmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.minecraft.client.render.RenderLayer;
import ru.quantumemperor.testmod.block.ModBlocks;
import ru.quantumemperor.testmod.screen.ModScreenHandler;
import ru.quantumemperor.testmod.screen.MythrilBlasterScreen;

@Environment(EnvType.CLIENT)
public class TestClientMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MYTHRIL_BLASTER_BLOCK, RenderLayer.getCutout());
        ScreenRegistry.register(ModScreenHandler.MYTHRIL_BLASTER_SCREEN_HANDLER, MythrilBlasterScreen::new);
    }
}
