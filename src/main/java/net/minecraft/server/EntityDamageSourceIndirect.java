package net.minecraft.server;

import javax.annotation.Nullable;

public class EntityDamageSourceIndirect extends EntityDamageSource {

    private final Entity owner = null;

    public EntityDamageSourceIndirect(String s, Entity entity, @Nullable Entity entity1) {
    }

    @Nullable
    public Entity i() {
        return null;
    }

    @Nullable
    public Entity getEntity() {
        return null;
    }

    public IChatBaseComponent getLocalizedDeathMessage(EntityLiving entityliving) {
        return null;
    }

    // CraftBukkit start
    public Entity getProximateDamageSource() {
        return null;
    }
    // CraftBukkit end
}
