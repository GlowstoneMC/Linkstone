package net.minecraft.server;

import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
// CraftBukkit start
import org.bukkit.event.block.BlockRedstoneEvent;
import org.bukkit.event.entity.EntityInteractEvent;

// CraftBukkit end
public abstract class BlockButtonAbstract extends BlockDirectional {

    public static final BlockStateBoolean POWERED = null;

    protected static final AxisAlignedBB b = null;

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

    private final boolean I = false;

    protected BlockButtonAbstract(boolean flag) {
    }

    @Nullable
    public AxisAlignedBB a(IBlockData iblockdata, World world, BlockPosition blockposition) {
        return null;
    }

    public int a(World world) {
        return 0;
    }

    public boolean b(IBlockData iblockdata) {
        return false;
    }

    public boolean c(IBlockData iblockdata) {
        return false;
    }

    public boolean canPlace(World world, BlockPosition blockposition, EnumDirection enumdirection) {
        return false;
    }

    public boolean canPlace(World world, BlockPosition blockposition) {
        return false;
    }

    protected static boolean a(World world, BlockPosition blockposition, EnumDirection enumdirection) {
        return false;
    }

    public IBlockData getPlacedState(World world, BlockPosition blockposition, EnumDirection enumdirection, float f, float f1, float f2, int i, EntityLiving entityliving) {
        return null;
    }

    public void a(IBlockData iblockdata, World world, BlockPosition blockposition, Block block) {
    }

    private boolean e(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return false;
    }

    public AxisAlignedBB a(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    public boolean interact(World world, BlockPosition blockposition, IBlockData iblockdata, EntityHuman entityhuman, EnumHand enumhand, @Nullable ItemStack itemstack, EnumDirection enumdirection, float f, float f1, float f2) {
        return false;
    }

    protected abstract void a(@Nullable EntityHuman entityhuman, World world, BlockPosition blockposition);

    protected abstract void b(World world, BlockPosition blockposition);

    public void remove(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    public int b(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition, EnumDirection enumdirection) {
        return 0;
    }

    public int c(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition, EnumDirection enumdirection) {
        return 0;
    }

    public boolean isPowerSource(IBlockData iblockdata) {
        return false;
    }

    public void a(World world, BlockPosition blockposition, IBlockData iblockdata, Random random) {
    }

    public void b(World world, BlockPosition blockposition, IBlockData iblockdata, Random random) {
    }

    public void a(World world, BlockPosition blockposition, IBlockData iblockdata, Entity entity) {
    }

    private void e(IBlockData iblockdata, World world, BlockPosition blockposition) {
    }

    private void c(World world, BlockPosition blockposition, EnumDirection enumdirection) {
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
