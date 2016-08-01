package net.minecraft.server;

import java.util.Iterator;
import java.util.Random;
import javax.annotation.Nullable;
import org.bukkit.craftbukkit.event.CraftEventFactory;

// CraftBukkit
public class BlockVine extends Block {

    public static final BlockStateBoolean UP = null;

    public static final BlockStateBoolean NORTH = null;

    public static final BlockStateBoolean EAST = null;

    public static final BlockStateBoolean SOUTH = null;

    public static final BlockStateBoolean WEST = null;

    public static final BlockStateBoolean[] f = null;

    protected static final AxisAlignedBB g = null;

    protected static final AxisAlignedBB B = null;

    protected static final AxisAlignedBB C = null;

    protected static final AxisAlignedBB D = null;

    protected static final AxisAlignedBB E = null;

    public BlockVine() {
    }

    @Nullable
    public AxisAlignedBB a(IBlockData iblockdata, World world, BlockPosition blockposition) {
        return null;
    }

    public AxisAlignedBB a(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    public IBlockData updateState(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    public boolean b(IBlockData iblockdata) {
        return false;
    }

    public boolean c(IBlockData iblockdata) {
        return false;
    }

    public boolean a(IBlockAccess iblockaccess, BlockPosition blockposition) {
        return false;
    }

    public boolean canPlace(World world, BlockPosition blockposition, EnumDirection enumdirection) {
        return false;
    }

    private boolean x(IBlockData iblockdata) {
        return false;
    }

    private boolean e(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return false;
    }

    public void a(IBlockData iblockdata, World world, BlockPosition blockposition, Block block) {
    }

    public void b(World world, BlockPosition blockposition, IBlockData iblockdata, Random random) {
    }

    public IBlockData getPlacedState(World world, BlockPosition blockposition, EnumDirection enumdirection, float f, float f1, float f2, int i, EntityLiving entityliving) {
        return null;
    }

    @Nullable
    public Item getDropType(IBlockData iblockdata, Random random, int i) {
        return null;
    }

    public int a(Random random) {
        return 0;
    }

    public void a(World world, EntityHuman entityhuman, BlockPosition blockposition, IBlockData iblockdata, @Nullable TileEntity tileentity, @Nullable ItemStack itemstack) {
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

    public IBlockData a(IBlockData iblockdata, EnumBlockRotation enumblockrotation) {
        return null;
    }

    public IBlockData a(IBlockData iblockdata, EnumBlockMirror enumblockmirror) {
        return null;
    }

    public static BlockStateBoolean getDirection(EnumDirection enumdirection) {
        return null;
    }

    public static int i(IBlockData iblockdata) {
        return 0;
    }

    static class SyntheticClass_1 {

        static final int[] a = null;

        static final int[] b = null;

        static final int[] c = null;

        static {
        }
    }
}
