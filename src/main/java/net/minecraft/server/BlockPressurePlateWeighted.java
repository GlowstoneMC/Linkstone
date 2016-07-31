package net.minecraft.server;

import org.bukkit.event.entity.EntityInteractEvent;

// CraftBukkit
public class BlockPressurePlateWeighted extends BlockPressurePlateAbstract {

    public static final BlockStateInteger POWER;

    private final int weight;

    protected BlockPressurePlateWeighted(Material material, int i) {
    }

    protected BlockPressurePlateWeighted(Material material, int i, MaterialMapColor materialmapcolor) {
    }

    protected int e(World world, BlockPosition blockposition) {
        return 0;
    }

    protected void b(World world, BlockPosition blockposition) {
    }

    protected void c(World world, BlockPosition blockposition) {
    }

    protected int getPower(IBlockData iblockdata) {
        return 0;
    }

    protected IBlockData a(IBlockData iblockdata, int i) {
        return null;
    }

    public int a(World world) {
        return 0;
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
