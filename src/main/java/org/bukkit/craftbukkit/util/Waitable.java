package org.bukkit.craftbukkit.util;

import java.util.concurrent.ExecutionException;

public abstract class Waitable<T> implements Runnable {

    private enum Status {

        WAITING, RUNNING, FINISHED
    }

    Throwable t = null;

    T value = null;

    Status status = null;

    public final void run() {
    }

    protected abstract T evaluate();

    public synchronized T get() throws InterruptedException, ExecutionException {
        return null;
    }
}
