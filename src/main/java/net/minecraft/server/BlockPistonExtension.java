package net.minecraft.server;

import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class BlockPistonExtension extends BlockDirectional {

    public static final BlockStateEnum<BlockPistonExtension.EnumPistonType> TYPE = null;

    public static final BlockStateBoolean SHORT = null;

    protected static final AxisAlignedBB c = null;

    protected static final AxisAlignedBB d = null;

    protected static final AxisAlignedBB e = null;

    protected static final AxisAlignedBB f = null;

    protected static final AxisAlignedBB g = null;

    protected static final AxisAlignedBB B = null;

    protected static final AxisAlignedBB C = null;

    protected static final AxisAlignedBB D = null;

    protected static final AxisAlignedBB E = null;

    protected static final AxisAlignedBB F = null;

    protected static final AxisAlignedBB G = null;

    protected static final AxisAlignedBB I = null;

    public BlockPistonExtension() {
    }

    public AxisAlignedBB a(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    public void a(IBlockData iblockdata, World world, BlockPosition blockposition, AxisAlignedBB axisalignedbb, List<AxisAlignedBB> list, @Nullable Entity entity) {
    }

    private AxisAlignedBB i(IBlockData iblockdata) {
        return null;
    }

    public boolean k(IBlockData iblockdata) {
        return false;
    }

    public void a(World world, BlockPosition blockposition, IBlockData iblockdata, EntityHuman entityhuman) {
    }

    public void remove(World world, BlockPosition blockposition, IBlockData iblockdata) {
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

    public boolean canPlace(World world, BlockPosition blockposition, EnumDirection enumdirection) {
        return false;
    }

    public int a(Random random) {
        return 0;
    }

    public void a(IBlockData iblockdata, World world, BlockPosition blockposition, Block block) {
    }

    @Nullable
    public static EnumDirection e(int i) {
        return null;
    }

    public ItemStack a(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return null;
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

    public static enum EnumPistonType implements INamable {

        DEFAULT("normal"), STICKY("sticky");

        private final String c = null;

        private EnumPistonType(String s) {
        }

        public String toString() {
            return null;
        }

        public String getName() {
            return null;
        }
    }
}
