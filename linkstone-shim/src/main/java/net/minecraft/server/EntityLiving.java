package net.minecraft.server;

import net.glowstone.entity.GlowLivingEntity;
import net.glowstone.linkstone.annotations.LBox;
import net.glowstone.linkstone.annotations.LBoxed;
import net.glowstone.linkstone.annotations.LClassfile;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LBox(GlowLivingEntity.class)
@LClassfile(version = V1_12_R1)
public class EntityLiving extends Entity {
    @LBoxed
    public final GlowLivingEntity glow;

    public EntityLiving(GlowLivingEntity glow) {
        super(glow);
        this.glow = glow;
    }
}
