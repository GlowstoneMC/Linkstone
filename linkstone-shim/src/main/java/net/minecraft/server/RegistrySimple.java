package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;

import java.util.Iterator;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class RegistrySimple<K, V> implements IRegistry<K, V>  {

    @Override
    public Iterator<V> iterator() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void a(K var1, V var2) {
        // TODO Auto-generated method stub
    }

}