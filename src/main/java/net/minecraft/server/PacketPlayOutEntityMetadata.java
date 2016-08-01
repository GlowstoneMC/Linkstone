package net.minecraft.server;

import java.io.IOException;
import java.util.List;

public class PacketPlayOutEntityMetadata implements Packet<PacketListenerPlayOut> {

    private int a;

    private List<DataWatcher.Item<?>> b;

    public PacketPlayOutEntityMetadata() {
    }

    public PacketPlayOutEntityMetadata(int i, DataWatcher datawatcher, boolean flag) {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void a(PacketListenerPlayOut packetlistenerplayout) {
    }
}
