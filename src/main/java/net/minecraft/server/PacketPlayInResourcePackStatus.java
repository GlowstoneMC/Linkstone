package net.minecraft.server;

import java.io.IOException;

public class PacketPlayInResourcePackStatus implements Packet<PacketListenerPlayIn> {

    public PacketPlayInResourcePackStatus.EnumResourcePackStatus status;

    public PacketPlayInResourcePackStatus() {
    }

    public PacketPlayInResourcePackStatus(PacketPlayInResourcePackStatus.EnumResourcePackStatus packetplayinresourcepackstatus_enumresourcepackstatus) {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void a(PacketListenerPlayIn packetlistenerplayin) {
    }

    public static enum EnumResourcePackStatus {

        SUCCESSFULLY_LOADED, DECLINED, FAILED_DOWNLOAD, ACCEPTED;

        private EnumResourcePackStatus() {
        }
    }
}
