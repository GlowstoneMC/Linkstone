package net.minecraft.server;

import com.google.common.base.Predicate;

public class PathfinderGoalRandomTargetNonTamed<T extends EntityLiving> extends PathfinderGoalNearestAttackableTarget<T> {

    private final EntityTameableAnimal i;

    public PathfinderGoalRandomTargetNonTamed(EntityTameableAnimal entitytameableanimal, Class<T> oclass, boolean flag, Predicate<? super T> predicate) {
    }

    public boolean a() {
        return false;
    }
}
