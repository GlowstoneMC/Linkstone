package org.bukkit.craftbukkit.help;

/**
 * A HelpTopicAmendment represents the contents of a topic amendment from the help.yml
 */
public class HelpTopicAmendment {

    private final String topicName;

    private final String shortText;

    private final String fullText;

    private final String permission;

    public HelpTopicAmendment(String topicName, String shortText, String fullText, String permission) {
    }

    /**
     * Gets the amended full text
     * @return the full text
     */
    public String getFullText() {
        return null;
    }

    /**
     * Gets the amended short text
     * @return the short text
     */
    public String getShortText() {
        return null;
    }

    /**
     * Gets the name of the topic being amended
     * @return the topic name
     */
    public String getTopicName() {
        return null;
    }

    /**
     * Gets the amended permission
     * @return the permission
     */
    public String getPermission() {
        return null;
    }
}
