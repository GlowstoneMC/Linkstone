package org.bukkit.craftbukkit.help;

import org.bukkit.command.CommandSender;
import org.bukkit.help.HelpMap;
import org.bukkit.help.HelpTopic;
import org.bukkit.help.IndexHelpTopic;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 */
public class CustomIndexHelpTopic extends IndexHelpTopic {

    private List<String> futureTopics;

    private final HelpMap helpMap;

    public CustomIndexHelpTopic(HelpMap helpMap, String name, String shortText, String permission, List<String> futureTopics, String preamble) {
    }

    @Override
    public String getFullText(CommandSender sender) {
        return null;
    }
}
