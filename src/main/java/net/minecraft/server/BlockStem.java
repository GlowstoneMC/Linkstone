package net.minecraft.server;

import java.util.Iterator;
import java.util.Random;
import javax.annotation.Nullable;
import org.bukkit.craftbukkit.event.CraftEventFactory;

// CraftBukkit
public class BlockStem extends BlockPlant implements IBlockFragilePlantElement {

    public static final BlockStateInteger AGE = null;

    public static final BlockStateDirection FACING = null;

    private final Block blockFruit = null;

    protected static final AxisAlignedBB[] d = null;

    protected BlockStem(Block block) {
    }

    public AxisAlignedBB a(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    public IBlockData updateState(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    protected boolean i(IBlockData iblockdata) {
        return false;
    }

    public void b(World world, BlockPosition blockposition, IBlockData iblockdata, Random random) {
    }

    public void g(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    public void dropNaturally(World world, BlockPosition blockposition, IBlockData iblockdata, float f, int i) {
    }

    @Nullable
    protected Item e() {
        return null;
    }

    @Nullable
    public Item getDropType(IBlockData iblockdata, Random random, int i) {
        return null;
    }

    @Nullable
    public ItemStack a(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return null;
    }

    public boolean a(World world, BlockPosition blockposition, IBlockData iblockdata, boolean flag) {
        return false;
    }

    public boolean a(World world, Random random, BlockPosition blockposition, IBlockData iblockdata) {
        return false;
    }

    public void b(World world, Random random, BlockPosition blockposition, IBlockData iblockdata) {
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
