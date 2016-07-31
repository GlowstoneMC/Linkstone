package net.minecraft.server;

import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import org.bukkit.event.block.CauldronLevelChangeEvent;

// CraftBukkit
public class BlockCauldron extends Block {

    public static final BlockStateInteger LEVEL;

    protected static final AxisAlignedBB b;

    protected static final AxisAlignedBB c;

    protected static final AxisAlignedBB d;

    protected static final AxisAlignedBB e;

    protected static final AxisAlignedBB f;

    public BlockCauldron() {
    }

    public void a(IBlockData iblockdata, World world, BlockPosition blockposition, AxisAlignedBB axisalignedbb, List<AxisAlignedBB> list, @Nullable Entity entity) {
    }

    public AxisAlignedBB a(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    public boolean b(IBlockData iblockdata) {
        return false;
    }

    public boolean c(IBlockData iblockdata) {
        return false;
    }

    public void a(World world, BlockPosition blockposition, IBlockData iblockdata, Entity entity) {
    }

    public boolean interact(World world, BlockPosition blockposition, IBlockData iblockdata, EntityHuman entityhuman, EnumHand enumhand, @Nullable ItemStack itemstack, EnumDirection enumdirection, float f, float f1, float f2) {
        return false;
    }

    // CraftBukkit start
    public void a(World world, BlockPosition blockposition, IBlockData iblockdata, int i) {
    }

    private boolean changeLevel(World world, BlockPosition blockposition, IBlockData iblockdata, int i, Entity entity, CauldronLevelChangeEvent.ChangeReason reason) {
        return false;
    }

    public void h(World world, BlockPosition blockposition) {
    }

    @Nullable
    public Item getDropType(IBlockData iblockdata, Random random, int i) {
        return null;
    }

    public ItemStack a(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return null;
    }

    public boolean isComplexRedstone(IBlockData iblockdata) {
        return false;
    }

    public int d(IBlockData iblockdata, World world, BlockPosition blockposition) {
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

    public boolean b(IBlockAccess iblockaccess, BlockPosition blockposition) {
        return false;
    }
}
