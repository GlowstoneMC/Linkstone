package org.bukkit.craftbukkit.util;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import jline.console.ConsoleReader;
import com.mojang.util.QueueLogAppender;
import org.bukkit.craftbukkit.Main;
import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.Ansi.Erase;

public class TerminalConsoleWriterThread implements Runnable {

    private final ConsoleReader reader = null;

    private final OutputStream output = null;

    public TerminalConsoleWriterThread(OutputStream output, ConsoleReader reader) {
    }

    public void run() {
    }
}
