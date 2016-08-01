package net.minecraft.server;

import java.io.IOException;

public class PacketPlayInClientCommand implements Packet<PacketListenerPlayIn> {

    private PacketPlayInClientCommand.EnumClientCommand a;

    public PacketPlayInClientCommand() {
    }

    public PacketPlayInClientCommand(PacketPlayInClientCommand.EnumClientCommand packetplayinclientcommand_enumclientcommand) {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void a(PacketListenerPlayIn packetlistenerplayin) {
    }

    public PacketPlayInClientCommand.EnumClientCommand a() {
        return null;
    }

    public static enum EnumClientCommand {

        PERFORM_RESPAWN, REQUEST_STATS, OPEN_INVENTORY_ACHIEVEMENT;

        private EnumClientCommand() {
        }
    }
}
