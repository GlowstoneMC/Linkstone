package net.minecraft.server;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import org.bukkit.event.entity.EntityInteractEvent;

// CraftBukkit
public class BlockTripwire extends Block {

    public static final BlockStateBoolean POWERED = null;

    public static final BlockStateBoolean ATTACHED = null;

    public static final BlockStateBoolean DISARMED = null;

    public static final BlockStateBoolean NORTH = null;

    public static final BlockStateBoolean EAST = null;

    public static final BlockStateBoolean SOUTH = null;

    public static final BlockStateBoolean WEST = null;

    protected static final AxisAlignedBB B = null;

    protected static final AxisAlignedBB C = null;

    public BlockTripwire() {
    }

    public AxisAlignedBB a(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    public IBlockData updateState(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
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

    @Nullable
    public Item getDropType(IBlockData iblockdata, Random random, int i) {
        return null;
    }

    public ItemStack a(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return null;
    }

    public void onPlace(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    public void remove(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    public void a(World world, BlockPosition blockposition, IBlockData iblockdata, EntityHuman entityhuman) {
    }

    private void e(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    public void a(World world, BlockPosition blockposition, IBlockData iblockdata, Entity entity) {
    }

    public void a(World world, BlockPosition blockposition, IBlockData iblockdata, Random random) {
    }

    public void b(World world, BlockPosition blockposition, IBlockData iblockdata, Random random) {
    }

    private void b(World world, BlockPosition blockposition) {
    }

    public static boolean a(IBlockAccess iblockaccess, BlockPosition blockposition, IBlockData iblockdata, EnumDirection enumdirection) {
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

        static final int[] b = null;

        static {
        }
    }
}
