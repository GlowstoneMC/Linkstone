package net.minecraft.server;

public abstract class LazyInitVar<T> {

    private T a;

    private boolean b;

    public LazyInitVar() {
    }

    public T c() {
        return null;
    }

    protected abstract T init();
}
