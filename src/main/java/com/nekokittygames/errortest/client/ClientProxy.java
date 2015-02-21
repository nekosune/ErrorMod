package com.nekokittygames.errortest.client;

import com.nekokittygames.errortest.CommonProxy;
import com.nekokittygames.errortest.ErrorMod;
import com.nekokittygames.errortest.FumeTool;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

/**
 * Created by Katrina on 21/02/2015.
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
        if (Loader.isModLoaded("ComputerCraft")) {
            MinecraftForge.EVENT_BUS.register(new FumeTool());
        }
        ErrorMod.log.info("I am a Client proxy loading!");

    }
}
