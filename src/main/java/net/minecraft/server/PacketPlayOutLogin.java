package net.minecraft.server;

import java.io.IOException;

public class PacketPlayOutLogin implements Packet<PacketListenerPlayOut> {

    private int a;

    private boolean b;

    private EnumGamemode c;

    private int d;

    private EnumDifficulty e;

    private int f;

    private WorldType g;

    private boolean h;

    public PacketPlayOutLogin() {
    }

    public PacketPlayOutLogin(int i, EnumGamemode enumgamemode, boolean flag, int j, EnumDifficulty enumdifficulty, int k, WorldType worldtype, boolean flag1) {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void a(PacketListenerPlayOut packetlistenerplayout) {
    }
}
