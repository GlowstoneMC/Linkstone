package net.minecraft.server;

import me.aki.linkstone.annotations.*;
import net.glowstone.linkstone.Linkstone;

import static me.aki.linkstone.annotations.Version.*;

@Classfile(version = V1_12_R1)
public class PlayerConnection {
    @Field(version = V1_12_R1)
    public EntityPlayer player;
    @Getter(version = V1_12_R1)
    public EntityPlayer getPlayer() {
        throw new RuntimeException("NOT YET IMPLEMENTED");
    }
    @Setter(version = V1_12_R1)
    public EntityPlayer setPlayer(EntityPlayer player) {
        throw new RuntimeException("NOT YET IMPLEMENTED");
    }

    @Method(version = V1_12_R1)
    public void sendPacket(final Packet<?> packet) {
        player.glowPlayer.getSession().send(Linkstone.packetToMessage(packet));
    }
}
