package org.bukkit.craftbukkit.help;

import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.help.HelpTopic;

/**
 * This is a help topic implementation for general topics registered in the help.yml file.
 */
public class CustomHelpTopic extends HelpTopic {

    private final String permissionNode = null;

    public CustomHelpTopic(String name, String shortText, String fullText, String permissionNode) {
    }

    public boolean canSee(CommandSender sender) {
        return false;
    }
}
