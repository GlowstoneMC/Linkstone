package net.minecraft.server;

import com.google.common.collect.AbstractIterator;
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import javax.annotation.concurrent.Immutable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Immutable
public class BlockPosition extends BaseBlockPosition {

    private static final Logger b;

    public static final BlockPosition ZERO;

    private static final int c;

    private static final int d;

    private static final int f;

    private static final int g;

    private static final int h;

    private static final long i;

    private static final long j;

    private static final long k;

    public BlockPosition(int i, int j, int k) {
    }

    public BlockPosition(double d0, double d1, double d2) {
    }

    public BlockPosition(Entity entity) {
    }

    public BlockPosition(Vec3D vec3d) {
    }

    public BlockPosition(BaseBlockPosition baseblockposition) {
    }

    public BlockPosition a(double d0, double d1, double d2) {
        return null;
    }

    public BlockPosition a(int i, int j, int k) {
        return null;
    }

    public BlockPosition a(BaseBlockPosition baseblockposition) {
        return null;
    }

    public BlockPosition b(BaseBlockPosition baseblockposition) {
        return null;
    }

    public BlockPosition up() {
        return null;
    }

    public BlockPosition up(int i) {
        return null;
    }

    public BlockPosition down() {
        return null;
    }

    public BlockPosition down(int i) {
        return null;
    }

    public BlockPosition north() {
        return null;
    }

    public BlockPosition north(int i) {
        return null;
    }

    public BlockPosition south() {
        return null;
    }

    public BlockPosition south(int i) {
        return null;
    }

    public BlockPosition west() {
        return null;
    }

    public BlockPosition west(int i) {
        return null;
    }

    public BlockPosition east() {
        return null;
    }

    public BlockPosition east(int i) {
        return null;
    }

    public BlockPosition shift(EnumDirection enumdirection) {
        return null;
    }

    public BlockPosition shift(EnumDirection enumdirection, int i) {
        return null;
    }

    public BlockPosition c(BaseBlockPosition baseblockposition) {
        return null;
    }

    public long asLong() {
        return 0;
    }

    public static BlockPosition fromLong(long i) {
        return null;
    }

    public static Iterable<BlockPosition> a(BlockPosition blockposition, BlockPosition blockposition1) {
        return null;
    }

    public BlockPosition h() {
        return null;
    }

    public static Iterable<BlockPosition.MutableBlockPosition> b(BlockPosition blockposition, BlockPosition blockposition1) {
        return null;
    }

    public BaseBlockPosition d(BaseBlockPosition baseblockposition) {
        return null;
    }

    public static final class PooledBlockPosition extends BlockPosition.MutableBlockPosition {

        private boolean f;

        private static final List<BlockPosition.PooledBlockPosition> g;

        private PooledBlockPosition(int i, int j, int k) {
        }

        public static BlockPosition.PooledBlockPosition s() {
            return null;
        }

        public static BlockPosition.PooledBlockPosition d(double d0, double d1, double d2) {
            return null;
        }

        public static BlockPosition.PooledBlockPosition e(int i, int j, int k) {
            return null;
        }

        public void t() {
        }

        public BlockPosition.PooledBlockPosition f(int i, int j, int k) {
            return null;
        }

        public BlockPosition.PooledBlockPosition e(double d0, double d1, double d2) {
            return null;
        }

        public BlockPosition.PooledBlockPosition j(BaseBlockPosition baseblockposition) {
            return null;
        }

        public BlockPosition.PooledBlockPosition d(EnumDirection enumdirection) {
            return null;
        }

        public BlockPosition.PooledBlockPosition d(EnumDirection enumdirection, int i) {
            return null;
        }

        public BlockPosition.MutableBlockPosition c(EnumDirection enumdirection, int i) {
            return null;
        }

        public BlockPosition.MutableBlockPosition c(EnumDirection enumdirection) {
            return null;
        }

        public BlockPosition.MutableBlockPosition g(BaseBlockPosition baseblockposition) {
            return null;
        }

        public BlockPosition.MutableBlockPosition c(double d0, double d1, double d2) {
            return null;
        }

        public BlockPosition.MutableBlockPosition c(int i, int j, int k) {
            return null;
        }
    }

    public static class MutableBlockPosition extends BlockPosition {

        protected int b;

        protected int c;

        protected int d;

        public MutableBlockPosition() {
        }

        public MutableBlockPosition(BlockPosition blockposition) {
        }

        public MutableBlockPosition(int i, int j, int k) {
        }

        public int getX() {
            return 0;
        }

        public int getY() {
            return 0;
        }

        public int getZ() {
            return 0;
        }

        public BlockPosition.MutableBlockPosition c(int i, int j, int k) {
            return null;
        }

        public BlockPosition.MutableBlockPosition c(double d0, double d1, double d2) {
            return null;
        }

        public BlockPosition.MutableBlockPosition g(BaseBlockPosition baseblockposition) {
            return null;
        }

        public BlockPosition.MutableBlockPosition c(EnumDirection enumdirection) {
            return null;
        }

        public BlockPosition.MutableBlockPosition c(EnumDirection enumdirection, int i) {
            return null;
        }

        public void p(int i) {
        }

        public BlockPosition h() {
            return null;
        }

        public BaseBlockPosition d(BaseBlockPosition baseblockposition) {
            return null;
        }
    }
}
