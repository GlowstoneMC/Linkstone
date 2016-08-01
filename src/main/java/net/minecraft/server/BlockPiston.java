package net.minecraft.server;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
// CraftBukkit start
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import com.google.common.collect.ImmutableList;
import org.bukkit.craftbukkit.block.CraftBlock;
import org.bukkit.event.block.BlockPistonRetractEvent;
import org.bukkit.event.block.BlockPistonExtendEvent;

// CraftBukkit end
public class BlockPiston extends BlockDirectional {

    public static final BlockStateBoolean EXTENDED = null;

    protected static final AxisAlignedBB b = null;

    protected static final AxisAlignedBB c = null;

    protected static final AxisAlignedBB d = null;

    protected static final AxisAlignedBB e = null;

    protected static final AxisAlignedBB f = null;

    protected static final AxisAlignedBB g = null;

    private final boolean sticky = false;

    public BlockPiston(boolean flag) {
    }

    public AxisAlignedBB a(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    public boolean k(IBlockData iblockdata) {
        return false;
    }

    public void a(IBlockData iblockdata, World world, BlockPosition blockposition, AxisAlignedBB axisalignedbb, List<AxisAlignedBB> list, @Nullable Entity entity) {
    }

    public boolean b(IBlockData iblockdata) {
        return false;
    }

    public void postPlace(World world, BlockPosition blockposition, IBlockData iblockdata, EntityLiving entityliving, ItemStack itemstack) {
    }

    public void a(IBlockData iblockdata, World world, BlockPosition blockposition, Block block) {
    }

    public void onPlace(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    public IBlockData getPlacedState(World world, BlockPosition blockposition, EnumDirection enumdirection, float f, float f1, float f2, int i, EntityLiving entityliving) {
        return null;
    }

    private void e(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    private boolean a(World world, BlockPosition blockposition, EnumDirection enumdirection) {
        return false;
    }

    public boolean a(IBlockData iblockdata, World world, BlockPosition blockposition, int i, int j) {
        return false;
    }

    public boolean c(IBlockData iblockdata) {
        return false;
    }

    @Nullable
    public static EnumDirection e(int i) {
        return null;
    }

    public static EnumDirection a(BlockPosition blockposition, EntityLiving entityliving) {
        return null;
    }

    public static boolean a(IBlockData iblockdata, World world, BlockPosition blockposition, EnumDirection enumdirection, boolean flag) {
        return false;
    }

    private boolean a(World world, BlockPosition blockposition, EnumDirection enumdirection, boolean flag) {
        return false;
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

    static class SyntheticClass_1 {

        static final int[] a = null;

        static {
        }
    }
}
