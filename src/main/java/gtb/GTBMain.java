package gtb;

import gtb.item.GTBMaterials;
import gtb.item.GTBMetaItems;
import gtb.recipe.GTBRecipes;
import gregtech.api.GTValues;
import gregtech.api.GregTechAPI;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = GTBMain.ID,
        name = GTBMain.NAME,
        version = GTBMain.VERSION,
        dependencies = GTValues.MOD_VERSION_DEP)
public class GTBMain {

    public static final String ID = "beyondtech";
    public static final String NAME = "Beyond Tech";
    public static final String VERSION = "1.0.0";

    @EventHandler
    public void onConstruction(FMLConstructionEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        GTBMetaItems.preInit();
    }

    @SubscribeEvent
    public void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        GTBRecipes.init();
    }

    @SubscribeEvent
    public void registerMaterials(GregTechAPI.MaterialEvent event) {
        GTBMaterials.init();
    }
}
