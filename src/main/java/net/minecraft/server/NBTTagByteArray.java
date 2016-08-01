package net.minecraft.server;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;

public class NBTTagByteArray extends NBTBase {

    private byte[] data;

    NBTTagByteArray() {
    }

    public NBTTagByteArray(byte[] abyte) {
    }

    void write(DataOutput dataoutput) throws IOException {
    }

    void load(DataInput datainput, int i, NBTReadLimiter nbtreadlimiter) throws IOException {
    }

    public byte getTypeId() {
        return 0;
    }

    public String toString() {
        return null;
    }

    public NBTBase clone() {
        return null;
    }

    public boolean equals(Object object) {
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public byte[] c() {
        return null;
    }
}
