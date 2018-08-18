package org.bukkit.craftbukkit.util;

import net.glowstone.linkstone.annotations.LClassfile;
import net.minecraft.server.MinecraftKey;
import org.bukkit.NamespacedKey;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public final class CraftNamespacedKey {

    public CraftNamespacedKey() {
    }

    public static NamespacedKey fromString(String string) {
        return null;
    }

    public static NamespacedKey fromMinecraft(MinecraftKey minecraft) {
        return null;
    }

    public static MinecraftKey toMinecraft(NamespacedKey key) {
        return null;
    }
}
