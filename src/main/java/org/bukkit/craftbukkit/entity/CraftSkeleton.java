package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntitySkeleton;
import net.minecraft.server.EnumSkeletonType;
import org.apache.commons.lang.Validate;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Skeleton;

public class CraftSkeleton extends CraftMonster implements Skeleton {

    public CraftSkeleton(CraftServer server, EntitySkeleton entity) {
    }

    @Override
    public EntitySkeleton getHandle() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }

    public EntityType getType() {
        return null;
    }

    public SkeletonType getSkeletonType() {
        return null;
    }

    public void setSkeletonType(SkeletonType type) {
    }
}
