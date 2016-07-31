package org.bukkit.craftbukkit.scoreboard;

import java.util.Map;
import net.minecraft.server.Scoreboard;
import net.minecraft.server.ScoreboardObjective;
import net.minecraft.server.ScoreboardScore;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;

/**
 * TL;DR: This class is special and lazily grabs a handle...
 * ...because a handle is a full fledged (I think permanent) hashMap for the associated name.
 * <p>
 * Also, as an added perk, a CraftScore will (intentionally) stay a valid reference so long as objective is valid.
 */
final class CraftScore implements Score {

    private final String entry;

    private final CraftObjective objective;

    CraftScore(CraftObjective objective, String entry) {
    }

    public OfflinePlayer getPlayer() {
        return null;
    }

    public String getEntry() {
        return null;
    }

    public Objective getObjective() {
        return null;
    }

    public int getScore() throws IllegalStateException {
        return 0;
    }

    public void setScore(int score) throws IllegalStateException {
    }

    public CraftScoreboard getScoreboard() {
        return null;
    }
}
