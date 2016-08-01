package org.bukkit.craftbukkit.scoreboard;

abstract class CraftScoreboardComponent {

    private CraftScoreboard scoreboard = null;

    CraftScoreboardComponent(CraftScoreboard scoreboard) {
    }

    abstract CraftScoreboard checkState() throws IllegalStateException;

    public CraftScoreboard getScoreboard() {
        return null;
    }

    abstract void unregister() throws IllegalStateException;
}
