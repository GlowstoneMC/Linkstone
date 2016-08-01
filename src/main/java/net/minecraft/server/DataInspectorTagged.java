package net.minecraft.server;

public abstract class DataInspectorTagged implements DataInspector {

    private final String a;

    private final String b;

    public DataInspectorTagged(String s, String s1) {
    }

    public NBTTagCompound a(DataConverter dataconverter, NBTTagCompound nbttagcompound, int i) {
        return null;
    }

    abstract NBTTagCompound b(DataConverter dataconverter, NBTTagCompound nbttagcompound, int i);
}
