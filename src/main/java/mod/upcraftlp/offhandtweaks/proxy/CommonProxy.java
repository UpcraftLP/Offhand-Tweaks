package mod.upcraftlp.offhandtweaks.proxy;

import mod.upcraftlp.offhandtweaks.Reference;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import core.upcraftlp.craftdev.api.util.UpdateChecker;

/**
 * @author UpcraftLP
 */
public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
        if(Loader.isModLoaded("craftdevcore")) UpdateChecker.registerMod(Reference.MODID);
    }

    public void init(FMLInitializationEvent event) {
        
    }

    public void postInit(FMLPostInitializationEvent event) {
        
    }

    public void serverStarting(FMLServerStartingEvent event) {
        
    }
}
