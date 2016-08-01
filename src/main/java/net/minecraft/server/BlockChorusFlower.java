package net.minecraft.server;

import java.util.Iterator;
import java.util.Random;
import javax.annotation.Nullable;
import org.bukkit.craftbukkit.event.CraftEventFactory;

// CraftBukkit
public class BlockChorusFlower extends Block {

    public static final BlockStateInteger AGE = null;

    protected BlockChorusFlower() {
    }

    @Nullable
    public Item getDropType(IBlockData iblockdata, Random random, int i) {
        return null;
    }

    public void b(World world, BlockPosition blockposition, IBlockData iblockdata, Random random) {
    }

    private void a(World world, BlockPosition blockposition, int i) {
    }

    private void c(World world, BlockPosition blockposition) {
    }

    private static boolean a(World world, BlockPosition blockposition, EnumDirection enumdirection) {
        return false;
    }

    public boolean c(IBlockData iblockdata) {
        return false;
    }

    public boolean b(IBlockData iblockdata) {
        return false;
    }

    public boolean canPlace(World world, BlockPosition blockposition) {
        return false;
    }

    public void a(IBlockData iblockdata, World world, BlockPosition blockposition, Block block) {
    }

    public boolean b(World world, BlockPosition blockposition) {
        return false;
    }

    public void a(World world, EntityHuman entityhuman, BlockPosition blockposition, IBlockData iblockdata, @Nullable TileEntity tileentity, @Nullable ItemStack itemstack) {
    }

    protected ItemStack u(IBlockData iblockdata) {
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

    public void onPlace(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    public static void a(World world, BlockPosition blockposition, Random random, int i) {
    }

    private static void a(World world, BlockPosition blockposition, Random random, BlockPosition blockposition1, int i, int j) {
    }
}
