package net.minecraft.server;

import com.google.common.collect.Maps;
import java.util.Map;

public interface IScoreboardCriteria {

    Map<String, IScoreboardCriteria> criteria;

    IScoreboardCriteria b;

    IScoreboardCriteria c;

    IScoreboardCriteria d;

    IScoreboardCriteria e;

    IScoreboardCriteria f;

    IScoreboardCriteria g;

    IScoreboardCriteria h;

    IScoreboardCriteria i;

    IScoreboardCriteria j;

    IScoreboardCriteria k;

    IScoreboardCriteria l;

    IScoreboardCriteria[] m;

    IScoreboardCriteria[] n;

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

        private static final Map<String, IScoreboardCriteria.EnumScoreboardHealthDisplay> c;

        private final String d;

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
