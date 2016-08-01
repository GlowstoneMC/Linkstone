package net.minecraft.server;

import javax.annotation.Nullable;

public class BlockEnchantmentTable extends BlockTileEntity {

    protected static final AxisAlignedBB a = null;

    protected BlockEnchantmentTable() {
    }

    public AxisAlignedBB a(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    public boolean c(IBlockData iblockdata) {
        return false;
    }

    public boolean b(IBlockData iblockdata) {
        return false;
    }

    public EnumRenderType a(IBlockData iblockdata) {
        return null;
    }

    public TileEntity a(World world, int i) {
        return null;
    }

    public boolean interact(World world, BlockPosition blockposition, IBlockData iblockdata, EntityHuman entityhuman, EnumHand enumhand, @Nullable ItemStack itemstack, EnumDirection enumdirection, float f, float f1, float f2) {
        return false;
    }

    public void postPlace(World world, BlockPosition blockposition, IBlockData iblockdata, EntityLiving entityliving, ItemStack itemstack) {
    }
}
