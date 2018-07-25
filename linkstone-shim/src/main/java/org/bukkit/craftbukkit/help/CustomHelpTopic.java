package org.bukkit.craftbukkit.help;

import net.glowstone.linkstone.annotations.LClassfile;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.help.HelpTopic;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

/**
 * This is a help topic implementation for general topics registered in the help.yml file.
 */
@LClassfile(version = V1_12_R1)
public class CustomHelpTopic extends HelpTopic {
    private final String permissionNode;

    public CustomHelpTopic(String name, String shortText, String fullText, String permissionNode) {
        this.permissionNode = permissionNode;
        this.name = name;
        this.shortText = shortText;
        this.fullText = shortText + "\n" + fullText;
    }

    public boolean canSee(CommandSender sender) {
        if (sender instanceof ConsoleCommandSender) return true;

        return (permissionNode.equals("") ? true : sender.hasPermission(permissionNode));
    }
}
