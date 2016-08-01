package org.bukkit.craftbukkit.scoreboard;

import java.util.Collection;
import net.minecraft.server.Scoreboard;
import net.minecraft.server.ScoreboardObjective;
import net.minecraft.server.ScoreboardTeam;
import org.apache.commons.lang.Validate;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Team;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;

public final class CraftScoreboard implements org.bukkit.scoreboard.Scoreboard {

    final Scoreboard board = null;

    CraftScoreboard(Scoreboard board) {
    }

    public CraftObjective registerNewObjective(String name, String criteria) throws IllegalArgumentException {
        return null;
    }

    public Objective getObjective(String name) throws IllegalArgumentException {
        return null;
    }

    public ImmutableSet<Objective> getObjectivesByCriteria(String criteria) throws IllegalArgumentException {
        return null;
    }

    public ImmutableSet<Objective> getObjectives() {
        return null;
    }

    public Objective getObjective(DisplaySlot slot) throws IllegalArgumentException {
        return null;
    }

    public ImmutableSet<Score> getScores(OfflinePlayer player) throws IllegalArgumentException {
        return null;
    }

    public ImmutableSet<Score> getScores(String entry) throws IllegalArgumentException {
        return null;
    }

    public void resetScores(OfflinePlayer player) throws IllegalArgumentException {
    }

    public void resetScores(String entry) throws IllegalArgumentException {
    }

    public Team getPlayerTeam(OfflinePlayer player) throws IllegalArgumentException {
        return null;
    }

    public Team getEntryTeam(String entry) throws IllegalArgumentException {
        return null;
    }

    public Team getTeam(String teamName) throws IllegalArgumentException {
        return null;
    }

    public ImmutableSet<Team> getTeams() {
        return null;
    }

    public Team registerNewTeam(String name) throws IllegalArgumentException {
        return null;
    }

    public ImmutableSet<OfflinePlayer> getPlayers() {
        return null;
    }

    public ImmutableSet<String> getEntries() {
        return null;
    }

    public void clearSlot(DisplaySlot slot) throws IllegalArgumentException {
    }

    // CraftBukkit method
    public Scoreboard getHandle() {
        return null;
    }
}
