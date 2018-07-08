package net.minecraft.server;

import me.aki.linkstone.annotations.*;
import net.glowstone.linkstone.Linkstone;

import static me.aki.linkstone.annotations.Version.*;

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
