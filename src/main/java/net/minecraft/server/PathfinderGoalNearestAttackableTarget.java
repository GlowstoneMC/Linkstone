package net.minecraft.server;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.annotation.Nullable;

public class PathfinderGoalNearestAttackableTarget<T extends EntityLiving> extends PathfinderGoalTarget {

    protected final Class<T> a;

    private final int i;

    protected final PathfinderGoalNearestAttackableTarget.DistanceComparator b;

    protected final Predicate<? super T> c;

    protected T d;

    public PathfinderGoalNearestAttackableTarget(EntityCreature entitycreature, Class<T> oclass, boolean flag) {
    }

    public PathfinderGoalNearestAttackableTarget(EntityCreature entitycreature, Class<T> oclass, boolean flag, boolean flag1) {
    }

    public PathfinderGoalNearestAttackableTarget(EntityCreature entitycreature, Class<T> oclass, int i, boolean flag, boolean flag1, @Nullable final Predicate<? super T> predicate) {
    }

    public boolean a() {
        return false;
    }

    protected AxisAlignedBB a(double d0) {
        return null;
    }

    public void c() {
    }

    public static class DistanceComparator implements Comparator<Entity> {

        private final Entity a;

        public DistanceComparator(Entity entity) {
        }

        public int a(Entity entity, Entity entity1) {
            return 0;
        }

        public int compare(Entity object, Entity object1) {
            return 0;
        }
    }
}
