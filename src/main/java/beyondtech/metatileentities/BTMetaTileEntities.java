package beyondtech.metatileentities;

import beyondtech.BTMain;
import beyondtech.metatileentities.multiblock.electric.MetaTileEntityBiovat;
import beyondtech.metatileentities.multiblock.electric.MetaTileEntityVisBreaker;
import net.minecraft.util.ResourceLocation;

import static gregtech.common.metatileentities.MetaTileEntities.registerMetaTileEntity;

public class BTMetaTileEntities {

    // Multiblock
    public static MetaTileEntityBiovat BIO_VAT;
    public static MetaTileEntityVisBreaker VIS_BREAKER;

    // Singleblock

   // public static final SimpleMachineMetaTileEntity[] TEST_MACHINE = new SimpleMachineMetaTileEntity[GTValues.V.length - 1];

    public static void init() {
        //Multiblock
        BIO_VAT = registerMetaTileEntity(19998, new MetaTileEntityBiovat(beyondtechid("biovat")));
        VIS_BREAKER = registerMetaTileEntity(19997, new MetaTileEntityVisBreaker(beyondtechid("visbreaker")));

        //Singleblock

        //19976-19990
    }

    private static ResourceLocation beyondtechid(String name) {
        return new ResourceLocation(BTMain.ID, name);
    }

}
