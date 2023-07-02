package beyondtech.metatileentities.multiblock.electric;

import beyondtech.recipe.BTRecipeMaps;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.Textures;
import gregtech.common.blocks.BlockMetalCasing.MetalCasingType;
import gregtech.common.blocks.MetaBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nonnull;

import static gregtech.api.unification.material.Materials.Steel;

public class MetaTileEntityVisBreaker extends RecipeMapMultiblockController {
    public MetaTileEntityVisBreaker(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, BTRecipeMaps.TEST_RECIPES);
    }


    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
        return new MetaTileEntityVisBreaker(metaTileEntityId);
    }
    @Override
    protected BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start()
                .aisle("#####", "FCCCF", "FCCCF", "FCCCF", "F###F", "FCCCF", "FCCCF", "FCCCF", "F###F", "FCCCF", "FCCCF", "FCCCF", "F###F", "FCCCF", "FCCCF", "FCECF", "FCCCF")
                .aisle("#CCC#", "C###C", "C###C", "C###C", "#CCC#", "C###C", "C###C", "C###C", "#CCC#", "C###C", "C###C", "C###C", "#CCC#", "C###C", "C###C", "C###C", "CCCCC")
                .aisle("#CCC#", "C###C", "C###C", "C###C", "#CCC#", "C###C", "C###C", "C###C", "#CCC#", "C###C", "C###C", "C###C", "#CCC#", "C###C", "C###C", "C###C", "CCCCC")
                .aisle("#CCC#", "C###C", "C###C", "C###C", "#CCC#", "C###C", "C###C", "C###C", "#CCC#", "C###C", "C###C", "C###C", "#CCC#", "C###C", "C###C", "C###C", "CCCCC")
                .aisle("#####", "FCCCF", "FCCCF", "FCCCF", "F###F", "FCCCF", "FCCCF", "FCCCF", "F###F", "FCCCF", "FCCCF", "FCCCF", "F###F", "FCCCF", "FCCCF", "FCCCF", "FCCCF")
                .where('E', selfPredicate())
                .where('C', states(getCasingState()).setMinGlobalLimited(35).or(autoAbilities()))
                .where('F',states(getFrameState()))
                .where('#', air())
                .build();
    }
    protected IBlockState getFrameState() {
        return MetaBlocks.FRAMES.get(Steel).getBlock(Steel);
    }
    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart sourcePart) {
        return Textures.SOLID_STEEL_CASING;
    }

    protected IBlockState getCasingState() {
        return MetaBlocks.METAL_CASING.getState(MetalCasingType.STEEL_SOLID);
    }

    @Nonnull
    @Override
    protected ICubeRenderer getFrontOverlay() {
        return Textures.BLAST_FURNACE_OVERLAY;
    }
}