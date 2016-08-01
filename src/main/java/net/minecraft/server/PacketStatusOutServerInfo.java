package net.minecraft.server;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;

public class PacketStatusOutServerInfo implements Packet<PacketStatusOutListener> {

    private static final Gson a;

    private ServerPing b;

    public PacketStatusOutServerInfo() {
    }

    public PacketStatusOutServerInfo(ServerPing serverping) {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void a(PacketStatusOutListener packetstatusoutlistener) {
    }
}
