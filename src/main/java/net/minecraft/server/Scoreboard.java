package net.minecraft.server;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class Scoreboard {

    private final Map<String, ScoreboardObjective> objectivesByName;

    private final Map<IScoreboardCriteria, List<ScoreboardObjective>> objectivesByCriteria;

    private final Map<String, Map<ScoreboardObjective, ScoreboardScore>> playerScores;

    private final ScoreboardObjective[] displaySlots;

    private final Map<String, ScoreboardTeam> teamsByName;

    private final Map<String, ScoreboardTeam> teamsByPlayer;

    private static String[] g;

    public Scoreboard() {
    }

    @Nullable
    public ScoreboardObjective getObjective(String s) {
        return null;
    }

    public ScoreboardObjective registerObjective(String s, IScoreboardCriteria iscoreboardcriteria) {
        return null;
    }

    public Collection<ScoreboardObjective> getObjectivesForCriteria(IScoreboardCriteria iscoreboardcriteria) {
        return null;
    }

    public boolean b(String s, ScoreboardObjective scoreboardobjective) {
        return false;
    }

    public ScoreboardScore getPlayerScoreForObjective(String s, ScoreboardObjective scoreboardobjective) {
        return null;
    }

    public Collection<ScoreboardScore> getScoresForObjective(ScoreboardObjective scoreboardobjective) {
        return null;
    }

    public Collection<ScoreboardObjective> getObjectives() {
        return null;
    }

    public Collection<String> getPlayers() {
        return null;
    }

    public void resetPlayerScores(String s, ScoreboardObjective scoreboardobjective) {
    }

    public Collection<ScoreboardScore> getScores() {
        return null;
    }

    public Map<ScoreboardObjective, ScoreboardScore> getPlayerObjectives(String s) {
        return null;
    }

    public void unregisterObjective(ScoreboardObjective scoreboardobjective) {
    }

    public void setDisplaySlot(int i, ScoreboardObjective scoreboardobjective) {
    }

    @Nullable
    public ScoreboardObjective getObjectiveForSlot(int i) {
        return null;
    }

    public ScoreboardTeam getTeam(String s) {
        return null;
    }

    public ScoreboardTeam createTeam(String s) {
        return null;
    }

    public void removeTeam(ScoreboardTeam scoreboardteam) {
    }

    public boolean addPlayerToTeam(String s, String s1) {
        return false;
    }

    public boolean removePlayerFromTeam(String s) {
        return false;
    }

    public void removePlayerFromTeam(String s, ScoreboardTeam scoreboardteam) {
    }

    public Collection<String> getTeamNames() {
        return null;
    }

    public Collection<ScoreboardTeam> getTeams() {
        return null;
    }

    @Nullable
    public ScoreboardTeam getPlayerTeam(String s) {
        return null;
    }

    public void handleObjectiveAdded(ScoreboardObjective scoreboardobjective) {
    }

    public void handleObjectiveChanged(ScoreboardObjective scoreboardobjective) {
    }

    public void handleObjectiveRemoved(ScoreboardObjective scoreboardobjective) {
    }

    public void handleScoreChanged(ScoreboardScore scoreboardscore) {
    }

    public void handlePlayerRemoved(String s) {
    }

    public void a(String s, ScoreboardObjective scoreboardobjective) {
    }

    public void handleTeamAdded(ScoreboardTeam scoreboardteam) {
    }

    public void handleTeamChanged(ScoreboardTeam scoreboardteam) {
    }

    public void handleTeamRemoved(ScoreboardTeam scoreboardteam) {
    }

    public static String getSlotName(int i) {
        return null;
    }

    public static int getSlotForName(String s) {
        return 0;
    }

    public static String[] h() {
        return null;
    }

    public void a(Entity entity) {
    }
}
