package net.minecraft.server;

import javax.annotation.Nullable;

public class BlockJukeBox extends BlockTileEntity {

    public static final BlockStateBoolean HAS_RECORD;

    public static void a(DataConverterManager dataconvertermanager) {
    }

    protected BlockJukeBox() {
    }

    public boolean interact(World world, BlockPosition blockposition, IBlockData iblockdata, EntityHuman entityhuman, EnumHand enumhand, @Nullable ItemStack itemstack, EnumDirection enumdirection, float f, float f1, float f2) {
        return false;
    }

    public void a(World world, BlockPosition blockposition, IBlockData iblockdata, ItemStack itemstack) {
    }

    public void dropRecord(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    public void remove(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    public void dropNaturally(World world, BlockPosition blockposition, IBlockData iblockdata, float f, int i) {
    }

    public TileEntity a(World world, int i) {
        return null;
    }

    public boolean isComplexRedstone(IBlockData iblockdata) {
        return false;
    }

    public int d(IBlockData iblockdata, World world, BlockPosition blockposition) {
        return 0;
    }

    public EnumRenderType a(IBlockData iblockdata) {
        return null;
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

    public static class TileEntityRecordPlayer extends TileEntity {

        private ItemStack record;

        public TileEntityRecordPlayer() {
        }

        public void a(NBTTagCompound nbttagcompound) {
        }

        public NBTTagCompound save(NBTTagCompound nbttagcompound) {
            return null;
        }

        @Nullable
        public ItemStack getRecord() {
            return null;
        }

        public void setRecord(@Nullable ItemStack itemstack) {
        }
    }
}
