package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LConstructor;
import net.glowstone.linkstone.annotations.LMethod;

import java.util.Objects;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class ChunkCoordIntPair {
    public final int x;
    public final int z;

    @LConstructor(version = V1_12_R1)
    public ChunkCoordIntPair(int x, int z) {
        this.x = x;
        this.z = z;
    }

    @LConstructor(version = V1_12_R1)
    public ChunkCoordIntPair(BlockPosition blockposition) {
        this.x = blockposition.getX() >> 4;
        this.z = blockposition.getZ() >> 4;
    }

    /**
     * Encode a 'x' and 'z' coordinate in one long.
     *
     * @param x coordinate to be encoded
     * @param z coordinate to be encoded
     * @return a long containing the 'x' and 'z' coordinate
     */
    @LMethod(version = V1_12_R1, name = "a")
    public static long encodeCoordinates(int x, int z) {
        long lx = (long) x & 0xFFFFFFFFL;
        long lz = (long) z & 0xFFFFFFFFL;
        return lx | (lz << 32);
    }

    /**
     * Get the squared distance of an entity to the middle of the chunk.
     *
     * @param entity whose distance to get
     * @return squared distance to chunk middle
     */
    @LMethod(version = V1_12_R1, name = "a")
    public double getSquaredDistance(Entity entity) {
        int chunkMiddleX = (x << 4) + 8;
        int chunkMiddleZ = (z << 4) + 8;
        double deltaX = chunkMiddleX - entity.glow  .getLocation().getX();
        double deltaZ = chunkMiddleZ - entity.glow.getLocation().getZ();
        return deltaX * deltaX + deltaZ + deltaZ;
    }

    /**
     * @return x-coordinate of first block in this chunk
     */
    @LMethod(version = V1_12_R1, name = "c")
    public int getStartX() {
        return this.x << 4;
    }

    /**
     * @return z-coordinate of first block in this chunk
     */
    @LMethod(version = V1_12_R1, name = "d")
    public int getStartZ() {
        return this.z << 4;
    }

    /**
     * @return x-coordinate of last block in this chunk
     */
    @LMethod(version = V1_12_R1, name = "e")
    public int getEndX() {
        return (this.x << 4) + 15;
    }

    /**
     * @return z-coordinate of last block in this chunk
     */
    @LMethod(version = V1_12_R1, name = "f")
    public int getEndZ() {
        return (this.x << 4) + 15;
    }

    /**
     * Get absolute coordinates of a location relative to this chunk.
     *
     * @param x offset relative to this chunk
     * @param y offset
     * @param z offset relative to this chunk
     * @return absolute position
     */
    @LMethod(version = V1_12_R1, name = "a")
    public BlockPosition absolutize(int x, int y, int z) {
        return new BlockPosition(getStartX() + x, y, getStartZ() + z);
    }

    @Override
    public int hashCode() {
        // hash algorithm might differ from vanilla
        return Objects.hash(this.x, this.z);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof ChunkCoordIntPair)) return false;

        ChunkCoordIntPair that = (ChunkCoordIntPair)object;
        return this.x == that.x && this.z == that.z;
    }

    @Override
    public String toString() {
        return "[" + x + ", " + z + "]";
    }
}