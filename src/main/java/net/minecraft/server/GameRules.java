package net.minecraft.server;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class GameRules {

    private final TreeMap<String, GameRules.GameRuleValue> a;

    public GameRules() {
    }

    public void a(String s, String s1, GameRules.EnumGameRuleType gamerules_enumgameruletype) {
    }

    public void set(String s, String s1) {
    }

    public String get(String s) {
        return null;
    }

    public boolean getBoolean(String s) {
        return false;
    }

    public int c(String s) {
        return 0;
    }

    public NBTTagCompound a() {
        return null;
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    public String[] getGameRules() {
        return null;
    }

    public boolean contains(String s) {
        return false;
    }

    public boolean a(String s, GameRules.EnumGameRuleType gamerules_enumgameruletype) {
        return false;
    }

    public static enum EnumGameRuleType {

        ANY_VALUE, BOOLEAN_VALUE, NUMERICAL_VALUE;

        private EnumGameRuleType() {
        }
    }

    static class GameRuleValue {

        private String a;

        private boolean b;

        private int c;

        private double d;

        private final GameRules.EnumGameRuleType e;

        public GameRuleValue(String s, GameRules.EnumGameRuleType gamerules_enumgameruletype) {
        }

        public void a(String s) {
        }

        public String a() {
            return null;
        }

        public boolean b() {
            return false;
        }

        public int c() {
            return 0;
        }

        public GameRules.EnumGameRuleType e() {
            return null;
        }
    }
}
