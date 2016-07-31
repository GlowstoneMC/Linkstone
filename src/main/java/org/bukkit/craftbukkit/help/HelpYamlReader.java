package org.bukkit.craftbukkit.help;

import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.help.HelpTopic;
import com.google.common.base.Charsets;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;

/**
 * HelpYamlReader is responsible for processing the contents of the help.yml file.
 */
public class HelpYamlReader {

    private YamlConfiguration helpYaml;

    private final char ALT_COLOR_CODE;

    private final Server server;

    public HelpYamlReader(Server server) {
    }

    /**
     * Extracts a list of all general help topics from help.yml
     *
     * @return A list of general topics.
     */
    public List<HelpTopic> getGeneralTopics() {
        return null;
    }

    /**
     * Extracts a list of all index topics from help.yml
     *
     * @return A list of index topics.
     */
    public List<HelpTopic> getIndexTopics() {
        return null;
    }

    /**
     * Extracts a list of topic amendments from help.yml
     *
     * @return A list of amendments.
     */
    public List<HelpTopicAmendment> getTopicAmendments() {
        return null;
    }

    public List<String> getIgnoredPlugins() {
        return null;
    }

    public boolean commandTopicsInMasterIndex() {
        return false;
    }
}
