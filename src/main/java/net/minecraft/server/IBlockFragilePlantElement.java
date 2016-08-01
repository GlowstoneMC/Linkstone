package net.minecraft.server;

import java.util.Random;

public interface IBlockFragilePlantElement {

    boolean a(World world, BlockPosition blockposition, IBlockData iblockdata, boolean flag) {
        return false;
    }

    boolean a(World world, Random random, BlockPosition blockposition, IBlockData iblockdata) {
        return false;
    }

    void b(World world, Random random, BlockPosition blockposition, IBlockData iblockdata) {
    }
}
