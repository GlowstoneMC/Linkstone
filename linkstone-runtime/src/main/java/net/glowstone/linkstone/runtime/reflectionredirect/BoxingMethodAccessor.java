package net.glowstone.linkstone.runtime.reflectionredirect;

import net.glowstone.linkstone.runtime.BoxCache;

import java.lang.reflect.Method;

/**
 * Method accessor that wraps the instance into a box before the method is invoked.
 */
public class BoxingMethodAccessor implements LMethodAccessor {
    private final LMethodAccessor originalAccessor;
    private final Method method;

    public BoxingMethodAccessor(Method method, LMethodAccessor defaultAccessor) {
        this.method = method;
        this.originalAccessor = defaultAccessor;
    }

    @Override
    public Object invoke(Object instance, Object[] arguments) throws Exception {
        if (instance != null && !method.getDeclaringClass().isAssignableFrom(instance.getClass())) {
            instance = BoxCache.box(instance, method.getDeclaringClass());
        }

        return originalAccessor.invoke(instance, arguments);
    }
}
