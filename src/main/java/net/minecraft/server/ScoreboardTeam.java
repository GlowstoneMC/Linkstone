package net.minecraft.server;

import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import javax.annotation.Nullable;

public class ScoreboardTeam extends ScoreboardTeamBase {

    private final Scoreboard a;

    private final String b;

    private final Set<String> c;

    private String d;

    private String e;

    private String f;

    private boolean g;

    private boolean h;

    private ScoreboardTeamBase.EnumNameTagVisibility i;

    private ScoreboardTeamBase.EnumNameTagVisibility j;

    private EnumChatFormat k;

    private ScoreboardTeamBase.EnumTeamPush l;

    public ScoreboardTeam(Scoreboard scoreboard, String s) {
    }

    public String getName() {
        return null;
    }

    public String getDisplayName() {
        return null;
    }

    public void setDisplayName(String s) {
    }

    public Collection<String> getPlayerNameSet() {
        return null;
    }

    public String getPrefix() {
        return null;
    }

    public void setPrefix(String s) {
    }

    public String getSuffix() {
        return null;
    }

    public void setSuffix(String s) {
    }

    public String getFormattedName(String s) {
        return null;
    }

    public static String getPlayerDisplayName(@Nullable ScoreboardTeamBase scoreboardteambase, String s) {
        return null;
    }

    public boolean allowFriendlyFire() {
        return false;
    }

    public void setAllowFriendlyFire(boolean flag) {
    }

    public boolean canSeeFriendlyInvisibles() {
        return false;
    }

    public void setCanSeeFriendlyInvisibles(boolean flag) {
    }

    public ScoreboardTeamBase.EnumNameTagVisibility getNameTagVisibility() {
        return null;
    }

    public ScoreboardTeamBase.EnumNameTagVisibility getDeathMessageVisibility() {
        return null;
    }

    public void setNameTagVisibility(ScoreboardTeamBase.EnumNameTagVisibility scoreboardteambase_enumnametagvisibility) {
    }

    public void setDeathMessageVisibility(ScoreboardTeamBase.EnumNameTagVisibility scoreboardteambase_enumnametagvisibility) {
    }

    public ScoreboardTeamBase.EnumTeamPush getCollisionRule() {
        return null;
    }

    public void setCollisionRule(ScoreboardTeamBase.EnumTeamPush scoreboardteambase_enumteampush) {
    }

    public int packOptionData() {
        return 0;
    }

    public void a(EnumChatFormat enumchatformat) {
    }

    public EnumChatFormat m() {
        return null;
    }
}
