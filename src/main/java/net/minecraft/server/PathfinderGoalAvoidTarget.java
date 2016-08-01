package net.minecraft.server;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.List;
import javax.annotation.Nullable;

public class PathfinderGoalAvoidTarget<T extends Entity> extends PathfinderGoal {

    private final Predicate<Entity> c;

    protected EntityCreature a;

    private final double d;

    private final double e;

    protected T b;

    private final float f;

    private PathEntity g;

    private final NavigationAbstract h;

    private final Class<T> i;

    private final Predicate<? super T> j;

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
