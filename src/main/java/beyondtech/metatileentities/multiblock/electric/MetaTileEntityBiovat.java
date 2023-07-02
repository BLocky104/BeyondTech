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
import gregtech.common.blocks.BlockGlassCasing;
import gregtech.common.blocks.BlockMetalCasing.MetalCasingType;
import gregtech.common.blocks.MetaBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nonnull;

public class MetaTileEntityBiovat extends RecipeMapMultiblockController {
    public MetaTileEntityBiovat(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, BTRecipeMaps.TEST_RECIPES);
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
        return new MetaTileEntityBiovat(metaTileEntityId);
    }

    @Override
    protected BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start()
                .aisle("CCECC", "GGGGG", "GGGGG", "CCCCC")
                .aisle("CCCCC", "G###G", "G###G", "CCCCC")
                .aisle("CCCCC", "G###G", "G###G", "CCCCC")
                .aisle("CCCCC", "G###G", "G###G", "CCCCC")
                .aisle("CCCCC", "GGGGG", "GGGGG", "CCCCC")
                .where('E', selfPredicate())
                .where('C', states(getCasingState()).setMinGlobalLimited(25).or(autoAbilities()))
                .where('G',states(MetaBlocks.TRANSPARENT_CASING.getState(BlockGlassCasing.CasingType.LAMINATED_GLASS)))

                        .where('#', air())
                .build();
    }

    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart sourcePart) {
        return Textures.CLEAN_STAINLESS_STEEL_CASING;
    }

    protected IBlockState getCasingState() {
        return MetaBlocks.METAL_CASING.getState(MetalCasingType.STAINLESS_CLEAN);
    }

    @Nonnull
    @Override
    protected ICubeRenderer getFrontOverlay() {
        return Textures.CHEMICAL_BATH_OVERLAY;
    }
}

