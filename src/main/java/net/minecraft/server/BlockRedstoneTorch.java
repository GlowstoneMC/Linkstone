package net.minecraft.server;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.annotation.Nullable;
import org.bukkit.event.block.BlockRedstoneEvent;

// CraftBukkit
public class BlockRedstoneTorch extends BlockTorch {

    private static final Map<World, List<BlockRedstoneTorch.RedstoneUpdateInfo>> g = null;

    private final boolean isOn = false;

    private boolean a(World world, BlockPosition blockposition, boolean flag) {
        return false;
    }

    protected BlockRedstoneTorch(boolean flag) {
    }

    public int a(World world) {
        return 0;
    }

    public void onPlace(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    public void remove(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    public int b(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition, EnumDirection enumdirection) {
        return 0;
    }

    private boolean g(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return false;
    }

    public void a(World world, BlockPosition blockposition, IBlockData iblockdata, Random random) {
    }

    public void b(World world, BlockPosition blockposition, IBlockData iblockdata, Random random) {
    }

    public void a(IBlockData iblockdata, World world, BlockPosition blockposition, Block block) {
    }

    public int c(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition, EnumDirection enumdirection) {
        return 0;
    }

    @Nullable
    public Item getDropType(IBlockData iblockdata, Random random, int i) {
        return null;
    }

    public boolean isPowerSource(IBlockData iblockdata) {
        return false;
    }

    public ItemStack a(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return null;
    }

    public boolean b(Block block) {
        return false;
    }

    static class RedstoneUpdateInfo {

        BlockPosition a = null;

        long b = 0;

        public RedstoneUpdateInfo(BlockPosition blockposition, long i) {
        }
    }
}
