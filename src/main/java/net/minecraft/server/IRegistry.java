package net.minecraft.server;

public interface IRegistry<K, V> extends Iterable<V> {

    public void a(K var1, V var2);

}