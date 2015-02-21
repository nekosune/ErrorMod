package com.nekokittygames.errortest;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import dan200.computercraft.api.ComputerCraftAPI;

/**
 * Created by Katrina on 21/02/2015.
 */
public class CommonProxy {


    public void preInit(FMLPreInitializationEvent event)
    {
        ErrorMod.log.info("I am A Common Proxy loading!");
        if (Loader.isModLoaded("ComputerCraft")) {
            initCCPeripherals();
        }


    }


    protected void initCCPeripherals() {
        ComputerCraftAPI.registerTurtleUpgrade(new FumeTool());
    }
}
