package org.bukkit.craftbukkit.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class ForwardLogHandler extends ConsoleHandler {

    private Map<String, Logger> cachedLoggers = null;

    private Logger getLogger(String name) {
        return null;
    }

    @Override
    public void publish(LogRecord record) {
    }

    @Override
    public void flush() {
    }

    @Override
    public void close() throws SecurityException {
    }
}
