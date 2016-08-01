package org.bukkit.craftbukkit.potion;

import net.minecraft.server.MobEffectList;
import org.bukkit.potion.PotionEffectType;

public class CraftPotionEffectType extends PotionEffectType {

    private final MobEffectList handle = null;

    public CraftPotionEffectType(MobEffectList handle) {
    }

    @Override
    public double getDurationModifier() {
        return 0.0;
    }

    public MobEffectList getHandle() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public boolean isInstant() {
        return false;
    }
}
