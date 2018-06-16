package net.minecraft.server;

import java.util.concurrent.Callable;

public interface CrashReportCallable<V> extends Callable<V> {
    // I don't understand why Mojang needs a seperate class, why not just use Callable<V>
}