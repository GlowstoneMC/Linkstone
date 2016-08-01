package net.minecraft.server;

import com.google.common.cache.LoadingCache;
import java.util.Random;
import javax.annotation.Nullable;
import org.bukkit.event.entity.EntityPortalEnterEvent;
// CraftBukkit
import org.bukkit.event.world.PortalCreateEvent;

// CraftBukkit
public class BlockPortal extends BlockHalfTransparent {

    public static final BlockStateEnum<EnumDirection.EnumAxis> AXIS = null;

    protected static final AxisAlignedBB b = null;

    protected static final AxisAlignedBB c = null;

    protected static final AxisAlignedBB d = null;

    public BlockPortal() {
    }

    public AxisAlignedBB a(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    public void b(World world, BlockPosition blockposition, IBlockData iblockdata, Random random) {
    }

    @Nullable
    public AxisAlignedBB a(IBlockData iblockdata, World world, BlockPosition blockposition) {
        return null;
    }

    public static int a(EnumDirection.EnumAxis enumdirection_enumaxis) {
        return 0;
    }

    public boolean c(IBlockData iblockdata) {
        return false;
    }

    public boolean b(World world, BlockPosition blockposition) {
        return false;
    }

    public void a(IBlockData iblockdata, World world, BlockPosition blockposition, Block block) {
    }

    public int a(Random random) {
        return 0;
    }

    public void a(World world, BlockPosition blockposition, IBlockData iblockdata, Entity entity) {
    }

    @Nullable
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

    protected BlockStateList getStateList() {
        return null;
    }

    public ShapeDetector.ShapeDetectorCollection c(World world, BlockPosition blockposition) {
        return null;
    }

    static class SyntheticClass_1 {

        static final int[] a = null;

        static final int[] b = null;

        static {
        }
    }

    public static class Shape {

        private final World a = null;

        private final EnumDirection.EnumAxis b = null;

        private final EnumDirection c = null;

        private final EnumDirection d = null;

        private int e = 0;

        private BlockPosition position = null;

        private int height = 0;

        private int width = 0;

        java.util.Collection<org.bukkit.block.Block> blocks = null;

        // CraftBukkit - add field
        public Shape(World world, BlockPosition blockposition, EnumDirection.EnumAxis enumdirection_enumaxis) {
        }

        protected int a(BlockPosition blockposition, EnumDirection enumdirection) {
            return 0;
        }

        public int a() {
            return 0;
        }

        public int b() {
            return 0;
        }

        protected int c() {
            return 0;
        }

        protected boolean a(Block block) {
            return false;
        }

        public boolean d() {
            return false;
        }

        // CraftBukkit start - return boolean
        public boolean createPortal() {
            return false;
        }
    }
}
