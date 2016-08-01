package org.bukkit.craftbukkit.scheduler;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import org.apache.commons.lang.UnhandledException;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitWorker;

class CraftAsyncTask extends CraftTask {

    private final LinkedList<BukkitWorker> workers = null;

    private final Map<Integer, CraftTask> runners = null;

    CraftAsyncTask(final Map<Integer, CraftTask> runners, final Plugin plugin, final Runnable task, final int id, final long delay) {
    }

    @Override
    public boolean isSync() {
        return false;
    }

    @Override
    public void run() {
    }

    LinkedList<BukkitWorker> getWorkers() {
        return null;
    }

    boolean cancel0() {
        return false;
    }
}
