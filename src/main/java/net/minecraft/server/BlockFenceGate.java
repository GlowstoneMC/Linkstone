package net.minecraft.server;

import javax.annotation.Nullable;

public class BlockFenceGate extends BlockFacingHorizontal {

    public static final BlockStateBoolean OPEN = null;

    public static final BlockStateBoolean POWERED = null;

    public static final BlockStateBoolean IN_WALL = null;

    protected static final AxisAlignedBB d = null;

    protected static final AxisAlignedBB e = null;

    protected static final AxisAlignedBB f = null;

    protected static final AxisAlignedBB g = null;

    protected static final AxisAlignedBB B = null;

    protected static final AxisAlignedBB C = null;

    public BlockFenceGate(BlockWood.EnumLogVariant blockwood_enumlogvariant) {
    }

    public AxisAlignedBB a(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    public IBlockData updateState(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    public IBlockData a(IBlockData iblockdata, EnumBlockRotation enumblockrotation) {
        return null;
    }

    public IBlockData a(IBlockData iblockdata, EnumBlockMirror enumblockmirror) {
        return null;
    }

    public boolean canPlace(World world, BlockPosition blockposition) {
        return false;
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

    public boolean b(IBlockAccess iblockaccess, BlockPosition blockposition) {
        return false;
    }

    public IBlockData getPlacedState(World world, BlockPosition blockposition, EnumDirection enumdirection, float f, float f1, float f2, int i, EntityLiving entityliving) {
        return null;
    }

    public boolean interact(World world, BlockPosition blockposition, IBlockData iblockdata, EntityHuman entityhuman, EnumHand enumhand, @Nullable ItemStack itemstack, EnumDirection enumdirection, float f, float f1, float f2) {
        return false;
    }

    public void a(IBlockData iblockdata, World world, BlockPosition blockposition, Block block) {
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
}
