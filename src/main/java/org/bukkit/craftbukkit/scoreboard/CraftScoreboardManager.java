package org.bukkit.craftbukkit.scoreboard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.minecraft.server.EntityPlayer;
import net.minecraft.server.IScoreboardCriteria;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.PacketPlayOutScoreboardObjective;
import net.minecraft.server.PacketPlayOutScoreboardTeam;
import net.minecraft.server.Scoreboard;
import net.minecraft.server.ScoreboardObjective;
import net.minecraft.server.ScoreboardScore;
import net.minecraft.server.ScoreboardServer;
import net.minecraft.server.ScoreboardTeam;
import org.apache.commons.lang.Validate;
import org.bukkit.craftbukkit.entity.CraftPlayer;
import org.bukkit.craftbukkit.util.WeakCollection;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.ScoreboardManager;

public final class CraftScoreboardManager implements ScoreboardManager {

    private final CraftScoreboard mainScoreboard;

    private final MinecraftServer server;

    private final Collection<CraftScoreboard> scoreboards;

    private final Map<CraftPlayer, CraftScoreboard> playerBoards;

    public CraftScoreboardManager(MinecraftServer minecraftserver, net.minecraft.server.Scoreboard scoreboardServer) {
    }

    public CraftScoreboard getMainScoreboard() {
        return null;
    }

    public CraftScoreboard getNewScoreboard() {
        return null;
    }

    // CraftBukkit method
    public CraftScoreboard getPlayerBoard(CraftPlayer player) {
        return null;
    }

    // CraftBukkit method
    public void setPlayerBoard(CraftPlayer player, org.bukkit.scoreboard.Scoreboard bukkitScoreboard) throws IllegalArgumentException {
    }

    // CraftBukkit method
    public void removePlayer(Player player) {
    }

    // CraftBukkit method
    public Collection<ScoreboardScore> getScoreboardScores(IScoreboardCriteria criteria, String name, Collection<ScoreboardScore> collection) {
        return null;
    }
}
