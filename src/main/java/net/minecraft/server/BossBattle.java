package net.minecraft.server;

import java.util.UUID;

public abstract class BossBattle {

    private final UUID h;

    public IChatBaseComponent title;

    protected float b;

    public BossBattle.BarColor color;

    public BossBattle.BarStyle style;

    protected boolean e;

    protected boolean f;

    protected boolean g;

    public BossBattle(UUID uuid, IChatBaseComponent ichatbasecomponent, BossBattle.BarColor bossbattle_barcolor, BossBattle.BarStyle bossbattle_barstyle) {
    }

    public UUID d() {
        return null;
    }

    public IChatBaseComponent e() {
        return null;
    }

    public float getProgress() {
        return 0.0F;
    }

    public void a(float f) {
    }

    public BossBattle.BarColor g() {
        return null;
    }

    public BossBattle.BarStyle h() {
        return null;
    }

    public boolean i() {
        return false;
    }

    public BossBattle a(boolean flag) {
        return null;
    }

    public boolean j() {
        return false;
    }

    public BossBattle b(boolean flag) {
        return null;
    }

    public BossBattle c(boolean flag) {
        return null;
    }

    public boolean k() {
        return false;
    }

    public static enum BarStyle {

        PROGRESS, NOTCHED_6, NOTCHED_10, NOTCHED_12, NOTCHED_20;

        private BarStyle() {
        }
    }

    public static enum BarColor {

        PINK, BLUE, RED, GREEN, YELLOW, PURPLE, WHITE;

        private BarColor() {
        }
    }
}
