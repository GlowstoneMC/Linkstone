package net.minecraft.server;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class BlockSponge extends Block {

    public static final BlockStateBoolean WET;

    protected BlockSponge() {
    }

    public String getName() {
        return null;
    }

    public int getDropData(IBlockData iblockdata) {
        return 0;
    }

    public void onPlace(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    public void a(IBlockData iblockdata, World world, BlockPosition blockposition, Block block) {
    }

    protected void e(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    private boolean b(World world, BlockPosition blockposition) {
        return false;
    }

    public IBlockData fromLegacyData(int i) {
        return null;
    }

    public int toLegacyData(IBlockData iblockdata) {
        return 0;
    }

    protected BlockStateList getStateList() {
        return null;
    }
}
