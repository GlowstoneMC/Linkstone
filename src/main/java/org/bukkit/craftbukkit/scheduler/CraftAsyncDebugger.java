package org.bukkit.craftbukkit.scheduler;

import org.bukkit.plugin.Plugin;

class CraftAsyncDebugger {

    private CraftAsyncDebugger next = null;

    private final int expiry = 0;

    private final Plugin plugin = null;

    private final Class<? extends Runnable> clazz = null;

    CraftAsyncDebugger(final int expiry, final Plugin plugin, final Class<? extends Runnable> clazz) {
    }

    final CraftAsyncDebugger getNextHead(final int time) {
        return null;
    }

    final CraftAsyncDebugger setNext(final CraftAsyncDebugger next) {
        return null;
    }

    StringBuilder debugTo(final StringBuilder string) {
        return null;
    }
}
