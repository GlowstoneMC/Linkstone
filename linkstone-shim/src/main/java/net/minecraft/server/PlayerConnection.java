package net.minecraft.server;

import net.glowstone.linkstone.PacketUtils;

public class PlayerConnection {
    public EntityPlayer player;

    public void sendPacket(final Packet<?> packet) {
        player.glowPlayer.getSession().send(PacketUtils.packetToMessage(packet));
    }
}
