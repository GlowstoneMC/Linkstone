package net.minecraft.server;

public abstract class LazyInitVar<T> {

    private T a = null;

    private boolean b = false;

    public LazyInitVar() {
    }

    public T c() {
        return null;
    }

    protected abstract T init();
}
