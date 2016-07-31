package net.minecraft.server;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import javax.annotation.Nullable;
import org.bukkit.event.block.BlockRedstoneEvent;

// CraftBukkit
public class BlockRedstoneWire extends Block {

    public static final BlockStateEnum<BlockRedstoneWire.EnumRedstoneWireConnection> NORTH;

    public static final BlockStateEnum<BlockRedstoneWire.EnumRedstoneWireConnection> EAST;

    public static final BlockStateEnum<BlockRedstoneWire.EnumRedstoneWireConnection> SOUTH;

    public static final BlockStateEnum<BlockRedstoneWire.EnumRedstoneWireConnection> WEST;

    public static final BlockStateInteger POWER;

    protected static final AxisAlignedBB[] f;

    private boolean g;

    private final Set<BlockPosition> B;

    public BlockRedstoneWire() {
    }

    public AxisAlignedBB a(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    private static int x(IBlockData iblockdata) {
        return 0;
    }

    public IBlockData updateState(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    private BlockRedstoneWire.EnumRedstoneWireConnection b(IBlockAccess iblockaccess, BlockPosition blockposition, EnumDirection enumdirection) {
        return null;
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

    public boolean canPlace(World world, BlockPosition blockposition) {
        return false;
    }

    private IBlockData e(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return null;
    }

    private IBlockData a(World world, BlockPosition blockposition, BlockPosition blockposition1, IBlockData iblockdata) {
        return null;
    }

    private void b(World world, BlockPosition blockposition) {
    }

    public void onPlace(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    public void remove(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    public int getPower(World world, BlockPosition blockposition, int i) {
        return 0;
    }

    public void a(IBlockData iblockdata, World world, BlockPosition blockposition, Block block) {
    }

    @Nullable
    public Item getDropType(IBlockData iblockdata, Random random, int i) {
        return null;
    }

    public int c(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition, EnumDirection enumdirection) {
        return 0;
    }

    public int b(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition, EnumDirection enumdirection) {
        return 0;
    }

    private boolean c(IBlockAccess iblockaccess, BlockPosition blockposition, EnumDirection enumdirection) {
        return false;
    }

    protected static boolean c(IBlockAccess iblockaccess, BlockPosition blockposition) {
        return false;
    }

    protected static boolean i(IBlockData iblockdata) {
        return false;
    }

    protected static boolean a(IBlockData iblockdata, @Nullable EnumDirection enumdirection) {
        return false;
    }

    public boolean isPowerSource(IBlockData iblockdata) {
        return false;
    }

    public ItemStack a(World world, BlockPosition blockposition, IBlockData iblockdata) {
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

    static class SyntheticClass_1 {

        static final int[] a;

        static final int[] b;

        static {
        }
    }

    static enum EnumRedstoneWireConnection implements INamable {

        UP("up"), SIDE("side"), NONE("none");

        private final String d;

        private EnumRedstoneWireConnection(String s) {
        }

        public String toString() {
            return null;
        }

        public String getName() {
            return null;
        }
    }
}
