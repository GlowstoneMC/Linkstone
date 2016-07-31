package net.minecraft.server;

import com.google.common.base.Predicate;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PathfinderGoalNearestAttackableTargetInsentient extends PathfinderGoal {

    private static final Logger a;

    private final EntityInsentient b;

    private final Predicate<EntityLiving> c;

    private final PathfinderGoalNearestAttackableTarget.DistanceComparator d;

    private EntityLiving e;

    private final Class<? extends EntityLiving> f;

    public PathfinderGoalNearestAttackableTargetInsentient(EntityInsentient entityinsentient, Class<? extends EntityLiving> oclass) {
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

    protected double f() {
        return 0.0;
    }
}
