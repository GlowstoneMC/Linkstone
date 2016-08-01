package net.minecraft.server;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ScoreboardServer extends Scoreboard {

    private final MinecraftServer a;

    private final Set<ScoreboardObjective> b;

    private Runnable[] c;

    public ScoreboardServer(MinecraftServer minecraftserver) {
    }

    public void handleScoreChanged(ScoreboardScore scoreboardscore) {
    }

    public void handlePlayerRemoved(String s) {
    }

    public void a(String s, ScoreboardObjective scoreboardobjective) {
    }

    public void setDisplaySlot(int i, ScoreboardObjective scoreboardobjective) {
    }

    public boolean addPlayerToTeam(String s, String s1) {
        return false;
    }

    public void removePlayerFromTeam(String s, ScoreboardTeam scoreboardteam) {
    }

    public void handleObjectiveAdded(ScoreboardObjective scoreboardobjective) {
    }

    public void handleObjectiveChanged(ScoreboardObjective scoreboardobjective) {
    }

    public void handleObjectiveRemoved(ScoreboardObjective scoreboardobjective) {
    }

    public void handleTeamAdded(ScoreboardTeam scoreboardteam) {
    }

    public void handleTeamChanged(ScoreboardTeam scoreboardteam) {
    }

    public void handleTeamRemoved(ScoreboardTeam scoreboardteam) {
    }

    public void a(Runnable runnable) {
    }

    protected void b() {
    }

    public List<Packet<?>> getScoreboardScorePacketsForObjective(ScoreboardObjective scoreboardobjective) {
        return null;
    }

    public void e(ScoreboardObjective scoreboardobjective) {
    }

    public List<Packet<?>> f(ScoreboardObjective scoreboardobjective) {
        return null;
    }

    public void g(ScoreboardObjective scoreboardobjective) {
    }

    public int h(ScoreboardObjective scoreboardobjective) {
        return 0;
    }

    // CraftBukkit start - Send to players
    private void sendAll(Packet packet) {
    }
    // CraftBukkit end
}
