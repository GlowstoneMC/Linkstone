package net.minecraft.server;

import java.util.Random;

public class BlockStainedGlass extends BlockHalfTransparent {

    public static final BlockStateEnum<EnumColor> COLOR;

    public BlockStainedGlass(Material material) {
    }

    public int getDropData(IBlockData iblockdata) {
        return 0;
    }

    public MaterialMapColor r(IBlockData iblockdata) {
        return null;
    }

    public int a(Random random) {
        return 0;
    }

    protected boolean o() {
        return false;
    }

    public boolean c(IBlockData iblockdata) {
        return false;
    }

    public IBlockData fromLegacyData(int i) {
        return null;
    }

    public void onPlace(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    public void remove(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    public int toLegacyData(IBlockData iblockdata) {
        return 0;
    }

    protected BlockStateList getStateList() {
        return null;
    }
}
