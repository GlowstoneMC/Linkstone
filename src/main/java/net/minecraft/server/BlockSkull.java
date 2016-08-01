package net.minecraft.server;

import com.google.common.base.Predicate;
import java.util.Iterator;
import java.util.Random;
import javax.annotation.Nullable;
// CraftBukkit start
import org.bukkit.craftbukkit.util.BlockStateListPopulator;
import org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason;

// CraftBukkit end
public class BlockSkull extends BlockTileEntity {

    public static final BlockStateDirection FACING = null;

    public static final BlockStateBoolean NODROP = null;

    private static final Predicate<ShapeDetectorBlock> B = null;

    protected static final AxisAlignedBB c = null;

    protected static final AxisAlignedBB d = null;

    protected static final AxisAlignedBB e = null;

    protected static final AxisAlignedBB f = null;

    protected static final AxisAlignedBB g = null;

    private ShapeDetector C = null;

    private ShapeDetector D = null;

    protected BlockSkull() {
    }

    public String getName() {
        return null;
    }

    public boolean b(IBlockData iblockdata) {
        return false;
    }

    public boolean c(IBlockData iblockdata) {
        return false;
    }

    public AxisAlignedBB a(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    public IBlockData getPlacedState(World world, BlockPosition blockposition, EnumDirection enumdirection, float f, float f1, float f2, int i, EntityLiving entityliving) {
        return null;
    }

    public TileEntity a(World world, int i) {
        return null;
    }

    public ItemStack a(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return null;
    }

    // CraftBukkit start - Special case dropping so we can get info from the tile entity
    @Override
    public void dropNaturally(World world, BlockPosition blockposition, IBlockData iblockdata, float f, int i) {
    }

    // CraftBukkit end
    public void a(World world, BlockPosition blockposition, IBlockData iblockdata, EntityHuman entityhuman) {
    }

    public void remove(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    @Nullable
    public Item getDropType(IBlockData iblockdata, Random random, int i) {
        return null;
    }

    public boolean b(World world, BlockPosition blockposition, ItemStack itemstack) {
        return false;
    }

    public void a(World world, BlockPosition blockposition, TileEntitySkull tileentityskull) {
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

    protected ShapeDetector e() {
        return null;
    }

    protected ShapeDetector g() {
        return null;
    }

    static class SyntheticClass_1 {

        static final int[] a = null;

        static {
        }
    }
}
