package net.minecraft.server;

import java.io.IOException;

public class PacketHandshakingInSetProtocol implements Packet<PacketHandshakingInListener> {

    private int a = 0;

    public String hostname = null;

    public int port = 0;

    private EnumProtocol d = null;

    public PacketHandshakingInSetProtocol() {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void a(PacketHandshakingInListener packethandshakinginlistener) {
    }

    public EnumProtocol a() {
        return null;
    }

    public int b() {
        return 0;
    }
}
