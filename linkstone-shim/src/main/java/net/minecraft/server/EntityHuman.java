package net.minecraft.server;

import static me.aki.linkstone.annotations.Version.*;
import me.aki.linkstone.annotations.LClassfile;
import net.glowstone.entity.GlowHumanEntity;

@LClassfile(version = V1_12_R1)
public class EntityHuman extends EntityLiving {
    private final GlowHumanEntity glow;
    public EntityHuman(GlowHumanEntity glow) {
        this.glow = glow;
    }
}
