package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LField;
import net.glowstone.linkstone.annotations.LGenerate;
import net.glowstone.linkstone.annotations.LMethod;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class PlayerConnection {
    @LGenerate
    @LField(version = V1_12_R1)
    public EntityPlayer player;

    @LMethod(version = V1_12_R1)
    public void sendPacket(final Packet<?> packet) {
        player.glowPlayer.getSession().send(packet.toGlowMessage());
    }
}
