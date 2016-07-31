package org.bukkit.craftbukkit.util;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;
import joptsimple.OptionException;
import joptsimple.OptionSet;
import net.minecraft.server.MinecraftServer;

public class ShortConsoleLogFormatter extends Formatter {

    private final SimpleDateFormat date;

    public ShortConsoleLogFormatter(MinecraftServer server) {
    }

    @Override
    public String format(LogRecord record) {
        return null;
    }
}
