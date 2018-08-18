package org.bukkit.craftbukkit.util;

import net.glowstone.linkstone.annotations.LClassfile;

import java.io.OutputStream;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class TerminalConsoleWriterThread implements Runnable {
    public TerminalConsoleWriterThread(OutputStream output,Object reader) {
    }

    public void run() {
    }
}
