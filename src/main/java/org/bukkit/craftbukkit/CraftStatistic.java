package org.bukkit.craftbukkit;

import net.minecraft.server.EntityTypes;
import net.minecraft.server.EntityTypes.MonsterEggInfo;
import net.minecraft.server.StatisticList;
import org.bukkit.Achievement;
import org.bukkit.Statistic;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import com.google.common.base.CaseFormat;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap;
import net.minecraft.server.Block;
import net.minecraft.server.Item;
import net.minecraft.server.MinecraftKey;
import org.bukkit.craftbukkit.util.CraftMagicNumbers;

public class CraftStatistic {

    private static final BiMap<String, org.bukkit.Statistic> statistics;

    private static final BiMap<String, org.bukkit.Achievement> achievements;

    static {
    }

    private CraftStatistic() {
    }

    public static org.bukkit.Achievement getBukkitAchievement(net.minecraft.server.Achievement achievement) {
        return null;
    }

    public static org.bukkit.Achievement getBukkitAchievementByName(String name) {
        return null;
    }

    public static org.bukkit.Statistic getBukkitStatistic(net.minecraft.server.Statistic statistic) {
        return null;
    }

    public static org.bukkit.Statistic getBukkitStatisticByName(String name) {
        return null;
    }

    public static net.minecraft.server.Statistic getNMSStatistic(org.bukkit.Statistic statistic) {
        return null;
    }

    public static net.minecraft.server.Achievement getNMSAchievement(org.bukkit.Achievement achievement) {
        return null;
    }

    public static net.minecraft.server.Statistic getMaterialStatistic(org.bukkit.Statistic stat, Material material) {
        return null;
    }

    public static net.minecraft.server.Statistic getEntityStatistic(org.bukkit.Statistic stat, EntityType entity) {
        return null;
    }

    public static EntityType getEntityTypeFromStatistic(net.minecraft.server.Statistic statistic) {
        return null;
    }

    public static Material getMaterialFromStatistic(net.minecraft.server.Statistic statistic) {
        return null;
    }
}
