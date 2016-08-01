package net.minecraft.server;

import java.util.Random;
import javax.annotation.Nullable;
import org.bukkit.event.block.BlockFromToEvent;

// CraftBukkit
public class BlockDragonEgg extends Block {

    protected static final AxisAlignedBB a;

    public BlockDragonEgg() {
    }

    public AxisAlignedBB a(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    public void onPlace(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    public void a(IBlockData iblockdata, World world, BlockPosition blockposition, Block block) {
    }

    public void b(World world, BlockPosition blockposition, IBlockData iblockdata, Random random) {
    }

    private void b(World world, BlockPosition blockposition) {
    }

    public boolean interact(World world, BlockPosition blockposition, IBlockData iblockdata, EntityHuman entityhuman, EnumHand enumhand, @Nullable ItemStack itemstack, EnumDirection enumdirection, float f, float f1, float f2) {
        return false;
    }

    public void attack(World world, BlockPosition blockposition, EntityHuman entityhuman) {
    }

    private void c(World world, BlockPosition blockposition) {
    }

    public int a(World world) {
        return 0;
    }

    public boolean b(IBlockData iblockdata) {
        return false;
    }

    public boolean c(IBlockData iblockdata) {
        return false;
    }
}
