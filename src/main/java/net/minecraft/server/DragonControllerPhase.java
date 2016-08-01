package net.minecraft.server;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class DragonControllerPhase<T extends IDragonController> {

    private static DragonControllerPhase<?>[] l = null;

    public static final DragonControllerPhase<DragonControllerHold> a = null;

    public static final DragonControllerPhase<DragonControllerStrafe> b = null;

    public static final DragonControllerPhase<DragonControllerLandingFly> c = null;

    public static final DragonControllerPhase<DragonControllerLanding> d = null;

    public static final DragonControllerPhase<DragonControllerFly> e = null;

    public static final DragonControllerPhase<DragonControllerLandedFlame> f = null;

    public static final DragonControllerPhase<DragonControllerLandedSearch> g = null;

    public static final DragonControllerPhase<DragonControllerLandedAttack> h = null;

    public static final DragonControllerPhase<DragonControllerCharge> i = null;

    public static final DragonControllerPhase<DragonControllerDying> j = null;

    public static final DragonControllerPhase<DragonControllerHover> k = null;

    private final Class<? extends IDragonController> m = null;

    private final int n = 0;

    private final String o = null;

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
