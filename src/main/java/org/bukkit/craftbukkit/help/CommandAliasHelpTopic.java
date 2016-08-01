package org.bukkit.craftbukkit.help;

import org.apache.commons.lang.Validate;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.help.HelpMap;
import org.bukkit.help.HelpTopic;

public class CommandAliasHelpTopic extends HelpTopic {

    private final String aliasFor = null;

    private final HelpMap helpMap = null;

    public CommandAliasHelpTopic(String alias, String aliasFor, HelpMap helpMap) {
    }

    @Override
    public String getFullText(CommandSender forWho) {
        return null;
    }

    @Override
    public boolean canSee(CommandSender commandSender) {
        return false;
    }
}
