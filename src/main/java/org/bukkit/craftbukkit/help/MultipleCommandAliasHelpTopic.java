package org.bukkit.craftbukkit.help;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.command.MultipleCommandAlias;
import org.bukkit.help.HelpTopic;

/**
 * This is a help topic implementation for {@link MultipleCommandAlias} commands.
 */
public class MultipleCommandAliasHelpTopic extends HelpTopic {

    private final MultipleCommandAlias alias;

    public MultipleCommandAliasHelpTopic(MultipleCommandAlias alias) {
    }

    public boolean canSee(CommandSender sender) {
        return false;
    }
}
