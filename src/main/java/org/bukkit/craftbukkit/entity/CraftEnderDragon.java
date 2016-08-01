package org.bukkit.craftbukkit.entity;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import java.util.Set;
import net.minecraft.server.DragonControllerPhase;
import net.minecraft.server.EntityComplexPart;
import net.minecraft.server.EntityEnderDragon;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.ComplexEntityPart;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.EntityType;

public class CraftEnderDragon extends CraftComplexLivingEntity implements EnderDragon {

    public CraftEnderDragon(CraftServer server, EntityEnderDragon entity) {
    }

    public Set<ComplexEntityPart> getParts() {
        return null;
    }

    @Override
    public EntityEnderDragon getHandle() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }

    public EntityType getType() {
        return null;
    }

    @Override
    public Phase getPhase() {
        return null;
    }

    @Override
    public void setPhase(Phase phase) {
    }

    public static Phase getBukkitPhase(DragonControllerPhase phase) {
        return null;
    }

    public static DragonControllerPhase getMinecraftPhase(Phase phase) {
        return null;
    }
}
