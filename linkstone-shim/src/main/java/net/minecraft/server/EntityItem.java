package net.minecraft.server;

import net.glowstone.entity.objects.GlowItem;
import net.glowstone.linkstone.annotations.LBox;
import net.glowstone.linkstone.annotations.LBoxed;
import net.glowstone.linkstone.annotations.LClassfile;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LBox(GlowItem.class)
@LClassfile(version = V1_12_R1)
public class EntityItem extends Entity {
    @LBoxed
    public final GlowItem glow;

    public EntityItem(GlowItem glow) {
        super(glow);
        this.glow = glow;
    }
}