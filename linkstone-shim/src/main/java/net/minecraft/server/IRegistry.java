package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LMethod;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public interface IRegistry<K, V> extends Iterable<V> {

    @LMethod(version = V1_12_R1, name = "a")
    public void add(K var1, V var2);

}