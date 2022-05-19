package ru.quantumemperor.testmod.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

import static ru.quantumemperor.testmod.TestMod.MOD_ID;

public class ModScreenHandler {
    public static final ScreenHandlerType<MythrilBlasterScreenHandler> MYTHRIL_BLASTER_SCREEN_HANDLER =
            ScreenHandlerRegistry.registerSimple(new Identifier(MOD_ID, "mythril_blaster"), MythrilBlasterScreenHandler::new);

}
