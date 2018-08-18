package org.bukkit.craftbukkit.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LDelegate;
import org.bukkit.EntityAnimation;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.block.Block;
import org.bukkit.craftbukkit.block.CraftBlock;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

import net.glowstone.block.GlowBlock;
import net.glowstone.entity.GlowLivingEntity;
import net.glowstone.entity.GlowPlayer;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class CraftLivingEntity extends CraftEntity {
    @LDelegate(LivingEntity.class)
    private GlowLivingEntity base;

    public CraftLivingEntity(GlowLivingEntity p) {
        super(p);
        this.base = p;
    }

}
