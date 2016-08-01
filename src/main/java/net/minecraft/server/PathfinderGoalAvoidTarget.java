package net.minecraft.server;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.List;
import javax.annotation.Nullable;

public class PathfinderGoalAvoidTarget<T extends Entity> extends PathfinderGoal {

    private final Predicate<Entity> c = null;

    protected EntityCreature a = null;

    private final double d = 0.0;

    private final double e = 0.0;

    protected T b = null;

    private final float f = 0.0F;

    private PathEntity g = null;

    private final NavigationAbstract h = null;

    private final Class<T> i = null;

    private final Predicate<? super T> j = null;

    public PathfinderGoalAvoidTarget(EntityCreature entitycreature, Class<T> oclass, float f, double d0, double d1) {
    }

    public PathfinderGoalAvoidTarget(EntityCreature entitycreature, Class<T> oclass, Predicate<? super T> predicate, float f, double d0, double d1) {
    }

    public boolean a() {
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
}
