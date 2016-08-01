package net.minecraft.server;

import com.mojang.authlib.GameProfile;
import java.io.IOException;
import java.util.UUID;

public class PacketLoginOutSuccess implements Packet<PacketLoginOutListener> {

    private GameProfile a = null;

    public PacketLoginOutSuccess() {
    }

    public PacketLoginOutSuccess(GameProfile gameprofile) {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void a(PacketLoginOutListener packetloginoutlistener) {
    }
}
