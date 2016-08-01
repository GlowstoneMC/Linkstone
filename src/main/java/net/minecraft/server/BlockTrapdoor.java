package net.minecraft.server;

import javax.annotation.Nullable;
import org.bukkit.event.block.BlockRedstoneEvent;

// CraftBukkit
public class BlockTrapdoor extends Block {

    public static final BlockStateDirection FACING = null;

    public static final BlockStateBoolean OPEN = null;

    public static final BlockStateEnum<BlockTrapdoor.EnumTrapdoorHalf> HALF = null;

    protected static final AxisAlignedBB d = null;

    protected static final AxisAlignedBB e = null;

    protected static final AxisAlignedBB f = null;

    protected static final AxisAlignedBB g = null;

    protected static final AxisAlignedBB B = null;

    protected static final AxisAlignedBB C = null;

    protected BlockTrapdoor(Material material) {
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

    public boolean b(IBlockAccess iblockaccess, BlockPosition blockposition) {
        return false;
    }

    public boolean interact(World world, BlockPosition blockposition, IBlockData iblockdata, EntityHuman entityhuman, EnumHand enumhand, @Nullable ItemStack itemstack, EnumDirection enumdirection, float f, float f1, float f2) {
        return false;
    }

    protected void a(@Nullable EntityHuman entityhuman, World world, BlockPosition blockposition, boolean flag) {
    }

    public void a(IBlockData iblockdata, World world, BlockPosition blockposition, Block block) {
    }

    public IBlockData getPlacedState(World world, BlockPosition blockposition, EnumDirection enumdirection, float f, float f1, float f2, int i, EntityLiving entityliving) {
        return null;
    }

    public boolean canPlace(World world, BlockPosition blockposition, EnumDirection enumdirection) {
        return false;
    }

    protected static EnumDirection e(int i) {
        return null;
    }

    protected static int a(EnumDirection enumdirection) {
        return 0;
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

    public static enum EnumTrapdoorHalf implements INamable {

        TOP("top"), BOTTOM("bottom");

        private final String c = null;

        private EnumTrapdoorHalf(String s) {
        }

        public String toString() {
            return null;
        }

        public String getName() {
            return null;
        }
    }
}
