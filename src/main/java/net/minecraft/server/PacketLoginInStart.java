package net.minecraft.server;

import com.mojang.authlib.GameProfile;
import java.io.IOException;
import java.util.UUID;

public class PacketLoginInStart implements Packet<PacketLoginInListener> {

    private GameProfile a = null;

    public PacketLoginInStart() {
    }

    public PacketLoginInStart(GameProfile gameprofile) {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void a(PacketLoginInListener packetlogininlistener) {
    }

    public GameProfile a() {
        return null;
    }
}
