package org.bukkit.craftbukkit.scoreboard;

import net.minecraft.server.Scoreboard;
import net.minecraft.server.ScoreboardObjective;
import org.apache.commons.lang.Validate;
import org.bukkit.OfflinePlayer;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;

final class CraftObjective extends CraftScoreboardComponent implements Objective {

    private final ScoreboardObjective objective = null;

    private final CraftCriteria criteria = null;

    CraftObjective(CraftScoreboard scoreboard, ScoreboardObjective objective) {
    }

    ScoreboardObjective getHandle() {
        return null;
    }

    public String getName() throws IllegalStateException {
        return null;
    }

    public String getDisplayName() throws IllegalStateException {
        return null;
    }

    public void setDisplayName(String displayName) throws IllegalStateException, IllegalArgumentException {
    }

    public String getCriteria() throws IllegalStateException {
        return null;
    }

    public boolean isModifiable() throws IllegalStateException {
        return false;
    }

    public void setDisplaySlot(DisplaySlot slot) throws IllegalStateException {
    }

    public DisplaySlot getDisplaySlot() throws IllegalStateException {
        return null;
    }

    public Score getScore(OfflinePlayer player) throws IllegalArgumentException, IllegalStateException {
        return null;
    }

    public Score getScore(String entry) throws IllegalArgumentException, IllegalStateException {
        return null;
    }

    @Override
    public void unregister() throws IllegalStateException {
    }

    @Override
    CraftScoreboard checkState() throws IllegalStateException {
        return null;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
