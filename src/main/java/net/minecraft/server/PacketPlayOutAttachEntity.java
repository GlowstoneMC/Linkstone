package net.minecraft.server;

import java.io.IOException;
import javax.annotation.Nullable;

public class PacketPlayOutAttachEntity implements Packet<PacketListenerPlayOut> {

    private int a = 0;

    private int b = 0;

    public PacketPlayOutAttachEntity() {
    }

    public PacketPlayOutAttachEntity(Entity entity, @Nullable Entity entity1) {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void a(PacketListenerPlayOut packetlistenerplayout) {
    }
}
