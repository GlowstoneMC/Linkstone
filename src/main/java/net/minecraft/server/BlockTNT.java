package net.minecraft.server;

import javax.annotation.Nullable;

public class BlockTNT extends Block {

    public static final BlockStateBoolean EXPLODE = null;

    public BlockTNT() {
    }

    public void onPlace(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    public void a(IBlockData iblockdata, World world, BlockPosition blockposition, Block block) {
    }

    public void wasExploded(World world, BlockPosition blockposition, Explosion explosion) {
    }

    public void postBreak(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    public void a(World world, BlockPosition blockposition, IBlockData iblockdata, EntityLiving entityliving) {
    }

    public boolean interact(World world, BlockPosition blockposition, IBlockData iblockdata, EntityHuman entityhuman, EnumHand enumhand, @Nullable ItemStack itemstack, EnumDirection enumdirection, float f, float f1, float f2) {
        return false;
    }

    public void a(World world, BlockPosition blockposition, IBlockData iblockdata, Entity entity) {
    }

    public boolean a(Explosion explosion) {
        return false;
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
