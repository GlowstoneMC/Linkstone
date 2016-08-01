package net.minecraft.server;

public interface ITileEntityContainer extends INamableTileEntity {

    Container createContainer(PlayerInventory playerinventory, EntityHuman entityhuman) {
        return null;
    }

    String getContainerName() {
        return null;
    }
}
