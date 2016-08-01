package net.minecraft.server;

import java.util.Random;
import javax.annotation.Nullable;

public class BlockSign extends BlockTileEntity {

    protected static final AxisAlignedBB a = null;

    protected BlockSign() {
    }

    public AxisAlignedBB a(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    @Nullable
    public AxisAlignedBB a(IBlockData iblockdata, World world, BlockPosition blockposition) {
        return null;
    }

    public boolean c(IBlockData iblockdata) {
        return false;
    }

    public boolean b(IBlockAccess iblockaccess, BlockPosition blockposition) {
        return false;
    }

    public boolean b(IBlockData iblockdata) {
        return false;
    }

    public boolean d() {
        return false;
    }

    public TileEntity a(World world, int i) {
        return null;
    }

    @Nullable
    public Item getDropType(IBlockData iblockdata, Random random, int i) {
        return null;
    }

    public ItemStack a(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return null;
    }

    public boolean interact(World world, BlockPosition blockposition, IBlockData iblockdata, EntityHuman entityhuman, EnumHand enumhand, @Nullable ItemStack itemstack, EnumDirection enumdirection, float f, float f1, float f2) {
        return false;
    }

    public boolean canPlace(World world, BlockPosition blockposition) {
        return false;
    }
}
