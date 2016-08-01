package net.minecraft.server;

import javax.annotation.Nullable;

public class ChunkCache implements IBlockAccess {

    protected int a = 0;

    protected int b = 0;

    protected Chunk[][] c = null;

    protected boolean d = false;

    protected World e = null;

    public ChunkCache(World world, BlockPosition blockposition, BlockPosition blockposition1, int i) {
    }

    @Nullable
    public TileEntity getTileEntity(BlockPosition blockposition) {
        return null;
    }

    @Nullable
    public TileEntity a(BlockPosition blockposition, Chunk.EnumTileEntityState chunk_enumtileentitystate) {
        return null;
    }

    public IBlockData getType(BlockPosition blockposition) {
        return null;
    }

    public boolean isEmpty(BlockPosition blockposition) {
        return false;
    }

    public int getBlockPower(BlockPosition blockposition, EnumDirection enumdirection) {
        return 0;
    }
}
