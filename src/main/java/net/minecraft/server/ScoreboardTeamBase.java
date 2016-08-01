package net.minecraft.server;

import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class ScoreboardTeamBase {

    public ScoreboardTeamBase() {
    }

    public boolean isAlly(@Nullable ScoreboardTeamBase scoreboardteambase) {
        return false;
    }

    public abstract String getName();

    public abstract String getFormattedName(String s);

    public abstract boolean allowFriendlyFire();

    public abstract EnumChatFormat m();

    public abstract Collection<String> getPlayerNameSet();

    public abstract ScoreboardTeamBase.EnumNameTagVisibility getDeathMessageVisibility();

    public abstract ScoreboardTeamBase.EnumTeamPush getCollisionRule();

    public static enum EnumTeamPush {

        ALWAYS("always", 0), NEVER("never", 1), HIDE_FOR_OTHER_TEAMS("pushOtherTeams", 2), HIDE_FOR_OWN_TEAM("pushOwnTeam", 3);

        private static final Map<String, ScoreboardTeamBase.EnumTeamPush> g;

        public final String e;

        public final int f;

        public static String[] a() {
            return null;
        }

        public static ScoreboardTeamBase.EnumTeamPush a(String s) {
            return null;
        }

        private EnumTeamPush(String s, int i) {
        }

        static {
        }
    }

    public static enum EnumNameTagVisibility {

        ALWAYS("always", 0), NEVER("never", 1), HIDE_FOR_OTHER_TEAMS("hideForOtherTeams", 2), HIDE_FOR_OWN_TEAM("hideForOwnTeam", 3);

        private static final Map<String, ScoreboardTeamBase.EnumNameTagVisibility> g;

        public final String e;

        public final int f;

        public static String[] a() {
            return null;
        }

        public static ScoreboardTeamBase.EnumNameTagVisibility a(String s) {
            return null;
        }

        private EnumNameTagVisibility(String s, int i) {
        }

        static {
        }
    }
}
