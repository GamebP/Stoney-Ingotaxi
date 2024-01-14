package lol.skydash.stoneyingotaxi;

import net.minecraftforge.common.MinecraftForge;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import lol.skydash.stoneyingotaxi.init.RegisterItems;
import lol.skydash.stoneyingotaxi.proxy.CommonProxy;
import lol.skydash.stoneyingotaxi.utils.Reference;
import lol.skydash.stoneyingotaxi.utils.ShovelaxiTabIngot;

@Mod(
    modid = Reference.MOD_ID,
    name = Reference.MOD_NAME,
    version = Reference.MOD_VERSION,
    acceptedMinecraftVersions = Reference.MC_VERSION)
public class StoneyIngotaxi {

    @Mod.Instance(Reference.MOD_ID)
    public static StoneyIngotaxi instance;
    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static CommonProxy proxy;
    public static ShovelaxiTabIngot IngotaxiTabIngot = new ShovelaxiTabIngot("stoneyingotaxiTab");

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
        RegisterItems.init();
        RegisterItems.register();
    }

    public static class WorldLoadHandler {

    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event) {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(proxy);
        proxy.registerRenders();
        proxy.registerEntities();
    }
}
