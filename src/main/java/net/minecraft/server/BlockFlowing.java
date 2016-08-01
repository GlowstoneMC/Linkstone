package net.minecraft.server;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
// CraftBukkit start
import org.bukkit.block.BlockFace;
import org.bukkit.event.block.BlockFromToEvent;

// CraftBukkit end
public class BlockFlowing extends BlockFluids {

    int a = 0;

    protected BlockFlowing(Material material) {
    }

    private void f(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    public void b(World world, BlockPosition blockposition, IBlockData iblockdata, Random random) {
    }

    private void flow(World world, BlockPosition blockposition, IBlockData iblockdata, int i) {
    }

    private int a(World world, BlockPosition blockposition, int i, EnumDirection enumdirection) {
        return 0;
    }

    private int b(World world) {
        return 0;
    }

    private Set<EnumDirection> c(World world, BlockPosition blockposition) {
        return null;
    }

    private boolean g(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return false;
    }

    protected int a(World world, BlockPosition blockposition, int i) {
        return 0;
    }

    private boolean h(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return false;
    }

    public void onPlace(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }
}
