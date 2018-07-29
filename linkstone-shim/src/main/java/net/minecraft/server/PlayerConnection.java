package net.minecraft.server;

import net.glowstone.linkstone.Linkstone;
import net.glowstone.linkstone.annotations.*;

import static net.glowstone.linkstone.annotations.Version.*;

@LClassfile(version = V1_12_R1)
public class PlayerConnection {
    @LField(version = V1_12_R1)
    public EntityPlayer player;
    @LGetter(version = V1_12_R1)
    public EntityPlayer getPlayer() {
        throw new RuntimeException("NOT YET IMPLEMENTED");
    }
    @LSetter(version = V1_12_R1)
    public void setPlayer(EntityPlayer player) {
        throw new RuntimeException("NOT YET IMPLEMENTED");
    }

    @LMethod(version = V1_12_R1)
    public void sendPacket(final Packet<?> packet) {
        player.glowPlayer.getSession().send(Linkstone.packetToMessage(packet));
    }
}
