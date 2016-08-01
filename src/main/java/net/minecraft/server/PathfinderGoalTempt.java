package net.minecraft.server;

import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;
// CraftBukkit start
import org.bukkit.craftbukkit.entity.CraftLivingEntity;
import org.bukkit.craftbukkit.event.CraftEventFactory;
import org.bukkit.event.entity.EntityTargetEvent;
import org.bukkit.event.entity.EntityTargetLivingEntityEvent;

// CraftBukkit end
public class PathfinderGoalTempt extends PathfinderGoal {

    private final EntityCreature a = null;

    private final double b = 0.0;

    private double c = 0.0;

    private double d = 0.0;

    private double e = 0.0;

    private double f = 0.0;

    private double g = 0.0;

    private EntityLiving h = null;

    // CraftBukkit
    private int i = 0;

    private boolean j = false;

    private final Set<Item> k = null;

    private final boolean l = false;

    public PathfinderGoalTempt(EntityCreature entitycreature, double d0, Item item, boolean flag) {
    }

    public PathfinderGoalTempt(EntityCreature entitycreature, double d0, boolean flag, Set<Item> set) {
    }

    public boolean a() {
        return false;
    }

    protected boolean a(@Nullable ItemStack itemstack) {
        return false;
    }

    public boolean b() {
        return false;
    }

    public void c() {
    }

    public void d() {
    }

    public void e() {
    }

    public boolean f() {
        return false;
    }
}
