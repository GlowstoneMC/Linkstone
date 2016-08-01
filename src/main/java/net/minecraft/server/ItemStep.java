package net.minecraft.server;

public class ItemStep extends ItemBlock {

    private final BlockStepAbstract b;

    private final BlockStepAbstract c;

    public ItemStep(Block block, BlockStepAbstract blockstepabstract, BlockStepAbstract blockstepabstract1) {
    }

    public int filterData(int i) {
        return 0;
    }

    public String f_(ItemStack itemstack) {
        return null;
    }

    public EnumInteractionResult a(ItemStack itemstack, EntityHuman entityhuman, World world, BlockPosition blockposition, EnumHand enumhand, EnumDirection enumdirection, float f, float f1, float f2) {
        return null;
    }

    private boolean a(EntityHuman entityhuman, ItemStack itemstack, World world, BlockPosition blockposition, Object object) {
        return false;
    }

    protected <T extends Comparable<T>> IBlockData a(IBlockState<T> iblockstate, Comparable<?> comparable) {
        return null;
    }
}
