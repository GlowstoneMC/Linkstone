package net.minecraft.server;

import me.aki.linkstone.annotations.*;
import net.glowstone.entity.GlowPlayer;

import static me.aki.linkstone.annotations.Version.*;

@Classfile(version = V1_12_R1)
public class EntityPlayer extends EntityHuman {
    public GlowPlayer glowPlayer;

    @Field(version = V1_12_R1)
    public PlayerConnection playerConnection;
    @Getter(version = V1_12_R1)
    public PlayerConnection getPlayerConnection() {
        throw new RuntimeException("NOT YET IMPLEMENTED");
    }
    @Setter(version = V1_12_R1)
    public void setPlayerConnection(PlayerConnection playerConnection) {
        throw new RuntimeException("NOT YET IMPLEMENTED");
    }
}
