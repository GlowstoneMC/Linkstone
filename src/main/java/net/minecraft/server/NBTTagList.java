package net.minecraft.server;

import com.google.common.collect.Lists;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NBTTagList extends NBTBase {

    private static final Logger b;

    private List<NBTBase> list;

    private byte type;

    public NBTTagList() {
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

    public void add(NBTBase nbtbase) {
    }

    public void a(int i, NBTBase nbtbase) {
    }

    public NBTBase remove(int i) {
        return null;
    }

    public boolean isEmpty() {
        return false;
    }

    public NBTTagCompound get(int i) {
        return null;
    }

    public int c(int i) {
        return 0;
    }

    public int[] d(int i) {
        return null;
    }

    public double e(int i) {
        return 0.0;
    }

    public float f(int i) {
        return 0.0F;
    }

    public String getString(int i) {
        return null;
    }

    public NBTBase h(int i) {
        return null;
    }

    public int size() {
        return 0;
    }

    public NBTTagList d() {
        return null;
    }

    public boolean equals(Object object) {
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public int g() {
        return 0;
    }

    public NBTBase clone() {
        return null;
    }
}
