package net.glowstone.linkstone;

public class Linkstone {
    /**
     * This method wraps objects into the requested box.
     * It's just an identity method, so what's the magic behind it?
     *
     * If a invoke of this generic method is compiled, then the returned value will be casted.
     * E.g. <code>Linkstone.&lt;EntityPlayer&gt;box(player)</code> will compile to
     * <code>(EntityPlayer) Linkstone.&lt;EntityPlayer&gt;box(player)</code>.
     *
     * The linkstone runtime replaces casts to types that are a box against the usage of
     * BoxCache#box(Object, Class). So the above code will be transformed to the
     * following before its loaded by Glowstone:
     * <code>BoxCache.box(Linkstone.&lt;EntityPlayer&gt;box(player), EntityPlayer.class)</code>
     *
     * There is a lint build into the compiler that checks if this methods is use correct,
     * so do not build your own boxing method!
     *
     * @param obj object to be boxed
     * @param <T> Type that must be a boxed that can box the object
     * @return the boxed object
     */
    @SuppressWarnings("unchecked")
    public static <T> T box(Object obj) {
        return (T) obj;
    }

    /**
     * Cast a class to one of its delegated interface.
     *
     * This method works similar to {@link Linkstone#box(Object)}.
     *
     * There is a lint build into the compiler that checks if this methods is used correct,
     * so do not build your own method!
     *
     * @param obj object to cast
     * @param objClass Type of the object that will be casted
     * @param <T> Interface implemented by the object
     * @param <U> Type of the object
     * @return the casted object
     */
    @SuppressWarnings("unchecked")
    public static <T, U> T as(U obj, Class<U> objClass) {
        return (T) obj;
    }

    public static <T> T notYetImplemented() {
        throw new NotYetImplementedException();
    }
}
