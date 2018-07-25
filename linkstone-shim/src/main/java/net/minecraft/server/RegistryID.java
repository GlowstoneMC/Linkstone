package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;

import java.util.Iterator;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class RegistryID<K> implements Registry {
    private K[] b;
    private K[] d;

    @Override
    public Iterator iterator() {
        // TODO Auto-generated method stub
        return null;
    }

}