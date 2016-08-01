package net.minecraft.server;

import java.io.IOException;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class PacketPlayInTabComplete implements Packet<PacketListenerPlayIn> {

    private String a = null;

    private boolean b = false;

    @Nullable
    private BlockPosition c = null;

    public PacketPlayInTabComplete() {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void a(PacketListenerPlayIn packetlistenerplayin) {
    }

    public String a() {
        return null;
    }

    @Nullable
    public BlockPosition b() {
        return null;
    }

    public boolean c() {
        return false;
    }
}
