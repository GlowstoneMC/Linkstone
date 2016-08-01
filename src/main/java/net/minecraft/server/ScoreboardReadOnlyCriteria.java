package net.minecraft.server;

public class ScoreboardReadOnlyCriteria extends ScoreboardBaseCriteria {

    public ScoreboardReadOnlyCriteria(String s) {
    }

    public boolean isReadOnly() {
        return false;
    }
}
