package org.bukkit.craftbukkit.entity;

import net.minecraft.server.World;
import net.minecraft.server.EntityRabbit;
import net.minecraft.server.PathfinderGoalSelector;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Rabbit;
import org.bukkit.craftbukkit.CraftWorld;

public class CraftRabbit extends CraftAnimals implements Rabbit {

    public CraftRabbit(CraftServer server, EntityRabbit entity) {
    }

    @Override
    public EntityRabbit getHandle() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public EntityType getType() {
        return null;
    }

    @Override
    public Type getRabbitType() {
        return null;
    }

    @Override
    public void setRabbitType(Type type) {
    }

    private static class CraftMagicMapping {

        private static final int[] types;

        private static final Type[] reverse;

        static {
        }

        private static void set(Type type, int value) {
        }

        public static Type fromMagic(int magic) {
            return null;
        }

        public static int toMagic(Type type) {
            return 0;
        }
    }
}
