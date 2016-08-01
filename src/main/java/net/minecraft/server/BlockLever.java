package net.minecraft.server;

import java.util.Iterator;
import javax.annotation.Nullable;
import org.bukkit.event.block.BlockRedstoneEvent;

// CraftBukkit
public class BlockLever extends Block {

    public static final BlockStateEnum<BlockLever.EnumLeverPosition> FACING = null;

    public static final BlockStateBoolean POWERED = null;

    protected static final AxisAlignedBB c = null;

    protected static final AxisAlignedBB d = null;

    protected static final AxisAlignedBB e = null;

    protected static final AxisAlignedBB f = null;

    protected static final AxisAlignedBB g = null;

    protected static final AxisAlignedBB B = null;

    protected BlockLever() {
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

    public boolean canPlace(World world, BlockPosition blockposition, EnumDirection enumdirection) {
        return false;
    }

    public boolean canPlace(World world, BlockPosition blockposition) {
        return false;
    }

    protected static boolean a(World world, BlockPosition blockposition, EnumDirection enumdirection) {
        return false;
    }

    public IBlockData getPlacedState(World world, BlockPosition blockposition, EnumDirection enumdirection, float f, float f1, float f2, int i, EntityLiving entityliving) {
        return null;
    }

    public void a(IBlockData iblockdata, World world, BlockPosition blockposition, Block block) {
    }

    private boolean e(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return false;
    }

    public AxisAlignedBB a(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    public boolean interact(World world, BlockPosition blockposition, IBlockData iblockdata, EntityHuman entityhuman, EnumHand enumhand, @Nullable ItemStack itemstack, EnumDirection enumdirection, float f, float f1, float f2) {
        return false;
    }

    public void remove(World world, BlockPosition blockposition, IBlockData iblockdata) {
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

        static final int[] b = null;

        static final int[] c = null;

        static final int[] d = null;

        static {
        }
    }

    public static enum EnumLeverPosition implements INamable {

        DOWN_X(0, "down_x", EnumDirection.DOWN), EAST(1, "east", EnumDirection.EAST), WEST(2, "west", EnumDirection.WEST), SOUTH(3, "south", EnumDirection.SOUTH), NORTH(4, "north", EnumDirection.NORTH), UP_Z(5, "up_z", EnumDirection.UP), UP_X(6, "up_x", EnumDirection.UP), DOWN_Z(7, "down_z", EnumDirection.DOWN);

        private static final BlockLever.EnumLeverPosition[] i = null;

        private final int j = 0;

        private final String k = null;

        private final EnumDirection l = null;

        private EnumLeverPosition(int i, String s, EnumDirection enumdirection) {
        }

        public int a() {
            return 0;
        }

        public EnumDirection c() {
            return null;
        }

        public String toString() {
            return null;
        }

        public static BlockLever.EnumLeverPosition a(int i) {
            return null;
        }

        public static BlockLever.EnumLeverPosition a(EnumDirection enumdirection, EnumDirection enumdirection1) {
            return null;
        }

        public String getName() {
            return null;
        }

        static {
        }
    }
}
