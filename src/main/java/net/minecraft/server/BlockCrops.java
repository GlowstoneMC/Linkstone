package net.minecraft.server;

import java.util.Random;
import javax.annotation.Nullable;
import org.bukkit.craftbukkit.event.CraftEventFactory;

// CraftBukkit
public class BlockCrops extends BlockPlant implements IBlockFragilePlantElement {

    public static final BlockStateInteger AGE;

    private static final AxisAlignedBB[] a;

    protected BlockCrops() {
    }

    public AxisAlignedBB a(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    protected boolean i(IBlockData iblockdata) {
        return false;
    }

    protected BlockStateInteger e() {
        return null;
    }

    public int g() {
        return 0;
    }

    protected int x(IBlockData iblockdata) {
        return 0;
    }

    public IBlockData setAge(int i) {
        return null;
    }

    public boolean y(IBlockData iblockdata) {
        return false;
    }

    public void b(World world, BlockPosition blockposition, IBlockData iblockdata, Random random) {
    }

    public void g(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    protected int b(World world) {
        return 0;
    }

    protected static float a(Block block, World world, BlockPosition blockposition) {
        return 0.0F;
    }

    public boolean f(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return false;
    }

    protected Item h() {
        return null;
    }

    protected Item i() {
        return null;
    }

    public void dropNaturally(World world, BlockPosition blockposition, IBlockData iblockdata, float f, int i) {
    }

    @Nullable
    public Item getDropType(IBlockData iblockdata, Random random, int i) {
        return null;
    }

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
