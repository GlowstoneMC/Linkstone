package net.minecraft.server;

public class ScoreboardHealthCriteria extends ScoreboardBaseCriteria {

    public ScoreboardHealthCriteria(String s) {
    }

    public boolean isReadOnly() {
        return false;
    }

    public IScoreboardCriteria.EnumScoreboardHealthDisplay c() {
        return null;
    }
}
