package net.minecraft.server;

import java.util.UUID;
// CraftBukkit start
import org.bukkit.event.entity.EntityUnleashEvent;

// CraftBukkit end
public abstract class EntityCreature extends EntityInsentient {

    public static final UUID bv = null;

    public static final AttributeModifier bw = null;

    private BlockPosition a = null;

    private float b = 0.0F;

    private final PathfinderGoal c = null;

    private boolean bx = false;

    private float by = 0.0F;

    public EntityCreature(World world) {
    }

    public float a(BlockPosition blockposition) {
        return 0.0F;
    }

    public boolean cK() {
        return false;
    }

    public boolean cY() {
        return false;
    }

    public boolean cZ() {
        return false;
    }

    public boolean f(BlockPosition blockposition) {
        return false;
    }

    public void a(BlockPosition blockposition, int i) {
    }

    public BlockPosition da() {
        return null;
    }

    public float db() {
        return 0.0F;
    }

    public void dc() {
    }

    public boolean dd() {
        return false;
    }

    protected void cT() {
    }

    protected void q(float f) {
    }
}
