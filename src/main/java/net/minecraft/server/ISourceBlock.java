package net.minecraft.server;

public interface ISourceBlock extends ILocationSource {

    double getX() {
        return 0.0;
    }

    double getY() {
        return 0.0;
    }

    double getZ() {
        return 0.0;
    }

    BlockPosition getBlockPosition() {
        return null;
    }

    IBlockData e() {
        return null;
    }

    <T extends TileEntity> T getTileEntity() {
        return null;
    }
}
