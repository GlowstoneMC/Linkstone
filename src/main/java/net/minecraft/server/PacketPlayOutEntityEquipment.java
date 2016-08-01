package net.minecraft.server;

import java.io.IOException;
import javax.annotation.Nullable;

public class PacketPlayOutEntityEquipment implements Packet<PacketListenerPlayOut> {

    private int a = 0;

    private EnumItemSlot b = null;

    private ItemStack c = null;

    public PacketPlayOutEntityEquipment() {
    }

    public PacketPlayOutEntityEquipment(int i, EnumItemSlot enumitemslot, @Nullable ItemStack itemstack) {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void a(PacketListenerPlayOut packetlistenerplayout) {
    }
}
