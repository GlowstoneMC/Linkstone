package org.bukkit.craftbukkit.entity;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LDelegate;
import org.bukkit.entity.HumanEntity;

import net.glowstone.entity.GlowHumanEntity;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class CraftHumanEntity extends CraftLivingEntity {
    @LDelegate(HumanEntity.class)
    private GlowHumanEntity glow;

    public CraftHumanEntity(GlowHumanEntity glow) {
        super(glow);
        this.glow = glow;
    }
}
