package net.minecraft.server;

public class BlockRotatable extends Block {

    public static final BlockStateEnum<EnumDirection.EnumAxis> AXIS;

    protected BlockRotatable(Material material) {
    }

    protected BlockRotatable(Material material, MaterialMapColor materialmapcolor) {
    }

    public IBlockData a(IBlockData iblockdata, EnumBlockRotation enumblockrotation) {
        return null;
    }

    public IBlockData fromLegacyData(int i) {
        return null;
    }

    public int toLegacyData(IBlockData iblockdata) {
        return 0;
    }

    protected BlockStateList getStateList() {
        return null;
    }

    protected ItemStack u(IBlockData iblockdata) {
        return null;
    }

    public IBlockData getPlacedState(World world, BlockPosition blockposition, EnumDirection enumdirection, float f, float f1, float f2, int i, EntityLiving entityliving) {
        return null;
    }

    static class SyntheticClass_1 {

        static final int[] a;

        static final int[] b;

        static {
        }
    }
}
