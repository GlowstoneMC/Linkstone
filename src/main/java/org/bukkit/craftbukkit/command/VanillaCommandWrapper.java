package org.bukkit.craftbukkit.command;

import java.util.Iterator;
import java.util.List;
import net.minecraft.server.*;
import org.apache.commons.lang.Validate;
import org.apache.logging.log4j.Level;
import org.bukkit.command.BlockCommandSender;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.command.ProxiedCommandSender;
import org.bukkit.command.RemoteConsoleCommandSender;
import org.bukkit.command.defaults.*;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.craftbukkit.entity.CraftMinecartCommand;
import org.bukkit.craftbukkit.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.entity.minecart.CommandMinecart;

public final class VanillaCommandWrapper extends VanillaCommand {

    protected final CommandAbstract vanillaCommand = null;

    public VanillaCommandWrapper(CommandAbstract vanillaCommand, String usage) {
    }

    @Override
    public boolean execute(CommandSender sender, String commandLabel, String[] args) {
        return false;
    }

    @Override
    public List<String> tabComplete(CommandSender sender, String alias, String[] args) throws IllegalArgumentException {
        return null;
    }

    public static CommandSender lastSender = null;

    // Nasty :(
    public final int dispatchVanillaCommand(CommandSender bSender, ICommandListener icommandlistener, String[] as) {
        return 0;
    }

    private ICommandListener getListener(CommandSender sender) {
        return null;
    }

    private int getPlayerListSize(String as[]) {
        return 0;
    }

    public static String[] dropFirstArgument(String as[]) {
        return null;
    }
}
