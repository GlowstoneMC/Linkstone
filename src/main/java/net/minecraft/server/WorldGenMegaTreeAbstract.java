package net.minecraft.server;

import java.util.Random;

public abstract class WorldGenMegaTreeAbstract extends WorldGenTreeAbstract {

    protected final int a = 0;

    protected final IBlockData b = null;

    protected final IBlockData c = null;

    protected int d = 0;

    public WorldGenMegaTreeAbstract(boolean flag, int i, int j, IBlockData iblockdata, IBlockData iblockdata1) {
    }

    protected int a(Random random) {
        return 0;
    }

    private boolean c(World world, BlockPosition blockposition, int i) {
        return false;
    }

    private boolean a(BlockPosition blockposition, World world) {
        return false;
    }

    protected boolean a(World world, Random random, BlockPosition blockposition, int i) {
        return false;
    }

    protected void a(World world, BlockPosition blockposition, int i) {
    }

    protected void b(World world, BlockPosition blockposition, int i) {
    }
}
