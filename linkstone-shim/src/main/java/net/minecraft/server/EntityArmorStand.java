package net.minecraft.server;

import net.glowstone.entity.objects.GlowArmorStand;
import net.glowstone.linkstone.annotations.LBox;
import net.glowstone.linkstone.annotations.LBoxed;
import net.glowstone.linkstone.annotations.LClassfile;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LBox(GlowArmorStand.class)
@LClassfile(version = V1_12_R1)
public class EntityArmorStand extends EntityLiving {
    @LBoxed
    public final GlowArmorStand glow;

    public EntityArmorStand(GlowArmorStand glow) {
        super(glow);
        this.glow = glow;
    }
}