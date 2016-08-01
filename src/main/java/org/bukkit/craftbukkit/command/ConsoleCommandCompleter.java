package org.bukkit.craftbukkit.command;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.craftbukkit.util.Waitable;
import jline.console.completer.Completer;
import org.bukkit.event.server.TabCompleteEvent;

public class ConsoleCommandCompleter implements Completer {

    private final CraftServer server;

    public ConsoleCommandCompleter(CraftServer server) {
    }

    public int complete(final String buffer, final int cursor, final List<CharSequence> candidates) {
        return 0;
    }
}
