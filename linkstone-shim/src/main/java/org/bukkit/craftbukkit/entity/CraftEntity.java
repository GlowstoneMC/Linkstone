package org.bukkit.craftbukkit.entity;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LDelegate;
import org.bukkit.entity.Entity;

import net.glowstone.entity.GlowEntity;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class CraftEntity {
    @LDelegate(Entity.class)
    private GlowEntity glow;

    public CraftEntity(GlowEntity glow) {
        this.glow = glow;
    }
}
