package net.minecraft.server;

public abstract class DataInspectorTagged implements DataInspector {

    private final String a = null;

    private final String b = null;

    public DataInspectorTagged(String s, String s1) {
    }

    public NBTTagCompound a(DataConverter dataconverter, NBTTagCompound nbttagcompound, int i) {
        return null;
    }

    abstract NBTTagCompound b(DataConverter dataconverter, NBTTagCompound nbttagcompound, int i);
}
