package net.minecraft.server;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class WorldGenMineshaft extends StructureGenerator {

    private double a = 0.0;

    public WorldGenMineshaft() {
    }

    public String a() {
        return null;
    }

    public WorldGenMineshaft(Map<String, String> map) {
    }

    protected boolean a(int i, int j) {
        return false;
    }

    protected StructureStart b(int i, int j) {
        return null;
    }

    public static enum Type {

        NORMAL, MESA;

        private Type() {
        }

        public static WorldGenMineshaft.Type a(int i) {
            return null;
        }
    }
}
