package net.minecraft.server;

import java.util.Random;
// CraftBukkit start
import java.util.List;
import org.bukkit.Location;
import org.bukkit.TreeType;
import org.bukkit.block.BlockState;
import org.bukkit.event.world.StructureGrowEvent;

// CraftBukkit end
public class BlockSapling extends BlockPlant implements IBlockFragilePlantElement {

    public static final BlockStateEnum<BlockWood.EnumLogVariant> TYPE = null;

    public static final BlockStateInteger STAGE = null;

    protected static final AxisAlignedBB d = null;

    public static TreeType treeType = null;

    // CraftBukkit
    protected BlockSapling() {
    }

    public AxisAlignedBB a(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    public String getName() {
        return null;
    }

    public void b(World world, BlockPosition blockposition, IBlockData iblockdata, Random random) {
    }

    public void grow(World world, BlockPosition blockposition, IBlockData iblockdata, Random random) {
    }

    public void d(World world, BlockPosition blockposition, IBlockData iblockdata, Random random) {
    }

    private boolean a(World world, BlockPosition blockposition, int i, int j, BlockWood.EnumLogVariant blockwood_enumlogvariant) {
        return false;
    }

    public boolean a(World world, BlockPosition blockposition, BlockWood.EnumLogVariant blockwood_enumlogvariant) {
        return false;
    }

    public int getDropData(IBlockData iblockdata) {
        return 0;
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

    static class SyntheticClass_1 {

        static final int[] a = null;

        static {
        }
    }
}
