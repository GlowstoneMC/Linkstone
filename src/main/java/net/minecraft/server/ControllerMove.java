package net.minecraft.server;

public class ControllerMove {

    protected final EntityInsentient a;

    protected double b;

    protected double c;

    protected double d;

    protected double e;

    protected float f;

    protected float g;

    protected ControllerMove.Operation h;

    public ControllerMove(EntityInsentient entityinsentient) {
    }

    public boolean a() {
        return false;
    }

    public double b() {
        return 0.0;
    }

    public void a(double d0, double d1, double d2, double d3) {
    }

    public void a(float f, float f1) {
    }

    public void a(ControllerMove controllermove) {
    }

    public void c() {
    }

    protected float a(float f, float f1, float f2) {
        return 0.0F;
    }

    public double d() {
        return 0.0;
    }

    public double e() {
        return 0.0;
    }

    public double f() {
        return 0.0;
    }

    public static enum Operation {

        WAIT, MOVE_TO, STRAFE;

        private Operation() {
        }
    }
}
