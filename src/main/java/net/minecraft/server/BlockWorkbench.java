package net.minecraft.server;

import javax.annotation.Nullable;

public class BlockWorkbench extends Block {

    protected BlockWorkbench() {
    }

    public boolean interact(World world, BlockPosition blockposition, IBlockData iblockdata, EntityHuman entityhuman, EnumHand enumhand, @Nullable ItemStack itemstack, EnumDirection enumdirection, float f, float f1, float f2) {
        return false;
    }

    public static class TileEntityContainerWorkbench implements ITileEntityContainer {

        private final World a;

        private final BlockPosition b;

        public TileEntityContainerWorkbench(World world, BlockPosition blockposition) {
        }

        public String getName() {
            return null;
        }

        public boolean hasCustomName() {
            return false;
        }

        public IChatBaseComponent getScoreboardDisplayName() {
            return null;
        }

        public Container createContainer(PlayerInventory playerinventory, EntityHuman entityhuman) {
            return null;
        }

        public String getContainerName() {
            return null;
        }
    }
}
