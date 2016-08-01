package net.minecraft.server;

import com.google.common.collect.Maps;
import java.util.Map;

public class StatisticManager {

    protected final Map<Statistic, StatisticWrapper> a;

    public StatisticManager() {
    }

    public boolean hasAchievement(Achievement achievement) {
        return false;
    }

    public boolean b(Achievement achievement) {
        return false;
    }

    public void b(EntityHuman entityhuman, Statistic statistic, int i) {
    }

    public void setStatistic(EntityHuman entityhuman, Statistic statistic, int i) {
    }

    public int getStatisticValue(Statistic statistic) {
        return 0;
    }

    public <T extends IJsonStatistic> T b(Statistic statistic) {
        return null;
    }

    public <T extends IJsonStatistic> T a(Statistic statistic, T t0) {
        return null;
    }
}
