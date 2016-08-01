package net.minecraft.server;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class BlockStairs extends Block {

    public static final BlockStateDirection FACING;

    public static final BlockStateEnum<BlockStairs.EnumHalf> HALF;

    public static final BlockStateEnum<BlockStairs.EnumStairShape> SHAPE;

    protected static final AxisAlignedBB d;

    protected static final AxisAlignedBB e;

    protected static final AxisAlignedBB f;

    protected static final AxisAlignedBB g;

    protected static final AxisAlignedBB B;

    protected static final AxisAlignedBB C;

    protected static final AxisAlignedBB D;

    protected static final AxisAlignedBB E;

    protected static final AxisAlignedBB F;

    protected static final AxisAlignedBB G;

    protected static final AxisAlignedBB H;

    protected static final AxisAlignedBB I;

    protected static final AxisAlignedBB J;

    protected static final AxisAlignedBB K;

    protected static final AxisAlignedBB L;

    protected static final AxisAlignedBB M;

    protected static final AxisAlignedBB N;

    protected static final AxisAlignedBB O;

    private final Block P;

    private final IBlockData Q;

    protected BlockStairs(IBlockData iblockdata) {
    }

    public void a(IBlockData iblockdata, World world, BlockPosition blockposition, AxisAlignedBB axisalignedbb, List<AxisAlignedBB> list, @Nullable Entity entity) {
    }

    private static List<AxisAlignedBB> x(IBlockData iblockdata) {
        return null;
    }

    private static AxisAlignedBB y(IBlockData iblockdata) {
        return null;
    }

    private static AxisAlignedBB z(IBlockData iblockdata) {
        return null;
    }

    public boolean b(IBlockData iblockdata) {
        return false;
    }

    public boolean c(IBlockData iblockdata) {
        return false;
    }

    public void attack(World world, BlockPosition blockposition, EntityHuman entityhuman) {
    }

    public void postBreak(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    public float a(Entity entity) {
        return 0.0F;
    }

    public int a(World world) {
        return 0;
    }

    public Vec3D a(World world, BlockPosition blockposition, Entity entity, Vec3D vec3d) {
        return null;
    }

    public boolean n() {
        return false;
    }

    public boolean a(IBlockData iblockdata, boolean flag) {
        return false;
    }

    public boolean canPlace(World world, BlockPosition blockposition) {
        return false;
    }

    public void onPlace(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    public void remove(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    public void stepOn(World world, BlockPosition blockposition, Entity entity) {
    }

    public void b(World world, BlockPosition blockposition, IBlockData iblockdata, Random random) {
    }

    public boolean interact(World world, BlockPosition blockposition, IBlockData iblockdata, EntityHuman entityhuman, EnumHand enumhand, @Nullable ItemStack itemstack, EnumDirection enumdirection, float f, float f1, float f2) {
        return false;
    }

    public void wasExploded(World world, BlockPosition blockposition, Explosion explosion) {
    }

    public boolean k(IBlockData iblockdata) {
        return false;
    }

    public MaterialMapColor r(IBlockData iblockdata) {
        return null;
    }

    public IBlockData getPlacedState(World world, BlockPosition blockposition, EnumDirection enumdirection, float f, float f1, float f2, int i, EntityLiving entityliving) {
        return null;
    }

    @Nullable
    public MovingObjectPosition a(IBlockData iblockdata, World world, BlockPosition blockposition, Vec3D vec3d, Vec3D vec3d1) {
        return null;
    }

    public IBlockData fromLegacyData(int i) {
        return null;
    }

    public int toLegacyData(IBlockData iblockdata) {
        return 0;
    }

    public IBlockData updateState(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    private static BlockStairs.EnumStairShape d(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    private static boolean d(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition, EnumDirection enumdirection) {
        return false;
    }

    public static boolean i(IBlockData iblockdata) {
        return false;
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

        static final int[] a;

        static final int[] b;

        static final int[] c;

        static {
        }
    }

    public static enum EnumStairShape implements INamable {

        STRAIGHT("straight"), INNER_LEFT("inner_left"), INNER_RIGHT("inner_right"), OUTER_LEFT("outer_left"), OUTER_RIGHT("outer_right");

        private final String f;

        private EnumStairShape(String s) {
        }

        public String toString() {
            return null;
        }

        public String getName() {
            return null;
        }
    }

    public static enum EnumHalf implements INamable {

        TOP("top"), BOTTOM("bottom");

        private final String c;

        private EnumHalf(String s) {
        }

        public String toString() {
            return null;
        }

        public String getName() {
            return null;
        }
    }
}
