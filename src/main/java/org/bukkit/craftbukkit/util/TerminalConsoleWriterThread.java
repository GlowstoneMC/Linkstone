package org.bukkit.craftbukkit.util;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import jline.console.ConsoleReader;
import org.bukkit.craftbukkit.Main;
import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.Ansi.Erase;

public class TerminalConsoleWriterThread implements Runnable {
    final private ConsoleReader reader;
    final private OutputStream output;

    public TerminalConsoleWriterThread(OutputStream output, ConsoleReader reader) {
        this.output = output;
        this.reader = reader;
    }

    public void run() {
    }
}
