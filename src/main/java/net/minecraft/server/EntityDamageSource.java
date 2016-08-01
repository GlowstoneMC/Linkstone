package net.minecraft.server;

import javax.annotation.Nullable;

public class EntityDamageSource extends DamageSource {

    protected Entity t;

    private boolean u;

    public EntityDamageSource(String s, Entity entity) {
    }

    public EntityDamageSource w() {
        return null;
    }

    public boolean x() {
        return false;
    }

    @Nullable
    public Entity getEntity() {
        return null;
    }

    public IChatBaseComponent getLocalizedDeathMessage(EntityLiving entityliving) {
        return null;
    }

    public boolean r() {
        return false;
    }

    @Nullable
    public Vec3D v() {
        return null;
    }
}
