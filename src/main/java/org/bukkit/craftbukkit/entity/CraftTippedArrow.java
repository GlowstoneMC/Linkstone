package org.bukkit.craftbukkit.entity;

import java.util.List;
import org.apache.commons.lang.Validate;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.craftbukkit.potion.CraftPotionUtil;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.TippedArrow;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;
import com.google.common.collect.ImmutableList;
import net.minecraft.server.EntityTippedArrow;
import net.minecraft.server.MobEffect;
import net.minecraft.server.MobEffectList;

public class CraftTippedArrow extends CraftArrow implements TippedArrow {

    public CraftTippedArrow(CraftServer server, EntityTippedArrow entity) {
    }

    @Override
    public EntityTippedArrow getHandle() {
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
    public boolean addCustomEffect(PotionEffect effect, boolean override) {
        return false;
    }

    @Override
    public void clearCustomEffects() {
    }

    @Override
    public List<PotionEffect> getCustomEffects() {
        return null;
    }

    @Override
    public boolean hasCustomEffect(PotionEffectType type) {
        return false;
    }

    @Override
    public boolean hasCustomEffects() {
        return false;
    }

    @Override
    public boolean removeCustomEffect(PotionEffectType effect) {
        return false;
    }

    @Override
    public void setBasePotionData(PotionData data) {
    }

    @Override
    public PotionData getBasePotionData() {
        return null;
    }
}
