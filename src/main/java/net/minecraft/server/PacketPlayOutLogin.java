package net.minecraft.server;

import java.io.IOException;

public class PacketPlayOutLogin implements Packet<PacketListenerPlayOut> {

    private int a = 0;

    private boolean b = false;

    private EnumGamemode c = null;

    private int d = 0;

    private EnumDifficulty e = null;

    private int f = 0;

    private WorldType g = null;

    private boolean h = false;

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
