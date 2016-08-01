package net.minecraft.server;

import java.util.Random;
import javax.annotation.Nullable;

public class BlockDispenser extends BlockTileEntity {

    public static final BlockStateDirection FACING = null;

    public static final BlockStateBoolean TRIGGERED = null;

    public static final RegistryDefault<Item, IDispenseBehavior> REGISTRY = null;

    protected Random d = null;

    public static boolean eventFired = false;

    // CraftBukkit
    protected BlockDispenser() {
    }

    public int a(World world) {
        return 0;
    }

    public void onPlace(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    private void e(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    public boolean interact(World world, BlockPosition blockposition, IBlockData iblockdata, EntityHuman entityhuman, EnumHand enumhand, @Nullable ItemStack itemstack, EnumDirection enumdirection, float f, float f1, float f2) {
        return false;
    }

    public void dispense(World world, BlockPosition blockposition) {
    }

    protected IDispenseBehavior a(@Nullable ItemStack itemstack) {
        return null;
    }

    public void a(IBlockData iblockdata, World world, BlockPosition blockposition, Block block) {
    }

    public void b(World world, BlockPosition blockposition, IBlockData iblockdata, Random random) {
    }

    public TileEntity a(World world, int i) {
        return null;
    }

    public IBlockData getPlacedState(World world, BlockPosition blockposition, EnumDirection enumdirection, float f, float f1, float f2, int i, EntityLiving entityliving) {
        return null;
    }

    public void postPlace(World world, BlockPosition blockposition, IBlockData iblockdata, EntityLiving entityliving, ItemStack itemstack) {
    }

    public void remove(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    public static IPosition a(ISourceBlock isourceblock) {
        return null;
    }

    public boolean isComplexRedstone(IBlockData iblockdata) {
        return false;
    }

    public int d(IBlockData iblockdata, World world, BlockPosition blockposition) {
        return 0;
    }

    public EnumRenderType a(IBlockData iblockdata) {
        return null;
    }

    public IBlockData fromLegacyData(int i) {
        return null;
    }

    public int toLegacyData(IBlockData iblockdata) {
        return 0;
    }

    public IBlockData a(IBlockData iblockdata, EnumBlockRotation enumblockrotation) {
        return null;
    }

    public IBlockData a(IBlockData iblockdata, EnumBlockMirror enumblockmirror) {
        return null;
    }

    protected BlockStateList getStateList() {
        return null;
    }
}
