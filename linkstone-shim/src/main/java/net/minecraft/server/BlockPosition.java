package net.minecraft.server;

import javax.annotation.concurrent.Immutable;

import com.google.common.collect.AbstractIterator;
import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LConstructor;
import net.glowstone.linkstone.annotations.LField;
import net.glowstone.linkstone.annotations.LGenerate;
import net.glowstone.linkstone.annotations.LMethod;
import net.glowstone.linkstone.annotations.LOverride;
import org.apache.commons.lang.mutable.Mutable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
@Immutable
public class BlockPosition extends BaseBlockPosition {
    @LGenerate
    @LField(version = V1_12_R1, name = "b")
    private static final Logger LOGGER = LogManager.getLogger();

    @LGenerate
    @LField(version = V1_12_R1)
    public static final BlockPosition ZERO = new BlockPosition(0, 0, 0);

    /**
     * Amount of bits that the x-coordinate fills in a long encoded BlockPosition.
     */
    @LGenerate
    @LField(version = V1_12_R1, name = "c")
    private static final int X_COORD_BIT_COUNT = 26;

    /**
     * Amount of bits that the y-coordinate fills in a long encoded BlockPosition.
     */
    @LGenerate
    @LField(version = V1_12_R1, name = "f")
    private static final int Y_COORD_BIT_COUNT = 12;

    /**
     * Amount of bits that the z-coordinate fills in a long encoded BlockPosition.
     */
    @LGenerate
    @LField(version = V1_12_R1, name = "d")
    private static final int Z_COORD_BIT_COUNT = 26;

    /**
     * Offset of the x-coordinate in a long encoded BlockPosition.
     */
    private static final int Z_COORD_OFFSET = 0;

    /**
     * Offset of the y-coordinate in a long encoded BlockPosition
     */
    @LGenerate
    @LField(version = V1_12_R1, name = "g")
    private static final int Y_COORD_OFFSET = Z_COORD_OFFSET + Z_COORD_BIT_COUNT;

    /**
     * Offset of the x-coordinate in a long encoded BlockPosition
     */
    @LGenerate
    @LField(version = V1_12_R1, name = "h")
    private static final int X_COORD_OFFSET = Y_COORD_OFFSET + Y_COORD_BIT_COUNT;

    @LGenerate
    @LField(version = V1_12_R1, name = "i")
    private static final long X_COORD_BIT_MASK = getBitMask(X_COORD_BIT_COUNT);

    @LGenerate
    @LField(version = V1_12_R1, name = "j")
    private static final long Y_COORD_BIT_MASK = getBitMask(Y_COORD_BIT_COUNT);

    @LGenerate
    @LField(version = V1_12_R1, name = "k")
    private static final long Z_COORD_BIT_MASK = getBitMask(Z_COORD_BIT_COUNT);

    /**
     * Get a bitmask for a certain amount of bits
     *
     * @param bits in the bitmask
     * @return the bitmask for the request bit count
     */
    private static long getBitMask(int bits) {
        return (1L << bits) - 1L;
    }

    @LMethod(version = V1_12_R1, name = "o")
    public static Logger getLogger() {
        return LOGGER;
    }

    /**
     * Load a BlockPosition encoded into one long value.
     *
     * BlockPositions can be encoded into one 64-bit one value since the x and z coordinate are
     * 26-bit values and the y-coordinate is a 12-bit value.
     *
     * @param encoded a encoded BlockPosition
     * @return decoded BlockPosition
     */
    public static BlockPosition fromLong(long encoded) {
        int x = (int) ((encoded >>> X_COORD_OFFSET) & X_COORD_BIT_MASK);
        int y = (int) ((encoded >>> Y_COORD_OFFSET) & Y_COORD_BIT_MASK);
        int z = (int) (encoded & Z_COORD_BIT_MASK);
        return new BlockPosition(x, y, z);
    }

    /**
     * Get an {@link Iterable} over all blocks between two point.
     * The second point is exclusive.
     *
     * @param pos1 first point
     * @param pos2 second point
     * @return Iterable over the area between both points
     */
    @LMethod(version = V1_12_R1, name = "a")
    public static Iterable<BlockPosition> getArea(BlockPosition pos1, BlockPosition pos2) {
        return getArea(pos1.getX(), pos1.getY(), pos1.getZ(),
                pos2.getX(), pos2.getY(), pos2.getZ());
    }

    /**
     * Get an {@link Iterable} over all blocks between two point.
     * The second point is exclusive.
     *
     * @param minX x-coordinate of first point
     * @param minY y-coordinate of first point
     * @param minZ z-coordinate of first point
     * @param maxX x-coordinate of second point
     * @param maxY y-coordinate of second point
     * @param maxZ z-coordinate of second point
     * @return Iterable over the area between both points
     */
    @LMethod(version = V1_12_R1, name = "a")
    public static Iterable<BlockPosition> getArea(final int minX, final int minY, final int minZ,
                                                  final int maxX, final int maxY, final int maxZ) {
        return () -> new Iterator<BlockPosition>() {
            int x = minX;
            int y = minY;
            int z = minZ;

            @Override
            public boolean hasNext() {
                return x < maxX && y < maxY && z < maxZ;
            }

            @Override
            public BlockPosition next() {
                BlockPosition pos = new BlockPosition(x, y, z);
                if (++x >= maxX) {
                    x = minX;
                    if (++y >= maxY) {
                        y = minY;
                        ++z;
                    }
                }
                return pos;
            }
        };
    }

    /**
     * Get an {@link Iterable} over all blocks between two point.
     * The second point is exclusive.
     *
     * A {@link Iterator} as received from the {@link Iterable} returns always the same
     * {@link MutableBlockPosition} with different coordinates.
     *
     * @param pos1 first point
     * @param pos2 second point
     * @return Iterable over the area between both points
     */
    @LMethod(version = V1_12_R1, name = "b")
    public static Iterable<MutableBlockPosition> getMutableArea(BlockPosition pos1, BlockPosition pos2) {
        return getMutableArea(pos1.getX(), pos1.getY(), pos1.getZ(),
                pos2.getX(), pos2.getY(), pos2.getZ());
    }

    /**
     * Get an {@link Iterable} over all blocks between two point.
     * The second point is exclusive.
     *
     * A {@link Iterator} as received from the {@link Iterable} returns always the same
     * {@link MutableBlockPosition} with different coordinates.
     *
     * @param minX x-coordinate of first point
     * @param minY y-coordinate of first point
     * @param minZ z-coordinate of first point
     * @param maxX x-coordinate of second point
     * @param maxY y-coordinate of second point
     * @param maxZ z-coordinate of second point
     * @return Iterable over the area between both points
     */
    @LMethod(version = V1_12_R1, name = "b")
    public static Iterable<MutableBlockPosition> getMutableArea(final int minX, final int minY, final int minZ,
                                                   final int maxX, final int maxY, final int maxZ) {
        return () -> new Iterator<MutableBlockPosition>() {
            MutableBlockPosition pos = null;

            @Override
            public boolean hasNext() {
                return pos == null || pos.x < maxX && pos.y < maxY && pos.z < maxZ;
            }

            @Override
            public MutableBlockPosition next() {
                if (pos == null) {
                    pos = new MutableBlockPosition(minX, minY, minZ);
                } else {
                    if (++pos.x >= maxX) {
                        pos.x = minX;
                        if (++pos.y >= maxY) {
                            pos.y = minY;
                            ++pos.z;
                        }
                    }
                }
                return pos;
            }
        };
    }

    @LConstructor(version = V1_12_R1)
    public BlockPosition(int x, int y, int z) {
        super(x, y, z);
    }

    @LConstructor(version = V1_12_R1)
    public BlockPosition(double x, double y, double z) {
        super(x, y, z);
    }

    @LConstructor(version = V1_12_R1)
    public BlockPosition(Entity entity) {
        this(entity.locX, entity.locY, entity.locZ);
    }

    @LConstructor(version = V1_12_R1)
    public BlockPosition(Vec3D vec3d) {
        this(vec3d.x, vec3d.y, vec3d.z);
    }

    public BlockPosition(BaseBlockPosition that) {
        this(that.getX(), that.getY(), that.getZ());
    }

    @LMethod(version = V1_12_R1, name = "a")
    public BlockPosition add(double x, double y, double z) {
        return x == 0 && y == 0 && z == 0 ? this :
                new BlockPosition(this.getX() + x, this.getY() + y, this.getZ() + z);
    }

    @LMethod(version = V1_12_R1, name = "a")
    public BlockPosition add(int x, int y, int z) {
        return x == 0 && y == 0 && z == 0 ? this :
                new BlockPosition(this.getX() + x, this.getY() + y, this.getZ() + z);
    }

    @LMethod(version = V1_12_R1, name = "a")
    public BlockPosition add(BaseBlockPosition that) {
        return add(that.getX(), that.getY(), that.getZ());
    }

    @LMethod(version = V1_12_R1, name = "b")
    public BlockPosition subtract(BaseBlockPosition that) {
        return add(-that.getX(), -that.getY(), -that.getZ());
    }

    @LMethod(version = V1_12_R1)
    public BlockPosition up() {
        return this.up(1);
    }

    @LMethod(version = V1_12_R1)
    public BlockPosition up(int offset) {
        return this.shift(EnumDirection.UP, offset);
    }

    @LMethod(version = V1_12_R1)
    public BlockPosition down() {
        return this.down(1);
    }

    @LMethod(version = V1_12_R1)
    public BlockPosition down(int offset) {
        return this.shift(EnumDirection.DOWN, offset);
    }

    @LMethod(version = V1_12_R1)
    public BlockPosition north() {
        return this.north(1);
    }

    @LMethod(version = V1_12_R1)
    public BlockPosition north(int offset) {
        return this.shift(EnumDirection.NORTH, offset);
    }

    @LMethod(version = V1_12_R1)
    public BlockPosition south() {
        return this.south(1);
    }

    @LMethod(version = V1_12_R1)
    public BlockPosition south(int offset) {
        return this.shift(EnumDirection.SOUTH, offset);
    }

    @LMethod(version = V1_12_R1)
    public BlockPosition west() {
        return this.west(1);
    }

    @LMethod(version = V1_12_R1)
    public BlockPosition west(int offset) {
        return this.shift(EnumDirection.WEST, offset);
    }

    @LMethod(version = V1_12_R1)
    public BlockPosition east() {
        return this.east(1);
    }

    @LMethod(version = V1_12_R1)
    public BlockPosition east(int offset) {
        return this.shift(EnumDirection.EAST, offset);
    }

    @LMethod(version = V1_12_R1)
    public BlockPosition shift(EnumDirection direction) {
        return this.shift(direction, 1);
    }

    @LMethod(version = V1_12_R1)
    public BlockPosition shift(EnumDirection direction, int offset) {
        return new BlockPosition(
                getX() + (direction.getAdjacentX() * offset),
                getY() + (direction.getAdjacentY() * offset),
                getZ() + (direction.getAdjacentZ() * offset));
    }

    /**
     * Rotate this vector around the y-axis.
     *
     * @param rotation how to rotate
     * @return rotated vector
     */
    @LMethod(version = V1_12_R1, name = "a")
    public BlockPosition rotate(EnumBlockRotation rotation) {
        switch (rotation) {
            case NONE: return this;
            case CLOCKWISE_90: return new BlockPosition(-getZ(), getY(), getX());
            case CLOCKWISE_180: return new BlockPosition(-getX(), getY(), -getZ());
            case COUNTERCLOCKWISE_90: return new BlockPosition(getZ(), getY(), -getX());
            default: throw new IllegalStateException();
        }
    }

    // Override of BaseBlockPosition#crossProduct(BaseBlockPosition)
    @LMethod(version = V1_12_R1, name = "c")
    public BlockPosition _crossProduct(BaseBlockPosition that) {
        return new BlockPosition(
                this.getY() * that.getZ() - this.getZ() * that.getY(),
                this.getZ() * that.getX() - this.getX() * that.getZ(),
                this.getX() * that.getY() - this.getY() * that.getX());
    }

    // A synthetic method generated by the compiler.
    // It let's the crossProduct method be overridden even though
    // the return type of '_crossProduct' does not match.
    @Override
    @LOverride
    public BaseBlockPosition crossProduct(BaseBlockPosition that) {
        return _crossProduct(that);
    }

    /**
     * Get a copy of the current state of this block position.
     *
     * @return copy of this BlockPosition
     * @see MutableBlockPosition#copy()
     */
    @LMethod(version = V1_12_R1, name = "h")
    public BlockPosition copy() {
        return this;
    }

    /**
     * Encode a BlockPosition as one long value
     *
     * @return this position encoded into one long
     * @see BlockPosition#fromLong(long)
     */
    public long asLong() {
        // The coordinates are shifted all to the left and back again to restore the sign.
        return  ((long) getX() << (64 - X_COORD_BIT_COUNT - X_COORD_OFFSET) >> (64 - X_COORD_BIT_COUNT)) |
                ((long) getY() << (64 - Y_COORD_BIT_COUNT - Y_COORD_OFFSET) >> (64 - Y_COORD_BIT_COUNT)) |
                ((long) getZ() << (64 - Z_COORD_BIT_COUNT - Z_COORD_OFFSET) >> (64 - Z_COORD_BIT_COUNT));
    }

    @LClassfile(version = V1_12_R1)
    public static class MutableBlockPosition extends BlockPosition {
        @LGenerate
        @LField(version = V1_12_R1, name = "b")
        protected int x;

        @LGenerate
        @LField(version = V1_12_R1, name = "c")
        protected int y;

        @LGenerate
        @LField(version = V1_12_R1, name = "d")
        protected int z;

        @LConstructor(version = V1_12_R1)
        public MutableBlockPosition() {
            this(0, 0, 0);
        }

        @LConstructor(version = V1_12_R1)
        public MutableBlockPosition(BlockPosition b) {
            this(b.getX(), b.getY(), b.getZ());
        }

        @LConstructor(version = V1_12_R1)
        public MutableBlockPosition(int x, int y, int z) {
            super(0, 0, 0);
            this.x = x;
            this.y = y;
            this.z = z;
        }

        @Override
        @LOverride
        public int getX() {
            return x;
        }

        @Override
        @LOverride
        public int getY() {
            return y;
        }

        @Override
        @LOverride
        public int getZ() {
            return z;
        }

        @LMethod(version = V1_12_R1, name = "p")
        public void setY(int y) {
            this.y = y;
        }

        /**
         * Change the coordinates of this BlockPosition.
         *
         * @param x coordinate to be set
         * @param y coordinate to be set
         * @param z coordinate to be set
         * @return this updated BlockPosition
         */
        @LMethod(version = V1_12_R1, name = "c")
        public MutableBlockPosition update(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
            return this;
        }

        /**
         * Change the coordinates of this BlockPosition.
         *
         * @param x coordinate to be floored and set
         * @param y coordinate to be floored and set
         * @param z coordinate to be floored and set
         * @return this updated BlockPosition
         */
        @LMethod(version = V1_12_R1, name = "c")
        public MutableBlockPosition update(double x, double y, double z) {
            return update(MathHelper.floor(x), MathHelper.floor(y), MathHelper.floor(z));
        }

        /**
         * Apply the coordinates of another block position.
         *
         * @param position other position whose values should be applied
         * @return this updated BlockPosition
         */
        @LMethod(version = V1_12_R1, name = "g")
        public MutableBlockPosition update(BaseBlockPosition position) {
            return update(position.getX(), position.getY(), position.getZ());
        }

        @Override
        @LOverride
        public BlockPosition copy() {
            return new BlockPosition(this);
        }

        @Override
        @LOverride
        public BlockPosition add(double x, double y, double z) {
            return super.add(x, y, z).copy();
        }

        @Override
        @LOverride
        public BlockPosition add(int x, int y, int z) {
            return super.add(x, y, z).copy();
        }

        @Override
        @LOverride
        public BlockPosition shift(EnumDirection direction, int offset) {
            return super.shift(direction, offset).copy();
        }

        @LMethod(version = V1_12_R1, name = "c")
        public BlockPosition.MutableBlockPosition shiftSelf(EnumDirection direction) {
            return shiftSelf(direction, 1);
        }

        @LMethod(version = V1_12_R1, name = "c")
        public BlockPosition.MutableBlockPosition shiftSelf(EnumDirection direction, int offset) {
            this.x += direction.getAdjacentX() * offset;
            this.y += direction.getAdjacentY() * offset;
            this.z += direction.getAdjacentZ() * offset;
            return this;
        }
    }

    @LClassfile(version = V1_12_R1)
    public static final class PooledBlockPosition extends MutableBlockPosition {
        // TODO
    }
}