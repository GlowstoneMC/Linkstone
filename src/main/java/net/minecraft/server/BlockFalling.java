package net.minecraft.server;

import java.util.Random;

public class BlockFalling extends Block {

    public static boolean instaFall = false;

    public BlockFalling() {
    }

    public BlockFalling(Material material) {
    }

    public void onPlace(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    public void a(IBlockData iblockdata, World world, BlockPosition blockposition, Block block) {
    }

    public void b(World world, BlockPosition blockposition, IBlockData iblockdata, Random random) {
    }

    private void b(World world, BlockPosition blockposition) {
    }

    protected void a(EntityFallingBlock entityfallingblock) {
    }

    public int a(World world) {
        return 0;
    }

    public static boolean i(IBlockData iblockdata) {
        return false;
    }

    public void a_(World world, BlockPosition blockposition) {
    }
}
