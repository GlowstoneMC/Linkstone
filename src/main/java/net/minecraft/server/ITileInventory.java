package net.minecraft.server;

public interface ITileInventory extends IInventory, ITileEntityContainer {

    boolean x_() {
        return false;
    }

    void a(ChestLock chestlock) {
    }

    ChestLock y_() {
        return null;
    }
}
