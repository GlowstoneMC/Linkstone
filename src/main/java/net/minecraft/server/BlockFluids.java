package net.minecraft.server;

import java.util.Iterator;
import java.util.Random;
import javax.annotation.Nullable;

public abstract class BlockFluids extends Block {

    public static final BlockStateInteger LEVEL = null;

    protected BlockFluids(Material material) {
    }

    public AxisAlignedBB a(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    @Nullable
    public AxisAlignedBB a(IBlockData iblockdata, World world, BlockPosition blockposition) {
        return null;
    }

    public boolean b(IBlockAccess iblockaccess, BlockPosition blockposition) {
        return false;
    }

    public static float e(int i) {
        return 0.0F;
    }

    protected int i(IBlockData iblockdata) {
        return 0;
    }

    protected int x(IBlockData iblockdata) {
        return 0;
    }

    public boolean c(IBlockData iblockdata) {
        return false;
    }

    public boolean b(IBlockData iblockdata) {
        return false;
    }

    public boolean a(IBlockData iblockdata, boolean flag) {
        return false;
    }

    public boolean a(IBlockAccess iblockaccess, BlockPosition blockposition, EnumDirection enumdirection) {
        return false;
    }

    public EnumRenderType a(IBlockData iblockdata) {
        return null;
    }

    @Nullable
    public Item getDropType(IBlockData iblockdata, Random random, int i) {
        return null;
    }

    public int a(Random random) {
        return 0;
    }

    protected Vec3D a(IBlockAccess iblockaccess, BlockPosition blockposition, IBlockData iblockdata) {
        return null;
    }

    public Vec3D a(World world, BlockPosition blockposition, Entity entity, Vec3D vec3d) {
        return null;
    }

    public int a(World world) {
        return 0;
    }

    public void onPlace(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    public void a(IBlockData iblockdata, World world, BlockPosition blockposition, Block block) {
    }

    public boolean e(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return false;
    }

    protected void fizz(World world, BlockPosition blockposition) {
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

    public static BlockFlowing a(Material material) {
        return null;
    }

    public static BlockStationary b(Material material) {
        return null;
    }
}
