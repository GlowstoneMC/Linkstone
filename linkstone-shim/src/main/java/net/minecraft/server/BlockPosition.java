package net.minecraft.server;

import javax.annotation.concurrent.Immutable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Immutable
public class BlockPosition
extends BaseBlockPosition {
    private static final Logger b = LogManager.getLogger();
    public static final BlockPosition ZERO = new BlockPosition(0, 0, 0);
    private static final int c;
    private static final int d;
    private static final int f;
    private static final int g;
    private static final int h;
    private static final long i;
    private static final long j;
    private static final long k;

    public BlockPosition(int i2, int j, int k) {
        super(i2, j, k);
    }

    public BlockPosition(double d0, double d1, double d2) {
        super(d0, d1, d2);
    }

    public BlockPosition(Entity entity) {
        this(entity.locX, entity.locY, entity.locZ);
    }

    public BlockPosition(Vec3D vec3d) {
        this(vec3d.x, vec3d.y, vec3d.z);
    }

    public BlockPosition(BaseBlockPosition baseblockposition) {
        this(baseblockposition.getX(), baseblockposition.getY(), baseblockposition.getZ());
    }

    public BlockPosition add(double x, double y, double z) {
        return this.a(x, y, z);
    }

    public BlockPosition a(double d0, double d1, double d2) {
        return null;
    }

    public BlockPosition a(int i2, int j, int k) {
        return null;
    }

    public BlockPosition a(BaseBlockPosition baseblockposition) {
        return null;
    }

    public BlockPosition b(BaseBlockPosition baseblockposition) {
        return null;
    }

    public BlockPosition up() {
        return this.up(1);
    }

    public BlockPosition up(int i2) {
        return this.shift(EnumDirection.UP, i2);
    }

    public BlockPosition down() {
        return this.down(1);
    }

    public BlockPosition down(int i2) {
        return this.shift(EnumDirection.DOWN, i2);
    }

    public BlockPosition north() {
        return this.north(1);
    }

    public BlockPosition north(int i2) {
        return this.shift(EnumDirection.NORTH, i2);
    }

    public BlockPosition south() {
        return this.south(1);
    }

    public BlockPosition south(int i2) {
        return this.shift(EnumDirection.SOUTH, i2);
    }

    public BlockPosition west() {
        return this.west(1);
    }

    public BlockPosition west(int i2) {
        return this.shift(EnumDirection.WEST, i2);
    }

    public BlockPosition east() {
        return this.east(1);
    }

    public BlockPosition east(int i2) {
        return this.shift(EnumDirection.EAST, i2);
    }

    public BlockPosition shift(EnumDirection e) {
        return this.shift(e, 1);
    }

    public BlockPosition shift(EnumDirection e, int i) {
        return null;
    }

    public BlockPosition a(EnumBlockRotation e) {
        return null;
    }

    public BlockPosition c(BaseBlockPosition b) {
        return null;
    }

    public long asLong() {
        return -1L;
    }

    public static BlockPosition fromLong(long i2) {
        return null;
    }

    public static Iterable<BlockPosition> a(BlockPosition blockposition, BlockPosition blockposition1) {
        return null;
    }

    public static Iterable<BlockPosition> a(final int i2, final int j, final int k, final int l, final int i1, final int j1) {
        return null;
    }

    public BlockPosition h() {
        return this;
    }

    public static Iterable<MutableBlockPosition> b(BlockPosition blockposition, BlockPosition blockposition1) {
        return null;
    }

    public static Iterable<MutableBlockPosition> b(final int i2, final int j, final int k, final int l, final int i1, final int j1) {
        return null;
    }

    @Override
    public BaseBlockPosition d(BaseBlockPosition baseblockposition) {
        return this.c(baseblockposition);
    }

    static {
        c = 0;
        d = 0;
        f = 0;
        g = 0;
        h = 0;
        i = 0;
        j = 0;
        k = 0;
        // TODO: LINKSTONE: Real values
    }

    public static class MutableBlockPosition extends BlockPosition { // TODO
        public MutableBlockPosition() {
            this(0, 0, 0);
        }

        public MutableBlockPosition(BlockPosition b) {
            this(b.getX(), b.getY(), b.getZ());
        }

        public MutableBlockPosition(int i2, int j, int k) {
            super(0, 0, 0);
        }

        public void setValues(int chunkX, int i, int chunkZ) {
            // TODO Auto-generated method stub
        }
    }

    public static final class PooledBlockPosition extends MutableBlockPosition { // TODO
    }

}