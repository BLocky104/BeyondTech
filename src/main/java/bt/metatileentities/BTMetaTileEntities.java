package bt.metatileentities;

import bt.BTMain;
import gregtech.api.GTValues;
import gregtech.api.metatileentity.SimpleMachineMetaTileEntity;
import bt.metatileentities.multiblock.MetaTileEntityBiovat;
import bt.metatileentities.multiblock.MetaTileEntityVisBreaker;
import net.minecraft.util.ResourceLocation;

import static gregtech.common.metatileentities.MetaTileEntities.registerMetaTileEntity;

public class BTMetaTileEntities {

    // Multiblock
    public static MetaTileEntityBiovat BIO_VAT;
    public static MetaTileEntityVisBreaker VIS_BREAKER;

    // Singleblock

    public static final SimpleMachineMetaTileEntity[] TEST_MACHINE = new SimpleMachineMetaTileEntity[GTValues.V.length - 1];

    public static void init() {
        //Multiblock
        BIO_VAT = registerMetaTileEntity(19999, new MetaTileEntityBiovat(beyondtechId("biovat")));
        VIS_BREAKER = registerMetaTileEntity(19996, new MetaTileEntityVisBreaker(beyondtechId("visbreaker")));

        //Singleblock

        //19976-19990
    }

    private static ResourceLocation beyondtechId(String name) {
        return new ResourceLocation(BTMain.ID, name);
    }

}
