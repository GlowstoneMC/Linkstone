package org.bukkit.craftbukkit.scoreboard;

import java.util.Set;
import net.minecraft.server.ScoreboardTeamBase.EnumNameTagVisibility;
import org.apache.commons.lang.Validate;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.scoreboard.NameTagVisibility;
import org.bukkit.scoreboard.Team;
import com.google.common.collect.ImmutableSet;
import net.minecraft.server.ScoreboardTeam;
import net.minecraft.server.ScoreboardTeamBase;

final class CraftTeam extends CraftScoreboardComponent implements Team {

    private final ScoreboardTeam team;

    CraftTeam(CraftScoreboard scoreboard, ScoreboardTeam team) {
    }

    public String getName() throws IllegalStateException {
        return null;
    }

    public String getDisplayName() throws IllegalStateException {
        return null;
    }

    public void setDisplayName(String displayName) throws IllegalStateException {
    }

    public String getPrefix() throws IllegalStateException {
        return null;
    }

    public void setPrefix(String prefix) throws IllegalStateException, IllegalArgumentException {
    }

    public String getSuffix() throws IllegalStateException {
        return null;
    }

    public void setSuffix(String suffix) throws IllegalStateException, IllegalArgumentException {
    }

    public boolean allowFriendlyFire() throws IllegalStateException {
        return false;
    }

    public void setAllowFriendlyFire(boolean enabled) throws IllegalStateException {
    }

    public boolean canSeeFriendlyInvisibles() throws IllegalStateException {
        return false;
    }

    public void setCanSeeFriendlyInvisibles(boolean enabled) throws IllegalStateException {
    }

    public NameTagVisibility getNameTagVisibility() throws IllegalArgumentException {
        return null;
    }

    public void setNameTagVisibility(NameTagVisibility visibility) throws IllegalArgumentException {
    }

    public Set<OfflinePlayer> getPlayers() throws IllegalStateException {
        return null;
    }

    @Override
    public Set<String> getEntries() throws IllegalStateException {
        return null;
    }

    public int getSize() throws IllegalStateException {
        return 0;
    }

    public void addPlayer(OfflinePlayer player) throws IllegalStateException, IllegalArgumentException {
    }

    public void addEntry(String entry) throws IllegalStateException, IllegalArgumentException {
    }

    public boolean removePlayer(OfflinePlayer player) throws IllegalStateException, IllegalArgumentException {
        return false;
    }

    public boolean removeEntry(String entry) throws IllegalStateException, IllegalArgumentException {
        return false;
    }

    public boolean hasPlayer(OfflinePlayer player) throws IllegalArgumentException, IllegalStateException {
        return false;
    }

    public boolean hasEntry(String entry) throws IllegalArgumentException, IllegalStateException {
        return false;
    }

    @Override
    public void unregister() throws IllegalStateException {
    }

    @Override
    public OptionStatus getOption(Option option) throws IllegalStateException {
        return null;
    }

    @Override
    public void setOption(Option option, OptionStatus status) throws IllegalStateException {
    }

    public static EnumNameTagVisibility bukkitToNotch(NameTagVisibility visibility) {
        return null;
    }

    public static NameTagVisibility notchToBukkit(EnumNameTagVisibility visibility) {
        return null;
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
