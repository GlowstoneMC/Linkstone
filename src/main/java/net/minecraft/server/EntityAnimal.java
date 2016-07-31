package net.minecraft.server;

import javax.annotation.Nullable;

public abstract class EntityAnimal extends EntityAgeable implements IAnimal {

    protected Block bA;

    private int bx;

    private EntityHuman by;

    public ItemStack breedItem;

    // CraftBukkit - Add breedItem variable
    public EntityAnimal(World world) {
    }

    protected void M() {
    }

    public void n() {
    }

    /* CraftBukkit start
    // Function disabled as it has no special function anymore after
    // setSitting is disabled.
    public boolean damageEntity(DamageSource damagesource, float f) {
        if (this.isInvulnerable(damagesource)) {
            return false;
        } else {
            this.bx = 0;
            return super.damageEntity(damagesource, f);
        }
    }
    // CraftBukkit end */
    public float a(BlockPosition blockposition) {
        return 0.0F;
    }

    public void b(NBTTagCompound nbttagcompound) {
    }

    public double ax() {
        return 0.0;
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    public boolean cK() {
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

    public boolean e(@Nullable ItemStack itemstack) {
        return false;
    }

    public boolean a(EntityHuman entityhuman, EnumHand enumhand, @Nullable ItemStack itemstack) {
        return false;
    }

    protected void a(EntityHuman entityhuman, ItemStack itemstack) {
    }

    public void c(EntityHuman entityhuman) {
    }

    public EntityHuman getBreedCause() {
        return null;
    }

    public boolean isInLove() {
        return false;
    }

    public void resetLove() {
    }

    public boolean mate(EntityAnimal entityanimal) {
        return false;
    }
}
