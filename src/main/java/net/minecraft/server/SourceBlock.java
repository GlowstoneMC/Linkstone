package net.minecraft.server;

public class SourceBlock implements ISourceBlock {

    private final World a;

    private final BlockPosition b;

    public SourceBlock(World world, BlockPosition blockposition) {
    }

    public World getWorld() {
        return null;
    }

    public double getX() {
        return 0.0;
    }

    public double getY() {
        return 0.0;
    }

    public double getZ() {
        return 0.0;
    }

    public BlockPosition getBlockPosition() {
        return null;
    }

    public IBlockData e() {
        return null;
    }

    public <T extends TileEntity> T getTileEntity() {
        return null;
    }
}
