package net.minecraft.server;

import java.util.Random;
import javax.annotation.Nullable;
import org.bukkit.event.block.BlockRedstoneEvent;

// CraftBukkit
public class BlockDoor extends Block {

    public static final BlockStateDirection FACING;

    public static final BlockStateBoolean OPEN;

    public static final BlockStateEnum<BlockDoor.EnumDoorHinge> HINGE;

    public static final BlockStateBoolean POWERED;

    public static final BlockStateEnum<BlockDoor.EnumDoorHalf> HALF;

    protected static final AxisAlignedBB f;

    protected static final AxisAlignedBB g;

    protected static final AxisAlignedBB B;

    protected static final AxisAlignedBB C;

    protected BlockDoor(Material material) {
    }

    public AxisAlignedBB a(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    public String getName() {
        return null;
    }

    public boolean b(IBlockData iblockdata) {
        return false;
    }

    public boolean b(IBlockAccess iblockaccess, BlockPosition blockposition) {
        return false;
    }

    public boolean c(IBlockData iblockdata) {
        return false;
    }

    private int e() {
        return 0;
    }

    private int g() {
        return 0;
    }

    public MaterialMapColor r(IBlockData iblockdata) {
        return null;
    }

    public boolean interact(World world, BlockPosition blockposition, IBlockData iblockdata, EntityHuman entityhuman, EnumHand enumhand, @Nullable ItemStack itemstack, EnumDirection enumdirection, float f, float f1, float f2) {
        return false;
    }

    public void setDoor(World world, BlockPosition blockposition, boolean flag) {
    }

    public void a(IBlockData iblockdata, World world, BlockPosition blockposition, Block block) {
    }

    @Nullable
    public Item getDropType(IBlockData iblockdata, Random random, int i) {
        return null;
    }

    public boolean canPlace(World world, BlockPosition blockposition) {
        return false;
    }

    public EnumPistonReaction h(IBlockData iblockdata) {
        return null;
    }

    public static int c(IBlockAccess iblockaccess, BlockPosition blockposition) {
        return 0;
    }

    public ItemStack a(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return null;
    }

    private Item h() {
        return null;
    }

    public void a(World world, BlockPosition blockposition, IBlockData iblockdata, EntityHuman entityhuman) {
    }

    public IBlockData updateState(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    public IBlockData a(IBlockData iblockdata, EnumBlockRotation enumblockrotation) {
        return null;
    }

    public IBlockData a(IBlockData iblockdata, EnumBlockMirror enumblockmirror) {
        return null;
    }

    public IBlockData fromLegacyData(int i) {
        return null;
    }

    public int toLegacyData(IBlockData iblockdata) {
        return 0;
    }

    protected static int e(int i) {
        return 0;
    }

    public static boolean d(IBlockAccess iblockaccess, BlockPosition blockposition) {
        return false;
    }

    public static EnumDirection f(IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    public static EnumDirection f(int i) {
        return null;
    }

    protected static boolean g(int i) {
        return false;
    }

    protected static boolean i(int i) {
        return false;
    }

    protected BlockStateList getStateList() {
        return null;
    }

    static class SyntheticClass_1 {

        static final int[] a;

        static {
        }
    }

    public static enum EnumDoorHinge implements INamable {

        LEFT, RIGHT;

        private EnumDoorHinge() {
        }

        public String toString() {
            return null;
        }

        public String getName() {
            return null;
        }
    }

    public static enum EnumDoorHalf implements INamable {

        UPPER, LOWER;

        private EnumDoorHalf() {
        }

        public String toString() {
            return null;
        }

        public String getName() {
            return null;
        }
    }
}
