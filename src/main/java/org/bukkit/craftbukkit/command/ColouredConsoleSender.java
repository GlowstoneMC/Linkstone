package org.bukkit.craftbukkit.command;

import java.util.EnumMap;
import java.util.Map;
import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.Ansi.Attribute;
import jline.Terminal;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.craftbukkit.CraftServer;

public class ColouredConsoleSender extends CraftConsoleCommandSender {

    private final Terminal terminal;

    private final Map<ChatColor, String> replacements;

    private final ChatColor[] colors;

    protected ColouredConsoleSender() {
    }

    @Override
    public void sendMessage(String message) {
    }

    public static ConsoleCommandSender getInstance() {
        return null;
    }
}
