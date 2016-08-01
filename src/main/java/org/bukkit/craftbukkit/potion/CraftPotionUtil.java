package org.bukkit.craftbukkit.potion;

import com.google.common.base.Preconditions;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import net.minecraft.server.MobEffect;
import net.minecraft.server.MobEffectList;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;
import org.bukkit.potion.PotionData;

public class CraftPotionUtil {

    private static final BiMap<PotionType, String> regular = null;

    private static final BiMap<PotionType, String> upgradeable = null;

    private static final BiMap<PotionType, String> extendable = null;

    public static String fromBukkit(PotionData data) {
        return null;
    }

    public static PotionData toBukkit(String type) {
        return null;
    }

    public static MobEffect fromBukkit(PotionEffect effect) {
        return null;
    }

    public static PotionEffect toBukkit(MobEffect effect) {
        return null;
    }

    public static boolean equals(MobEffectList mobEffect, PotionEffectType type) {
        return false;
    }
}
