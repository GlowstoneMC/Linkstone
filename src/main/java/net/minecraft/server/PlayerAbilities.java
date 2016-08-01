package net.minecraft.server;

public class PlayerAbilities {

    public boolean isInvulnerable = false;

    public boolean isFlying = false;

    public boolean canFly = false;

    public boolean canInstantlyBuild = false;

    public boolean mayBuild = false;

    public float flySpeed = 0.0F;

    public float walkSpeed = 0.0F;

    public PlayerAbilities() {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    public void b(NBTTagCompound nbttagcompound) {
    }

    public float a() {
        return 0.0F;
    }

    public float b() {
        return 0.0F;
    }
}
