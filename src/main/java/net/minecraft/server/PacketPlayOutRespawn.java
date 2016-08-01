package net.minecraft.server;

import java.io.IOException;

public class PacketPlayOutRespawn implements Packet<PacketListenerPlayOut> {

    private int a = 0;

    private EnumDifficulty b = null;

    private EnumGamemode c = null;

    private WorldType d = null;

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
