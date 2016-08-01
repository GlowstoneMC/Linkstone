package net.minecraft.server;

import javax.annotation.Nullable;

public interface IBlockAccess {

    @Nullable
    TileEntity getTileEntity(BlockPosition blockposition) {
        return null;
    }

    IBlockData getType(BlockPosition blockposition) {
        return null;
    }

    boolean isEmpty(BlockPosition blockposition) {
        return false;
    }

    int getBlockPower(BlockPosition blockposition, EnumDirection enumdirection) {
        return 0;
    }
}
