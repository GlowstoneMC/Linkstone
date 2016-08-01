package net.minecraft.server;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Random;
import javax.annotation.Nullable;
// CraftBukkit start
import org.bukkit.craftbukkit.event.CraftEventFactory;
import org.bukkit.event.block.BlockBurnEvent;
import org.bukkit.event.block.BlockSpreadEvent;

// CraftBukkit end
public class BlockFire extends Block {

    public static final BlockStateInteger AGE = null;

    public static final BlockStateBoolean NORTH = null;

    public static final BlockStateBoolean EAST = null;

    public static final BlockStateBoolean SOUTH = null;

    public static final BlockStateBoolean WEST = null;

    public static final BlockStateBoolean UPPER = null;

    private final Map<Block, Integer> flameChances = null;

    private final Map<Block, Integer> B = null;

    public IBlockData updateState(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    protected BlockFire() {
    }

    public static void e() {
    }

    public void a(Block block, int i, int j) {
    }

    @Nullable
    public AxisAlignedBB a(IBlockData iblockdata, World world, BlockPosition blockposition) {
        return null;
    }

    public boolean b(IBlockData iblockdata) {
        return false;
    }

    public boolean c(IBlockData iblockdata) {
        return false;
    }

    public int a(Random random) {
        return 0;
    }

    public int a(World world) {
        return 0;
    }

    public void b(World world, BlockPosition blockposition, IBlockData iblockdata, Random random) {
    }

    protected boolean b(World world, BlockPosition blockposition) {
        return false;
    }

    public boolean s() {
        return false;
    }

    private int c(Block block) {
        return 0;
    }

    private int d(Block block) {
        return 0;
    }

    private void a(World world, BlockPosition blockposition, int i, Random random, int j) {
    }

    private boolean c(World world, BlockPosition blockposition) {
        return false;
    }

    private int d(World world, BlockPosition blockposition) {
        return 0;
    }

    public boolean n() {
        return false;
    }

    public boolean c(IBlockAccess iblockaccess, BlockPosition blockposition) {
        return false;
    }

    public boolean canPlace(World world, BlockPosition blockposition) {
        return false;
    }

    public void a(IBlockData iblockdata, World world, BlockPosition blockposition, Block block) {
    }

    public void onPlace(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    public MaterialMapColor r(IBlockData iblockdata) {
        return null;
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

    // CraftBukkit start
    private void fireExtinguished(World world, BlockPosition position) {
    }
    // CraftBukkit end
}
