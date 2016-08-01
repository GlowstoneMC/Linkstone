package org.bukkit.craftbukkit;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;

public class LoggerOutputStream extends ByteArrayOutputStream {

    private final String separator = null;

    private final Logger logger = null;

    private final Level level = null;

    public LoggerOutputStream(Logger logger, Level level) {
    }

    @Override
    public void flush() throws IOException {
    }
}
