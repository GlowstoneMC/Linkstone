package net.minecraft.server;

import com.google.common.base.Objects;
import java.util.Iterator;
import java.util.Random;
import javax.annotation.Nullable;
import org.bukkit.event.block.BlockRedstoneEvent;

// CraftBukkit
public class BlockTripwireHook extends Block {

    public static final BlockStateDirection FACING = null;

    public static final BlockStateBoolean POWERED = null;

    public static final BlockStateBoolean ATTACHED = null;

    protected static final AxisAlignedBB d = null;

    protected static final AxisAlignedBB e = null;

    protected static final AxisAlignedBB f = null;

    protected static final AxisAlignedBB g = null;

    public BlockTripwireHook() {
    }

    public AxisAlignedBB a(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    @Nullable
    public AxisAlignedBB a(IBlockData iblockdata, World world, BlockPosition blockposition) {
        return null;
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

    public IBlockData getPlacedState(World world, BlockPosition blockposition, EnumDirection enumdirection, float f, float f1, float f2, int i, EntityLiving entityliving) {
        return null;
    }

    public void postPlace(World world, BlockPosition blockposition, IBlockData iblockdata, EntityLiving entityliving, ItemStack itemstack) {
    }

    public void a(IBlockData iblockdata, World world, BlockPosition blockposition, Block block) {
    }

    public void a(World world, BlockPosition blockposition, IBlockData iblockdata, boolean flag, boolean flag1, int i, @Nullable IBlockData iblockdata1) {
    }

    public void a(World world, BlockPosition blockposition, IBlockData iblockdata, Random random) {
    }

    public void b(World world, BlockPosition blockposition, IBlockData iblockdata, Random random) {
    }

    private void a(World world, BlockPosition blockposition, boolean flag, boolean flag1, boolean flag2, boolean flag3) {
    }

    private void a(World world, BlockPosition blockposition, EnumDirection enumdirection) {
    }

    private boolean e(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return false;
    }

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
