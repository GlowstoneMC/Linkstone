package net.minecraft.server;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class DragonControllerPhase<T extends IDragonController> {

    private static DragonControllerPhase<?>[] l;

    public static final DragonControllerPhase<DragonControllerHold> a;

    public static final DragonControllerPhase<DragonControllerStrafe> b;

    public static final DragonControllerPhase<DragonControllerLandingFly> c;

    public static final DragonControllerPhase<DragonControllerLanding> d;

    public static final DragonControllerPhase<DragonControllerFly> e;

    public static final DragonControllerPhase<DragonControllerLandedFlame> f;

    public static final DragonControllerPhase<DragonControllerLandedSearch> g;

    public static final DragonControllerPhase<DragonControllerLandedAttack> h;

    public static final DragonControllerPhase<DragonControllerCharge> i;

    public static final DragonControllerPhase<DragonControllerDying> j;

    public static final DragonControllerPhase<DragonControllerHover> k;

    private final Class<? extends IDragonController> m;

    private final int n;

    private final String o;

    private DragonControllerPhase(int i, Class<? extends IDragonController> oclass, String s) {
    }

    public IDragonController a(EntityEnderDragon entityenderdragon) {
        return null;
    }

    protected Constructor<? extends IDragonController> a() throws NoSuchMethodException {
        return null;
    }

    public int b() {
        return 0;
    }

    public String toString() {
        return null;
    }

    public static DragonControllerPhase<?> getById(int i) {
        return null;
    }

    public static int c() {
        return 0;
    }

    private static <T extends IDragonController> DragonControllerPhase<T> a(Class<T> oclass, String s) {
        return null;
    }
}
