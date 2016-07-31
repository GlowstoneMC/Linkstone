package org.bukkit.craftbukkit.scheduler;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.bukkit.plugin.Plugin;

class CraftFuture<T> extends CraftTask implements Future<T> {

    private final Callable<T> callable;

    private T value;

    private Exception exception;

    CraftFuture(final Callable<T> callable, final Plugin plugin, final int id) {
    }

    public synchronized boolean cancel(final boolean mayInterruptIfRunning) {
        return false;
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return false;
    }

    public T get() throws CancellationException, InterruptedException, ExecutionException {
        return null;
    }

    public synchronized T get(long timeout, final TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        return null;
    }

    @Override
    public void run() {
    }

    synchronized boolean cancel0() {
        return false;
    }
}
