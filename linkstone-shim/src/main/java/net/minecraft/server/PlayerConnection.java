package net.minecraft.server;

import net.glowstone.linkstone.PacketUtils;
import net.glowstone.linkstone.annotations.LClassfile;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class PlayerConnection {
    public EntityPlayer player;

    public void sendPacket(final Packet<?> packet) {
        player.glowPlayer.getSession().send(PacketUtils.packetToMessage(packet));
    }
}
