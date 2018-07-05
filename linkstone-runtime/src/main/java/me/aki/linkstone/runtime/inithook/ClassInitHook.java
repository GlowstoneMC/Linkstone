package me.aki.linkstone.runtime.inithook;

import java.util.ArrayList;
import java.util.List;

/**
 * Observe when a new class was initialized (static constructor was called).
 *
 * This only applies to classes transformed by the {@link ClassInitInvokeVisitor}.
 */
public class ClassInitHook {
    public interface Observer {
        /**
         * Invoked when the class was initialized.
         *
         * @param clazz initialized class
         */
        void onInit(Class<?> clazz);
    }

    private static final List<Observer> observers = new ArrayList<>();

    public static void register(Observer observer) {
        observers.add(observer);
    }

    public static void call(Class<?> clazz) {
        for(Observer observer : observers) {
            observer.onInit(clazz);
        }
    }
}
