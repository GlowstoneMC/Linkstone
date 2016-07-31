package net.minecraft.server;

import java.util.Random;
import javax.annotation.Nullable;
import org.bukkit.event.block.BlockRedstoneEvent;

// CraftBukkit
public abstract class BlockPressurePlateAbstract extends Block {

    protected static final AxisAlignedBB a;

    protected static final AxisAlignedBB b;

    protected static final AxisAlignedBB c;

    protected BlockPressurePlateAbstract(Material material) {
    }

    protected BlockPressurePlateAbstract(Material material, MaterialMapColor materialmapcolor) {
    }

    public AxisAlignedBB a(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    public int a(World world) {
        return 0;
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

    public boolean b(IBlockAccess iblockaccess, BlockPosition blockposition) {
        return false;
    }

    public boolean d() {
        return false;
    }

    public boolean canPlace(World world, BlockPosition blockposition) {
        return false;
    }

    public void a(IBlockData iblockdata, World world, BlockPosition blockposition, Block block) {
    }

    private boolean i(World world, BlockPosition blockposition) {
        return false;
    }

    public void a(World world, BlockPosition blockposition, IBlockData iblockdata, Random random) {
    }

    public void b(World world, BlockPosition blockposition, IBlockData iblockdata, Random random) {
    }

    public void a(World world, BlockPosition blockposition, IBlockData iblockdata, Entity entity) {
    }

    protected void a(World world, BlockPosition blockposition, IBlockData iblockdata, int i) {
    }

    protected abstract void b(World world, BlockPosition blockposition);

    protected abstract void c(World world, BlockPosition blockposition);

    public void remove(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    protected void d(World world, BlockPosition blockposition) {
    }

    public int b(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition, EnumDirection enumdirection) {
        return 0;
    }

    public int c(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition, EnumDirection enumdirection) {
        return 0;
    }

    public boolean isPowerSource(IBlockData iblockdata) {
        return false;
    }

    public EnumPistonReaction h(IBlockData iblockdata) {
        return null;
    }

    protected abstract int e(World world, BlockPosition blockposition);

    protected abstract int getPower(IBlockData iblockdata);

    protected abstract IBlockData a(IBlockData iblockdata, int i);
}
