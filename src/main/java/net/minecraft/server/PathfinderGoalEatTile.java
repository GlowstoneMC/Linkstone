package net.minecraft.server;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
// CraftBukkit start
import org.bukkit.craftbukkit.event.CraftEventFactory;
import org.bukkit.Material;

// CraftBukkit end
public class PathfinderGoalEatTile extends PathfinderGoal {

    private static final Predicate<IBlockData> b;

    private final EntityInsentient c;

    private final World d;

    int a;

    public PathfinderGoalEatTile(EntityInsentient entityinsentient) {
    }

    public boolean a() {
        return false;
    }

    public void c() {
    }

    public void d() {
    }

    public boolean b() {
        return false;
    }

    public int f() {
        return 0;
    }

    public void e() {
    }
}
