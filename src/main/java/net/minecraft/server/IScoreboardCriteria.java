package net.minecraft.server;

import com.google.common.collect.Maps;
import java.util.Map;

public interface IScoreboardCriteria {

    Map<String, IScoreboardCriteria> criteria = null;

    IScoreboardCriteria b = null;

    IScoreboardCriteria c = null;

    IScoreboardCriteria d = null;

    IScoreboardCriteria e = null;

    IScoreboardCriteria f = null;

    IScoreboardCriteria g = null;

    IScoreboardCriteria h = null;

    IScoreboardCriteria i = null;

    IScoreboardCriteria j = null;

    IScoreboardCriteria k = null;

    IScoreboardCriteria l = null;

    IScoreboardCriteria[] m = null;

    IScoreboardCriteria[] n = null;

    String getName() {
        return null;
    }

    boolean isReadOnly() {
        return false;
    }

    IScoreboardCriteria.EnumScoreboardHealthDisplay c() {
        return null;
    }

    public static enum EnumScoreboardHealthDisplay {

        INTEGER("integer"), HEARTS("hearts");

        private static final Map<String, IScoreboardCriteria.EnumScoreboardHealthDisplay> c = null;

        private final String d = null;

        private EnumScoreboardHealthDisplay(String s) {
        }

        public String a() {
            return null;
        }

        public static IScoreboardCriteria.EnumScoreboardHealthDisplay a(String s) {
            return null;
        }

        static {
        }
    }
}
