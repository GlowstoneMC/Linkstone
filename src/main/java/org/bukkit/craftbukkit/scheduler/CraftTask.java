package org.bukkit.craftbukkit.scheduler;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitTask;

class CraftTask implements BukkitTask, Runnable {

    private volatile CraftTask next;

    /**
     * -1 means no repeating <br>
     * -2 means cancel <br>
     * -3 means processing for Future <br>
     * -4 means done for Future <br>
     * Never 0 <br>
     * >0 means number of ticks to wait between each execution
     */
    private volatile long period;

    private long nextRun;

    private final Runnable task;

    private final Plugin plugin;

    private final int id;

    CraftTask() {
    }

    CraftTask(final Runnable task) {
    }

    CraftTask(final Plugin plugin, final Runnable task, final int id, final long period) {
    }

    public final int getTaskId() {
        return 0;
    }

    public final Plugin getOwner() {
        return null;
    }

    public boolean isSync() {
        return false;
    }

    public void run() {
    }

    long getPeriod() {
        return 0;
    }

    void setPeriod(long period) {
    }

    long getNextRun() {
        return 0;
    }

    void setNextRun(long nextRun) {
    }

    CraftTask getNext() {
        return null;
    }

    void setNext(CraftTask next) {
    }

    Class<? extends Runnable> getTaskClass() {
        return null;
    }

    public void cancel() {
    }

    /**
     * This method properly sets the status to cancelled, synchronizing when required.
     *
     * @return false if it is a craft future task that has already begun execution, true otherwise
     */
    boolean cancel0() {
        return false;
    }
}
