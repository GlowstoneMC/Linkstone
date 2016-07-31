package net.minecraft.server;

import java.util.Random;
import javax.annotation.Nullable;
// CraftBukkit start
import org.bukkit.craftbukkit.event.CraftEventFactory;
import org.bukkit.event.entity.EntityInteractEvent;

// CraftBukkit end
public class BlockRedstoneOre extends Block {

    private final boolean a;

    public BlockRedstoneOre(boolean flag) {
    }

    public int a(World world) {
        return 0;
    }

    public void attack(World world, BlockPosition blockposition, EntityHuman entityhuman) {
    }

    public void stepOn(World world, BlockPosition blockposition, Entity entity) {
    }

    public boolean interact(World world, BlockPosition blockposition, IBlockData iblockdata, EntityHuman entityhuman, EnumHand enumhand, @Nullable ItemStack itemstack, EnumDirection enumdirection, float f, float f1, float f2) {
        return false;
    }

    private void interact(World world, BlockPosition blockposition, Entity entity) {
    }

    public void b(World world, BlockPosition blockposition, IBlockData iblockdata, Random random) {
    }

    @Nullable
    public Item getDropType(IBlockData iblockdata, Random random, int i) {
        return null;
    }

    public int getDropCount(int i, Random random) {
        return 0;
    }

    public int a(Random random) {
        return 0;
    }

    public void dropNaturally(World world, BlockPosition blockposition, IBlockData iblockdata, float f, int i) {
    }

    @Override
    public int getExpDrop(World world, IBlockData data, int i) {
        return 0;
    }

    private void playEffect(World world, BlockPosition blockposition) {
    }

    protected ItemStack u(IBlockData iblockdata) {
        return null;
    }

    @Nullable
    public ItemStack a(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return null;
    }
}
