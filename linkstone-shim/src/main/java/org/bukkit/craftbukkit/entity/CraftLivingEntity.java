package org.bukkit.craftbukkit.entity;

import net.glowstone.linkstone.annotations.LBox;
import net.glowstone.linkstone.annotations.LBoxed;
import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LDelegate;
import org.bukkit.entity.LivingEntity;
import net.glowstone.entity.GlowLivingEntity;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LBox(GlowLivingEntity.class)
@LClassfile(version = V1_12_R1)
public class CraftLivingEntity extends CraftEntity {
    @LBoxed
    @LDelegate(LivingEntity.class)
    private GlowLivingEntity base;

    public CraftLivingEntity(GlowLivingEntity p) {
        super(p);
        this.base = p;
    }

}
