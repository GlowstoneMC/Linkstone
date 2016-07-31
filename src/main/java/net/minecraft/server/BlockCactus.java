package net.minecraft.server;

import java.util.Iterator;
import java.util.Random;
import org.bukkit.craftbukkit.event.CraftEventFactory;

// CraftBukkit
public class BlockCactus extends Block {

    public static final BlockStateInteger AGE;

    protected static final AxisAlignedBB b;

    protected static final AxisAlignedBB c;

    protected BlockCactus() {
    }

    public void b(World world, BlockPosition blockposition, IBlockData iblockdata, Random random) {
    }

    public AxisAlignedBB a(IBlockData iblockdata, World world, BlockPosition blockposition) {
        return null;
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

    public void a(World world, BlockPosition blockposition, IBlockData iblockdata, Entity entity) {
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
