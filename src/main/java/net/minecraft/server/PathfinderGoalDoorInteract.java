package net.minecraft.server;

public abstract class PathfinderGoalDoorInteract extends PathfinderGoal {

    protected EntityInsentient a;

    protected BlockPosition b;

    protected BlockDoor c;

    boolean d;

    float e;

    float f;

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
