package net.minecraft.server;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public abstract class BlockMinecartTrackAbstract extends Block {

    protected static final AxisAlignedBB a = null;

    protected final boolean b = false;

    public static boolean b(World world, BlockPosition blockposition) {
        return false;
    }

    public static boolean i(IBlockData iblockdata) {
        return false;
    }

    protected BlockMinecartTrackAbstract(boolean flag) {
    }

    @Nullable
    public AxisAlignedBB a(IBlockData iblockdata, World world, BlockPosition blockposition) {
        return null;
    }

    public boolean b(IBlockData iblockdata) {
        return false;
    }

    public AxisAlignedBB a(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    public boolean c(IBlockData iblockdata) {
        return false;
    }

    public boolean canPlace(World world, BlockPosition blockposition) {
        return false;
    }

    public void onPlace(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    public void a(IBlockData iblockdata, World world, BlockPosition blockposition, Block block) {
    }

    protected void b(IBlockData iblockdata, World world, BlockPosition blockposition, Block block) {
    }

    protected IBlockData a(World world, BlockPosition blockposition, IBlockData iblockdata, boolean flag) {
        return null;
    }

    public EnumPistonReaction h(IBlockData iblockdata) {
        return null;
    }

    public void remove(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    public abstract IBlockState<BlockMinecartTrackAbstract.EnumTrackPosition> g();

    static class SyntheticClass_1 {

        static final int[] a = null;

        static {
        }
    }

    public static enum EnumTrackPosition implements INamable {

        NORTH_SOUTH(0, "north_south"), EAST_WEST(1, "east_west"), ASCENDING_EAST(2, "ascending_east"), ASCENDING_WEST(3, "ascending_west"), ASCENDING_NORTH(4, "ascending_north"), ASCENDING_SOUTH(5, "ascending_south"), SOUTH_EAST(6, "south_east"), SOUTH_WEST(7, "south_west"), NORTH_WEST(8, "north_west"), NORTH_EAST(9, "north_east");

        private static final BlockMinecartTrackAbstract.EnumTrackPosition[] k = null;

        private final int l = 0;

        private final String m = null;

        private EnumTrackPosition(int i, String s) {
        }

        public int a() {
            return 0;
        }

        public String toString() {
            return null;
        }

        public boolean c() {
            return false;
        }

        public static BlockMinecartTrackAbstract.EnumTrackPosition a(int i) {
            return null;
        }

        public String getName() {
            return null;
        }

        static {
        }
    }

    public class MinecartTrackLogic {

        private final World b = null;

        private final BlockPosition c = null;

        private final BlockMinecartTrackAbstract d = null;

        private IBlockData e = null;

        private final boolean f = false;

        private final List<BlockPosition> g = null;

        public MinecartTrackLogic(World world, BlockPosition blockposition, IBlockData iblockdata) {
        }

        public List<BlockPosition> a() {
            return null;
        }

        private void a(BlockMinecartTrackAbstract.EnumTrackPosition blockminecarttrackabstract_enumtrackposition) {
        }

        private void d() {
        }

        private boolean a(BlockPosition blockposition) {
            return false;
        }

        @Nullable
        private BlockMinecartTrackAbstract.MinecartTrackLogic b(BlockPosition blockposition) {
            return null;
        }

        private boolean a(BlockMinecartTrackAbstract.MinecartTrackLogic blockminecarttrackabstract_minecarttracklogic) {
            return false;
        }

        private boolean c(BlockPosition blockposition) {
            return false;
        }

        protected int b() {
            return 0;
        }

        private boolean b(BlockMinecartTrackAbstract.MinecartTrackLogic blockminecarttrackabstract_minecarttracklogic) {
            return false;
        }

        private void c(BlockMinecartTrackAbstract.MinecartTrackLogic blockminecarttrackabstract_minecarttracklogic) {
        }

        private boolean d(BlockPosition blockposition) {
            return false;
        }

        public BlockMinecartTrackAbstract.MinecartTrackLogic a(boolean flag, boolean flag1) {
            return null;
        }

        public IBlockData c() {
            return null;
        }
    }
}
