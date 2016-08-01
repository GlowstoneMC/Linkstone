package net.minecraft.server;

public abstract class EntityAmbient extends EntityInsentient implements IAnimal {

    public EntityAmbient(World world) {
    }

    public boolean a(EntityHuman entityhuman) {
        return false;
    }
}
