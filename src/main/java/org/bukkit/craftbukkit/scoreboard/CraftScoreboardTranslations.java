package org.bukkit.craftbukkit.scoreboard;

import net.minecraft.server.Scoreboard;
import org.bukkit.scoreboard.DisplaySlot;
import com.google.common.collect.ImmutableBiMap;

class CraftScoreboardTranslations {

    static final int MAX_DISPLAY_SLOT;

    static ImmutableBiMap<DisplaySlot, String> SLOTS;

    private CraftScoreboardTranslations() {
    }

    static DisplaySlot toBukkitSlot(int i) {
        return null;
    }

    static int fromBukkitSlot(DisplaySlot slot) {
        return 0;
    }
}
