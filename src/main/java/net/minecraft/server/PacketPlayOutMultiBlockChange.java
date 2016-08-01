package net.minecraft.server;

import java.io.IOException;

public class PacketPlayOutMultiBlockChange implements Packet<PacketListenerPlayOut> {

    private ChunkCoordIntPair a;

    private PacketPlayOutMultiBlockChange.MultiBlockChangeInfo[] b;

    public PacketPlayOutMultiBlockChange() {
    }

    public PacketPlayOutMultiBlockChange(int i, short[] ashort, Chunk chunk) {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void a(PacketListenerPlayOut packetlistenerplayout) {
    }

    public class MultiBlockChangeInfo {

        private final short b;

        private final IBlockData c;

        public MultiBlockChangeInfo(short short0, IBlockData iblockdata) {
        }

        public MultiBlockChangeInfo(short short0, Chunk chunk) {
        }

        public BlockPosition a() {
            return null;
        }

        public short b() {
            return 0;
        }

        public IBlockData c() {
            return null;
        }
    }
}
