package org.bukkit.craftbukkit.entity;

import net.glowstone.linkstone.annotations.LBox;
import net.glowstone.linkstone.annotations.LBoxed;
import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LDelegate;
import org.bukkit.entity.Entity;

import net.glowstone.entity.GlowEntity;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LBox(GlowEntity.class)
@LClassfile(version = V1_12_R1)
public class CraftEntity {
    @LBoxed
    @LDelegate(Entity.class)
    private GlowEntity glow;

    public CraftEntity(GlowEntity glow) {
        this.glow = glow;
    }
}
