package org.bukkit.craftbukkit.potion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import net.minecraft.server.MobEffect;
import net.minecraft.server.PotionRegistry;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;
import org.bukkit.potion.PotionBrewer;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionEffect;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;

public class CraftPotionBrewer implements PotionBrewer {

    private static final Map<PotionType, Collection<PotionEffect>> cache = null;

    public Collection<PotionEffect> getEffects(PotionType damage, boolean upgraded, boolean extended) {
        return null;
    }

    @Override
    public Collection<PotionEffect> getEffectsFromDamage(int damage) {
        return null;
    }

    @Override
    public PotionEffect createEffect(PotionEffectType potion, int duration, int amplifier) {
        return null;
    }
}
