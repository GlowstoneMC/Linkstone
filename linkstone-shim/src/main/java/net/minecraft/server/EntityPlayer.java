package net.minecraft.server;

import net.glowstone.entity.GlowPlayer;
import net.glowstone.linkstone.annotations.*;

import static net.glowstone.linkstone.annotations.Version.*;

@LBox(GlowPlayer.class)
@LClassfile(version = V1_12_R1)
public class EntityPlayer extends EntityHuman {
    @LBoxed
    public GlowPlayer glowPlayer;

    public EntityPlayer(GlowPlayer glowPlayer) {
        super(glowPlayer);
        this.glowPlayer = glowPlayer;
    }

    @LField(version = V1_12_R1)
    public PlayerConnection playerConnection;
    @LGetter(version = V1_12_R1)
    public PlayerConnection getPlayerConnection() {
        throw new RuntimeException("NOT YET IMPLEMENTED");
    }
    @LSetter(version = V1_12_R1)
    public void setPlayerConnection(PlayerConnection playerConnection) {
        throw new RuntimeException("NOT YET IMPLEMENTED");
    }
}
