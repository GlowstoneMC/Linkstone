package org.bukkit.craftbukkit.scoreboard;

import java.util.Map;
import net.minecraft.server.IScoreboardCriteria;
import net.minecraft.server.ScoreboardObjective;
import com.google.common.collect.ImmutableMap;

final class CraftCriteria {

    static final Map<String, CraftCriteria> DEFAULTS = null;

    static final CraftCriteria DUMMY = null;

    static {
    }

    final IScoreboardCriteria criteria = null;

    final String bukkitName = null;

    private CraftCriteria(String bukkitName) {
    }

    private CraftCriteria(IScoreboardCriteria criteria) {
    }

    static CraftCriteria getFromNMS(ScoreboardObjective objective) {
        return null;
    }

    static CraftCriteria getFromBukkit(String name) {
        return null;
    }

    @Override
    public boolean equals(Object that) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
