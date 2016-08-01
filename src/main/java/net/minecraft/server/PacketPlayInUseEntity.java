package net.minecraft.server;

import java.io.IOException;

public class PacketPlayInUseEntity implements Packet<PacketListenerPlayIn> {

    private int a = 0;

    private PacketPlayInUseEntity.EnumEntityUseAction action = null;

    private Vec3D c = null;

    private EnumHand d = null;

    public PacketPlayInUseEntity() {
    }

    public PacketPlayInUseEntity(Entity entity) {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void a(PacketListenerPlayIn packetlistenerplayin) {
    }

    public Entity a(World world) {
        return null;
    }

    public PacketPlayInUseEntity.EnumEntityUseAction a() {
        return null;
    }

    public EnumHand b() {
        return null;
    }

    public Vec3D c() {
        return null;
    }

    public static enum EnumEntityUseAction {

        INTERACT, ATTACK, INTERACT_AT;

        private EnumEntityUseAction() {
        }
    }
}
