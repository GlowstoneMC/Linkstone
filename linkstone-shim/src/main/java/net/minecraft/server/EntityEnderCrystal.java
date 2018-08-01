package net.minecraft.server;

import net.glowstone.entity.objects.GlowEnderCrystal;
import net.glowstone.linkstone.annotations.LBox;
import net.glowstone.linkstone.annotations.LBoxed;
import net.glowstone.linkstone.annotations.LClassfile;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LBox(GlowEnderCrystal.class)
@LClassfile(version = V1_12_R1)
public class EntityEnderCrystal extends Entity {
    @LBoxed
    public final GlowEnderCrystal glow;

    public EntityEnderCrystal(GlowEnderCrystal glow) {
        super(glow);
        this.glow = glow;
    }
}
