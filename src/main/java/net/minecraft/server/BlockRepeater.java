package net.minecraft.server;

import java.util.Random;
import javax.annotation.Nullable;

public class BlockRepeater extends BlockDiodeAbstract {

    public static final BlockStateBoolean LOCKED = null;

    public static final BlockStateInteger DELAY = null;

    protected BlockRepeater(boolean flag) {
    }

    public String getName() {
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

    public boolean interact(World world, BlockPosition blockposition, IBlockData iblockdata, EntityHuman entityhuman, EnumHand enumhand, @Nullable ItemStack itemstack, EnumDirection enumdirection, float f, float f1, float f2) {
        return false;
    }

    protected int i(IBlockData iblockdata) {
        return 0;
    }

    protected IBlockData x(IBlockData iblockdata) {
        return null;
    }

    protected IBlockData y(IBlockData iblockdata) {
        return null;
    }

    @Nullable
    public Item getDropType(IBlockData iblockdata, Random random, int i) {
        return null;
    }

    public ItemStack a(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return null;
    }

    public boolean b(IBlockAccess iblockaccess, BlockPosition blockposition, IBlockData iblockdata) {
        return false;
    }

    protected boolean A(IBlockData iblockdata) {
        return false;
    }

    public void remove(World world, BlockPosition blockposition, IBlockData iblockdata) {
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
