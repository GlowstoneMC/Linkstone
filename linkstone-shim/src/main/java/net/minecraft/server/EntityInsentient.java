package net.minecraft.server;

import net.glowstone.entity.GlowLivingEntity;
import net.glowstone.linkstone.annotations.LClassfile;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

/**
 * Minecraft entity class with no Bukkit correspondent.
 */
@LClassfile(version = V1_12_R1)
public class EntityInsentient extends EntityLiving {
    public EntityInsentient(GlowLivingEntity entity) {
        super(entity);
    }
}
