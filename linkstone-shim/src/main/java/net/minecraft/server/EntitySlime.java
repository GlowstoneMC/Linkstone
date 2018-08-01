package net.minecraft.server;

import net.glowstone.entity.monster.GlowSlime;
import net.glowstone.linkstone.annotations.LBox;
import net.glowstone.linkstone.annotations.LBoxed;
import net.glowstone.linkstone.annotations.LClassfile;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LBox(GlowSlime.class)
@LClassfile(version = V1_12_R1)
public class EntitySlime extends EntityInsentient implements IMonster {
    @LBoxed
    public final GlowSlime glow;

    public EntitySlime(GlowSlime glow) {
        super(glow);
        this.glow = glow;
    }
}