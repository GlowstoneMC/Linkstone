package net.minecraft.server;

import javax.annotation.Nullable;

public abstract class EntityGolem extends EntityCreature implements IAnimal {

    public EntityGolem(World world) {
    }

    public void e(float f, float f1) {
    }

    @Nullable
    protected SoundEffect G() {
        return null;
    }

    @Nullable
    protected SoundEffect bV() {
        return null;
    }

    @Nullable
    protected SoundEffect bW() {
        return null;
    }

    public int C() {
        return 0;
    }

    protected boolean isTypeNotPersistent() {
        return false;
    }
}
