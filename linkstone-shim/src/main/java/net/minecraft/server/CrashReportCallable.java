package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;

import java.util.concurrent.Callable;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public interface CrashReportCallable<V> extends Callable<V> {
    // I don't understand why Mojang needs a seperate class, why not just use Callable<V>
}