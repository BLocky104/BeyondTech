package gtb.metatileentities;


import gregtech.api.GTValues;
import gregtech.api.metatileentity.SimpleMachineMetaTileEntity;
import gtb.metatileentities.multiblock.MetaTileEntityBiovat;
import gtb.metatileentities.multiblock.MetaTileEntityVisBreaker;
import net.minecraft.util.ResourceLocation;

import static gregtech.common.metatileentities.MetaTileEntities.registerMetaTileEntity;

public class ExampleMetaTileEntities {

    // Multiblock
    public static MetaTileEntityBiovat BIO_VAT;
    public static MetaTileEntityVisBreaker VIS_BREAKER;

    // Singleblock

    public static final SimpleMachineMetaTileEntity[] TEST_MACHINE = new SimpleMachineMetaTileEntity[GTValues.V.length - 1];

    public static void init() {
        //Multiblock
        BIO_VAT = registerMetaTileEntity(19999, new MetaTileEntityBiovat(exampleId("biovat")));
        VIS_BREAKER = registerMetaTileEntity(19996, new MetaTileEntityVisBreaker(exampleId("visbreaker")));

        //Singleblock

        //19976-19990
    }

    private static ResourceLocation exampleId(String name) {
        return new ResourceLocation(Gregtech.ID, name);
    }

}
