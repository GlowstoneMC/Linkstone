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

    private final EntityCreature a;

    private final double b;

    private double c;

    private double d;

    private double e;

    private double f;

    private double g;

    private EntityLiving h;

    // CraftBukkit
    private int i;

    private boolean j;

    private final Set<Item> k;

    private final boolean l;

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
