package net.minecraft.server;

public abstract class PathfinderGoalDoorInteract extends PathfinderGoal {

    protected EntityInsentient a = null;

    protected BlockPosition b = null;

    protected BlockDoor c = null;

    boolean d = false;

    float e = 0.0F;

    float f = 0.0F;

    public PathfinderGoalDoorInteract(EntityInsentient entityinsentient) {
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public void c() {
    }

    public void e() {
    }

    private BlockDoor a(BlockPosition blockposition) {
        return null;
    }
}
