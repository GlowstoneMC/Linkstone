package net.minecraft.server;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public abstract class NBTBase {

    public static final String[] a = null;

    abstract void write(DataOutput dataoutput) throws IOException;

    abstract void load(DataInput datainput, int i, NBTReadLimiter nbtreadlimiter) throws IOException;

    public abstract String toString();

    public abstract byte getTypeId();

    protected NBTBase() {
    }

    protected static NBTBase createTag(byte b0) {
        return null;
    }

    public abstract NBTBase clone();

    public boolean isEmpty() {
        return false;
    }

    public boolean equals(Object object) {
        return false;
    }

    public int hashCode() {
        return 0;
    }

    protected String c_() {
        return null;
    }
}
