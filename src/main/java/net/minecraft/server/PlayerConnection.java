package net.minecraft.server;

import net.glowstone.linkstone.Linkstone;

public class PlayerConnection {
    public EntityPlayer player;

    public void sendPacket(final Packet<?> packet) {
        player.glowPlayer.getSession().send(Linkstone.packetToMessage(packet));
    }
}
