package net.minecraft.server;

public abstract class EntityWaterAnimal extends EntityInsentient implements IAnimal {

    public EntityWaterAnimal(World world) {
    }

    public boolean bE() {
        return false;
    }

    public boolean cK() {
        return false;
    }

    public boolean canSpawn() {
        return false;
    }

    public int C() {
        return 0;
    }

    protected boolean isTypeNotPersistent() {
        return false;
    }

    protected int getExpValue(EntityHuman entityhuman) {
        return 0;
    }

    public void U() {
    }

    public boolean bg() {
        return false;
    }
}
