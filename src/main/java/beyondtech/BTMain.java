package beyondtech;

import beyondtech.item.BTMaterials;
import beyondtech.item.BTMetaItems;
import beyondtech.recipe.BTRecipes;
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

@Mod(modid = BTMain.ID,
        name = BTMain.NAME,
        version = BTMain.VERSION,
        dependencies = GTValues.MOD_VERSION_DEP)
public class BTMain {

    public static final String ID = "beyondtech";
    public static final String NAME = "BeyondTech";
    public static final String VERSION = "0.0.3";

    @EventHandler
    public void onConstruction(FMLConstructionEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        BTMetaItems.preInit();
    }

    @SubscribeEvent
    public void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        BTRecipes.init();
    }

    @SubscribeEvent
    public void registerMaterials(GregTechAPI.MaterialEvent event) {
        BTMaterials.init();
    }
}
