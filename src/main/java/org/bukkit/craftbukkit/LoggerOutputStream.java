package org.bukkit.craftbukkit;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;

public class LoggerOutputStream extends ByteArrayOutputStream {

    private final String separator;

    private final Logger logger;

    private final Level level;

    public LoggerOutputStream(Logger logger, Level level) {
    }

    @Override
    public void flush() throws IOException {
    }
}
