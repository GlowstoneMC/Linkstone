package net.minecraft.server;

import net.glowstone.entity.GlowEntity;
import net.glowstone.linkstone.annotations.LBox;
import net.glowstone.linkstone.annotations.LBoxed;

@LBox(GlowEntity.class)
public abstract class Entity {
    @LBoxed
    public final GlowEntity glow;

    public int locX;
    public int locY;
    public int locZ;
    public boolean valid;

    protected Entity(GlowEntity glow) {
        this.glow = glow;
    }
}
