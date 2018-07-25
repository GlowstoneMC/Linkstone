package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class ChunkCoordIntPair {
    public final int x;
    public final int z;

    public ChunkCoordIntPair(int x, int z) {
        this.x = x;
        this.z = z;
    }

    public ChunkCoordIntPair(BlockPosition blockposition) {
        this.x = blockposition.getX() >> 4;
        this.z = blockposition.getZ() >> 4;
    }

    public static long asLong(BlockPosition pos) {
        return 0;
    }

    public static long asLong(int x, int z) {
        return ChunkCoordIntPair.a(x, z);
    }

    public static long a(int i2, int j) {
        return 0;
    }

    public int hashCode() {
        return 0;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof ChunkCoordIntPair)) return false;

        ChunkCoordIntPair chunkcoordintpair = (ChunkCoordIntPair)object;
        return this.x == chunkcoordintpair.x && this.z == chunkcoordintpair.z;
    }

    public double a(Entity entity) {
        return 0;
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public int e() {
        return 0;
    }

    public int f() {
        return 0;
    }

    public BlockPosition a(int i2, int j, int k) {
        return new BlockPosition(0,0,0);
    }

    public String toString() {
        return "[" + x + ", " + z + "]";
    }
}