package org.bukkit.craftbukkit.util;

import net.minecraft.server.DamageSource;

// Util class to create custom DamageSources.
public final class CraftDamageSource extends DamageSource {

    public static DamageSource copyOf(final DamageSource original) {
        return null;
    }

    private CraftDamageSource(String identifier) {
    }
}
