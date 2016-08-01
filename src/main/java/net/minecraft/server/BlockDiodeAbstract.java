package net.minecraft.server;

import java.util.Random;
import org.bukkit.craftbukkit.event.CraftEventFactory;

// CraftBukkit
public abstract class BlockDiodeAbstract extends BlockFacingHorizontal {

    protected static final AxisAlignedBB c;

    protected final boolean d;

    protected BlockDiodeAbstract(boolean flag) {
    }

    public AxisAlignedBB a(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    public boolean c(IBlockData iblockdata) {
        return false;
    }

    public boolean canPlace(World world, BlockPosition blockposition) {
        return false;
    }

    public boolean b(World world, BlockPosition blockposition) {
        return false;
    }

    public void a(World world, BlockPosition blockposition, IBlockData iblockdata, Random random) {
    }

    public void b(World world, BlockPosition blockposition, IBlockData iblockdata, Random random) {
    }

    protected boolean z(IBlockData iblockdata) {
        return false;
    }

    public int c(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition, EnumDirection enumdirection) {
        return 0;
    }

    public int b(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition, EnumDirection enumdirection) {
        return 0;
    }

    public void a(IBlockData iblockdata, World world, BlockPosition blockposition, Block block) {
    }

    protected void g(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    public boolean b(IBlockAccess iblockaccess, BlockPosition blockposition, IBlockData iblockdata) {
        return false;
    }

    protected boolean e(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return false;
    }

    protected int f(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return 0;
    }

    protected int c(IBlockAccess iblockaccess, BlockPosition blockposition, IBlockData iblockdata) {
        return 0;
    }

    protected int b(IBlockAccess iblockaccess, BlockPosition blockposition, EnumDirection enumdirection) {
        return 0;
    }

    public boolean isPowerSource(IBlockData iblockdata) {
        return false;
    }

    public IBlockData getPlacedState(World world, BlockPosition blockposition, EnumDirection enumdirection, float f, float f1, float f2, int i, EntityLiving entityliving) {
        return null;
    }

    public void postPlace(World world, BlockPosition blockposition, IBlockData iblockdata, EntityLiving entityliving, ItemStack itemstack) {
    }

    public void onPlace(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    protected void h(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    public void postBreak(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    public boolean b(IBlockData iblockdata) {
        return false;
    }

    protected boolean A(IBlockData iblockdata) {
        return false;
    }

    protected int a(IBlockAccess iblockaccess, BlockPosition blockposition, IBlockData iblockdata) {
        return 0;
    }

    public static boolean isDiode(IBlockData iblockdata) {
        return false;
    }

    public boolean C(IBlockData iblockdata) {
        return false;
    }

    public boolean i(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return false;
    }

    protected int D(IBlockData iblockdata) {
        return 0;
    }

    protected abstract int i(IBlockData iblockdata);

    protected abstract IBlockData x(IBlockData iblockdata);

    protected abstract IBlockData y(IBlockData iblockdata);

    public boolean b(Block block) {
        return false;
    }
}
