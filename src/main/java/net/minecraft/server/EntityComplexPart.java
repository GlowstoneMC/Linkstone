package net.minecraft.server;

public class EntityComplexPart extends Entity {

    public final IComplex owner;

    public final String b;

    public EntityComplexPart(IComplex icomplex, String s, float f, float f1) {
    }

    protected void i() {
    }

    protected void a(NBTTagCompound nbttagcompound) {
    }

    protected void b(NBTTagCompound nbttagcompound) {
    }

    public boolean isInteractable() {
        return false;
    }

    public boolean damageEntity(DamageSource damagesource, float f) {
        return false;
    }

    public boolean s(Entity entity) {
        return false;
    }
}
