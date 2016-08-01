package net.minecraft.server;

import java.io.IOException;

public class PacketPlayOutRespawn implements Packet<PacketListenerPlayOut> {

    private int a;

    private EnumDifficulty b;

    private EnumGamemode c;

    private WorldType d;

    public PacketPlayOutRespawn() {
    }

    public PacketPlayOutRespawn(int i, EnumDifficulty enumdifficulty, WorldType worldtype, EnumGamemode enumgamemode) {
    }

    public void a(PacketListenerPlayOut packetlistenerplayout) {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }
}
