package com.nekokittygames.errortest;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

/**
 * Created by Katrina on 21/02/2015.
 */
@Mod(modid = ErrorMod.MODID, version = ErrorMod.VERSION)
public class ErrorMod {

    public static final String MODID = "errormod";
    public static final String VERSION = "1.0";
    @Mod.Instance(MODID)
    public static ErrorMod instance;

    @SidedProxy(clientSide = "com.nekokittygames.errortest.client.ClientProxy", serverSide = "com.nekokittygames.errortest.CommonProxy")
    public static CommonProxy proxy;

    public static Logger log;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        log = event.getModLog();
        proxy.preInit(event);
    }
}
