package beyondtech.item;

import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.properties.BlastProperty.GasTier;
import gregtech.api.unification.material.info.MaterialIconSet;

import static gregtech.api.GTValues.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;

public class BTMaterials  {

    public static final MaterialIconSet SHINY = MaterialIconSet.SHINY;
    public static final MaterialIconSet METALLIC = MaterialIconSet.METALLIC;

    //Registering them

    public static Material end_steel;
    public static Material electrical_steel;
    public static Material dark_steel;
    public static Material pulsating_iron;
    public static Material conductive_iron;
    public static Material redstone_alloy;
    public static Material vibrant_alloy;
    public static Material energetic_alloy;
    public static Material soularium;
    public static Material crystalline_alloy;
    public static Material melodic_alloy;
    public static Material crystalline_pink_slime;
    public static Material energetic_silver;
    public static Material cosmic_neutronium;
    public static Material vivid_alloy;















    //Adding Materials
    public static void init() {
        end_steel = new Material.Builder(32500, "end_steel")
                .ingot()
                .color(0xdbd986)
                    //CEu uses the hex color code, but make sure to put 0x before the hex color
                .iconSet(METALLIC)
                    //gregtech/api/unification/material/info/MaterialIconSet.java
                .flags(GENERATE_FRAME, GENERATE_SMALL_GEAR, GENERATE_FOIL, GENERATE_GEAR)
                    //Flags, you can find all of them at gregtech/api/unification/material/info/MaterialFlags.java
                .components(Iron, 1, Carbon, 1, Titanium, 1)
                    //You can find all materials on gregtech/api/unification/material/Materials.java
                .itemPipeProperties(8192, 1)
                    //Priority, transferRate
                .cableProperties(VA[IV], 4, 45, false, 78)
                    //Voltage, Amps, EnergyLoss, isSuperConductor, CriticalTemp
                .blastTemp(4500, GasTier.HIGHER, VA[LuV], 600)
                    //Temp, GasTier, eutOverride, durationOveride (in ticks)
                .build();

        dark_steel = new Material.Builder(32501, "dark_steel")
                .ingot()
                .color(0x363636)
                .iconSet(METALLIC)
                .flags(GENERATE_FRAME, GENERATE_SMALL_GEAR, GENERATE_FOIL, GENERATE_GEAR)
                .components(Iron, 1, Carbon, 1, Titanium, 1)
                .itemPipeProperties(8192, 1)
                .cableProperties(VA[IV], 4, 45, false, 78)
                .blastTemp(4500, GasTier.HIGHER, VA[LuV], 600)
                .build();

        electrical_steel = new Material.Builder(32502, "electrical_steel")
                .ingot()
                .color(0xa7b5b4)
                .iconSet(SHINY)
                .flags(GENERATE_FRAME, GENERATE_SMALL_GEAR, GENERATE_FOIL, GENERATE_GEAR)
                .components(Iron, 1, Carbon, 1, Silicon, 1)
                .itemPipeProperties(8192, 1)
                .cableProperties(VA[EV], 4, 56, false, 78)
                .blastTemp(4500, GasTier.HIGHER, VA[IV], 600)
                .build();

        pulsating_iron = new Material.Builder(32503, "pulsating_iron")
                .ingot()
                .color(0x96d996)
                .iconSet(METALLIC)
                .flags(GENERATE_FRAME, GENERATE_SMALL_GEAR, GENERATE_FOIL, GENERATE_GEAR)
                .components(Iron, 2, EnderPearl, 1, BlueSteel, 1)
                .itemPipeProperties(8192, 2)
                .cableProperties(VA[HV], 4, 4, false, 78)
                .blastTemp(1200, GasTier.LOW, VA[MV], 250)
                .build();

        conductive_iron = new Material.Builder(32504, "conductive_iron")
                .ingot()
                .color(0xe3b1b8)
                .iconSet(METALLIC)
                .flags(GENERATE_FRAME, GENERATE_SMALL_GEAR, GENERATE_FOIL, GENERATE_GEAR)
                .components(Iron, 2, EnderPearl, 1, BlueSteel, 1)
                .itemPipeProperties(8192, 2)
                .cableProperties(VA[HV], 4, 4, false, 78)
                .blastTemp(1200, GasTier.LOW, VA[MV], 250)
                .build();

        redstone_alloy = new Material.Builder(32505, "redstone_alloy")
                .ingot()
                .color(0xa31d1d)
                .iconSet(METALLIC)
                .flags(GENERATE_FRAME, GENERATE_SMALL_GEAR, GENERATE_FOIL, GENERATE_GEAR)
                .components(Iron, 2, EnderPearl, 1, BlueSteel, 1)
                .itemPipeProperties(8192, 2)
                .cableProperties(VA[HV], 4, 4, false, 78)
                .blastTemp(1200, GasTier.LOW, VA[MV], 250)
                .build();

        vibrant_alloy = new Material.Builder(32506, "vibrant_alloy")
                .ingot()
                .color(0xaade52)
                .iconSet(SHINY)
                .flags(GENERATE_FRAME, GENERATE_SMALL_GEAR, GENERATE_FOIL, GENERATE_GEAR)
                .components(Iron, 1, Gold, 1, EnderPearl, 1)
                .itemPipeProperties(16000, 4)
                .cableProperties(VA[EV], 8, 2, false, 78)
                .blastTemp(3500, GasTier.HIGH, VA[IV], 800)
                .build();

        energetic_alloy = new Material.Builder(32507, "energetic_alloy")
                .ingot()
                .color(0xdb8246)
                .iconSet(SHINY)
                .flags(GENERATE_FRAME, GENERATE_SMALL_GEAR, GENERATE_FOIL, GENERATE_GEAR)
                .components(Iron, 1, Gold, 1, Copper, 1)
                .itemPipeProperties(16000, 4)
                .cableProperties(VA[HV], 8, 2, false, 78)
                .blastTemp(2999, GasTier.HIGH, VA[EV], 150)
                .build();

        soularium = new Material.Builder(32508, "soularium")
                .ingot()
                .color(0x6e4d2d)
                .iconSet(METALLIC)
                .flags(GENERATE_FRAME, GENERATE_SMALL_GEAR, GENERATE_FOIL, GENERATE_GEAR)
                .components(Iron, 1, Gold, 1, Copper, 1)
                .itemPipeProperties(200, 1)
                .cableProperties(VA[IV], 2, 16, false, 78)
                .blastTemp(1299, GasTier.HIGH, VA[EV], 150)
                .build();

        crystalline_alloy = new Material.Builder(32509, "crystalline_alloy")
                .ingot()
                .color(0xadd7db)
                .iconSet(METALLIC)
                .flags(GENERATE_FRAME, GENERATE_SMALL_GEAR, GENERATE_FOIL, GENERATE_GEAR)
                .components(Iron, 1, Gold, 1, Copper, 1)
                .itemPipeProperties(200, 1)
                .cableProperties(VA[IV], 2, 16, false, 78)
                .blastTemp(4500, GasTier.HIGH, VA[LuV], 600)
                .build();

        melodic_alloy = new Material.Builder(32510, "melodic_alloy")
                .ingot()
                .color(0xc796d4)
                .iconSet(METALLIC)
                .flags(GENERATE_FRAME, GENERATE_SMALL_GEAR, GENERATE_FOIL, GENERATE_GEAR)
                .components(Iron, 1, Gold, 1, Copper, 1)
                .itemPipeProperties(200, 1)
                .cableProperties(VA[LuV], 4, 16, false, 78)
                .blastTemp(4500, GasTier.HIGH, VA[LuV], 800)
                .build();

        crystalline_pink_slime = new Material.Builder(32513, "crystalline_pink_slime")
                .ingot()
                .color(0xc796d4)
                .iconSet(METALLIC)
                .flags(GENERATE_FRAME, GENERATE_SMALL_GEAR, GENERATE_FOIL, GENERATE_GEAR)
                .components(Iron, 1, Gold, 1, Copper, 1)
                .itemPipeProperties(200, 1)
                .cableProperties(VA[ZPM], 4, 16, false, 78)
                .blastTemp(4500, GasTier.HIGH, VA[LuV], 1200)
                .build();

        energetic_silver = new Material.Builder(32511, "energetic_silver")
                .ingot()
                .color(0x73afc7)
                .iconSet(METALLIC)
                .flags(GENERATE_FRAME, GENERATE_SMALL_GEAR, GENERATE_FOIL, GENERATE_GEAR)
                .components(Iron, 1, Gold, 1, Copper, 1)
                .itemPipeProperties(200, 1)
                .cableProperties(VA[ZPM], 4, 16, false, 78)
                .blastTemp(4500, GasTier.HIGH, VA[LuV], 1200)
                .build();

        vivid_alloy = new Material.Builder(32512, "vivid_alloy")
                .ingot()
                .color(0x46b4db)
                .iconSet(METALLIC)
                .flags(GENERATE_FRAME, GENERATE_SMALL_GEAR, GENERATE_FOIL, GENERATE_GEAR)
                .components(Iron, 1, Gold, 1, Copper, 1)
                .itemPipeProperties(200, 1)
                .cableProperties(VA[ZPM], 4, 16, false, 78)
                .blastTemp(4500, GasTier.HIGH, VA[LuV], 1200)
                .build();

        cosmic_neutronium = new Material.Builder(32514, "cosmic_neutronium")
                .ingot()
                .color(0x202020)
                .iconSet(METALLIC)
                .flags(GENERATE_FRAME, GENERATE_SMALL_GEAR, GENERATE_FOIL, GENERATE_GEAR)
                .components(Neutronium, 1)
                .itemPipeProperties(200, 32)
                .cableProperties(VA[UEV], 4, 16, false, 78)
                .blastTemp(8900, GasTier.HIGHEST, VA[UEV], 1300)
                .build();






    }
}


