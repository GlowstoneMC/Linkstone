package net.minecraft.server;

public interface INamableTileEntity {

    String getName() {
        return null;
    }

    boolean hasCustomName() {
        return false;
    }

    IChatBaseComponent getScoreboardDisplayName() {
        return null;
    }
}
