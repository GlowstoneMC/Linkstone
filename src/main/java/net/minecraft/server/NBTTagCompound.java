package net.minecraft.server;

import com.google.common.collect.Maps;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class NBTTagCompound extends NBTBase {

    private final Map<String, NBTBase> map;

    public NBTTagCompound() {
    }

    void write(DataOutput dataoutput) throws IOException {
    }

    void load(DataInput datainput, int i, NBTReadLimiter nbtreadlimiter) throws IOException {
    }

    public Set<String> c() {
        return null;
    }

    public byte getTypeId() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public void set(String s, NBTBase nbtbase) {
    }

    public void setByte(String s, byte b0) {
    }

    public void setShort(String s, short short0) {
    }

    public void setInt(String s, int i) {
    }

    public void setLong(String s, long i) {
    }

    public void a(String s, UUID uuid) {
    }

    @Nullable
    public UUID a(String s) {
        return null;
    }

    public boolean b(String s) {
        return false;
    }

    public void setFloat(String s, float f) {
    }

    public void setDouble(String s, double d0) {
    }

    public void setString(String s, String s1) {
    }

    public void setByteArray(String s, byte[] abyte) {
    }

    public void setIntArray(String s, int[] aint) {
    }

    public void setBoolean(String s, boolean flag) {
    }

    public NBTBase get(String s) {
        return null;
    }

    public byte d(String s) {
        return 0;
    }

    public boolean hasKey(String s) {
        return false;
    }

    public boolean hasKeyOfType(String s, int i) {
        return false;
    }

    public byte getByte(String s) {
        return 0;
    }

    public short getShort(String s) {
        return 0;
    }

    public int getInt(String s) {
        return 0;
    }

    public long getLong(String s) {
        return 0;
    }

    public float getFloat(String s) {
        return 0.0F;
    }

    public double getDouble(String s) {
        return 0.0;
    }

    public String getString(String s) {
        return null;
    }

    public byte[] getByteArray(String s) {
        return null;
    }

    public int[] getIntArray(String s) {
        return null;
    }

    public NBTTagCompound getCompound(String s) {
        return null;
    }

    public NBTTagList getList(String s, int i) {
        return null;
    }

    public boolean getBoolean(String s) {
        return false;
    }

    public void remove(String s) {
    }

    public String toString() {
        return null;
    }

    public boolean isEmpty() {
        return false;
    }

    private CrashReport a(final String s, final int i, ClassCastException classcastexception) {
        return null;
    }

    public NBTTagCompound g() {
        return null;
    }

    public boolean equals(Object object) {
        return false;
    }

    public int hashCode() {
        return 0;
    }

    private static void a(String s, NBTBase nbtbase, DataOutput dataoutput) throws IOException {
    }

    private static byte a(DataInput datainput, NBTReadLimiter nbtreadlimiter) throws IOException {
        return 0;
    }

    private static String b(DataInput datainput, NBTReadLimiter nbtreadlimiter) throws IOException {
        return null;
    }

    static NBTBase a(byte b0, String s, DataInput datainput, int i, NBTReadLimiter nbtreadlimiter) throws IOException {
        return null;
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    public NBTBase clone() {
        return null;
    }
}
