package net.glowstone.linkstone.runtime.reflectionredirect.method;

/**
 * Since the MethodAccessor in java's reflection api is in different packages on different JVMs,
 * we use our own class and generate adapters on the fly.
 */
public interface LMethodAccessor {
    Object invoke(Object instance, Object[] arguments) throws Exception;
}
