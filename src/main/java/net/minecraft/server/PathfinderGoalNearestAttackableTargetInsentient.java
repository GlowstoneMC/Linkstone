package net.minecraft.server;

import com.google.common.base.Predicate;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PathfinderGoalNearestAttackableTargetInsentient extends PathfinderGoal {

    private static final Logger a = null;

    private final EntityInsentient b = null;

    private final Predicate<EntityLiving> c = null;

    private final PathfinderGoalNearestAttackableTarget.DistanceComparator d = null;

    private EntityLiving e = null;

    private final Class<? extends EntityLiving> f = null;

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
