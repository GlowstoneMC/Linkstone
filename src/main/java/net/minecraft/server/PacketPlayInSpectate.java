package net.minecraft.server;

import java.io.IOException;
import java.util.UUID;
import javax.annotation.Nullable;

public class PacketPlayInSpectate implements Packet<PacketListenerPlayIn> {

    private UUID a;

    public PacketPlayInSpectate() {
    }

    public PacketPlayInSpectate(UUID uuid) {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void a(PacketListenerPlayIn packetlistenerplayin) {
    }

    @Nullable
    public Entity a(WorldServer worldserver) {
        return null;
    }
}
