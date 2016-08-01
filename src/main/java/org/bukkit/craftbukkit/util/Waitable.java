package org.bukkit.craftbukkit.util;

import java.util.concurrent.ExecutionException;

public abstract class Waitable<T> implements Runnable {

    private enum Status {

        WAITING, RUNNING, FINISHED
    }

    Throwable t;

    T value;

    Status status;

    public final void run() {
    }

    protected abstract T evaluate();

    public synchronized T get() throws InterruptedException, ExecutionException {
        return null;
    }
}
