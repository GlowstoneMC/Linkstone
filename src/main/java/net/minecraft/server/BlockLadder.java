package net.minecraft.server;

import java.util.Iterator;

public class BlockLadder extends Block {

    public static final BlockStateDirection FACING = null;

    protected static final AxisAlignedBB b = null;

    protected static final AxisAlignedBB c = null;

    protected static final AxisAlignedBB d = null;

    protected static final AxisAlignedBB e = null;

    protected BlockLadder() {
    }

    public AxisAlignedBB a(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    public boolean b(IBlockData iblockdata) {
        return false;
    }

    public boolean c(IBlockData iblockdata) {
        return false;
    }

    public boolean canPlace(World world, BlockPosition blockposition) {
        return false;
    }

    public IBlockData getPlacedState(World world, BlockPosition blockposition, EnumDirection enumdirection, float f, float f1, float f2, int i, EntityLiving entityliving) {
        return null;
    }

    public void a(IBlockData iblockdata, World world, BlockPosition blockposition, Block block) {
    }

    protected boolean a(World world, BlockPosition blockposition, EnumDirection enumdirection) {
        return false;
    }

    public IBlockData fromLegacyData(int i) {
        return null;
    }

    public int toLegacyData(IBlockData iblockdata) {
        return 0;
    }

    public IBlockData a(IBlockData iblockdata, EnumBlockRotation enumblockrotation) {
        return null;
    }

    public IBlockData a(IBlockData iblockdata, EnumBlockMirror enumblockmirror) {
        return null;
    }

    protected BlockStateList getStateList() {
        return null;
    }

    static class SyntheticClass_1 {

        static final int[] a = null;

        static {
        }
    }
}
