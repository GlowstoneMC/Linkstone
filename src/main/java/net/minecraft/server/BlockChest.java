package net.minecraft.server;

import java.util.Iterator;
import javax.annotation.Nullable;

public class BlockChest extends BlockTileEntity {

    public static final BlockStateDirection FACING;

    protected static final AxisAlignedBB b;

    protected static final AxisAlignedBB c;

    protected static final AxisAlignedBB d;

    protected static final AxisAlignedBB e;

    protected static final AxisAlignedBB f;

    public final BlockChest.Type g;

    protected BlockChest(BlockChest.Type blockchest_type) {
    }

    public boolean b(IBlockData iblockdata) {
        return false;
    }

    public boolean c(IBlockData iblockdata) {
        return false;
    }

    public EnumRenderType a(IBlockData iblockdata) {
        return null;
    }

    public AxisAlignedBB a(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    public void onPlace(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    public IBlockData getPlacedState(World world, BlockPosition blockposition, EnumDirection enumdirection, float f, float f1, float f2, int i, EntityLiving entityliving) {
        return null;
    }

    public void postPlace(World world, BlockPosition blockposition, IBlockData iblockdata, EntityLiving entityliving, ItemStack itemstack) {
    }

    public IBlockData e(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return null;
    }

    public IBlockData f(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return null;
    }

    public boolean canPlace(World world, BlockPosition blockposition) {
        return false;
    }

    private boolean d(World world, BlockPosition blockposition) {
        return false;
    }

    public void a(IBlockData iblockdata, World world, BlockPosition blockposition, Block block) {
    }

    public void remove(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    public boolean interact(World world, BlockPosition blockposition, IBlockData iblockdata, EntityHuman entityhuman, EnumHand enumhand, @Nullable ItemStack itemstack, EnumDirection enumdirection, float f, float f1, float f2) {
        return false;
    }

    @Nullable
    public ITileInventory c(World world, BlockPosition blockposition) {
        return null;
    }

    @Nullable
    public ITileInventory a(World world, BlockPosition blockposition, boolean flag) {
        return null;
    }

    public TileEntity a(World world, int i) {
        return null;
    }

    public boolean isPowerSource(IBlockData iblockdata) {
        return false;
    }

    public int b(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition, EnumDirection enumdirection) {
        return 0;
    }

    public int c(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition, EnumDirection enumdirection) {
        return 0;
    }

    private boolean e(World world, BlockPosition blockposition) {
        return false;
    }

    private boolean i(World world, BlockPosition blockposition) {
        return false;
    }

    private boolean j(World world, BlockPosition blockposition) {
        return false;
    }

    public boolean isComplexRedstone(IBlockData iblockdata) {
        return false;
    }

    public int d(IBlockData iblockdata, World world, BlockPosition blockposition) {
        return 0;
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

    public static enum Type {

        BASIC, TRAP;

        private Type() {
        }
    }
}
