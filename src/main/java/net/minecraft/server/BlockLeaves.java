package net.minecraft.server;

import java.util.Random;
import javax.annotation.Nullable;
import org.bukkit.event.block.LeavesDecayEvent;

// CraftBukkit
public abstract class BlockLeaves extends Block {

    public static final BlockStateBoolean DECAYABLE = null;

    public static final BlockStateBoolean CHECK_DECAY = null;

    protected boolean c = false;

    int[] d = null;

    public BlockLeaves() {
    }

    public void remove(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    public void b(World world, BlockPosition blockposition, IBlockData iblockdata, Random random) {
    }

    private void b(World world, BlockPosition blockposition) {
    }

    public int a(Random random) {
        return 0;
    }

    @Nullable
    public Item getDropType(IBlockData iblockdata, Random random, int i) {
        return null;
    }

    public void dropNaturally(World world, BlockPosition blockposition, IBlockData iblockdata, float f, int i) {
    }

    protected void a(World world, BlockPosition blockposition, IBlockData iblockdata, int i) {
    }

    protected int i(IBlockData iblockdata) {
        return 0;
    }

    public boolean b(IBlockData iblockdata) {
        return false;
    }

    public boolean j() {
        return false;
    }

    public abstract BlockWood.EnumLogVariant e(int i);
}
