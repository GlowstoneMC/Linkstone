package net.minecraft.server;

import static net.glowstone.linkstone.annotations.Version.*;
import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.entity.GlowHumanEntity;

@LClassfile(version = V1_12_R1)
public class EntityHuman extends EntityLiving {
    private final GlowHumanEntity glow;
    public EntityHuman(GlowHumanEntity glow) {
        this.glow = glow;
    }
}
