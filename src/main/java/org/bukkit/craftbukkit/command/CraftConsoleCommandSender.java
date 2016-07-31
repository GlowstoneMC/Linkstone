package org.bukkit.craftbukkit.command;

import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.conversations.Conversation;
import org.bukkit.conversations.ConversationAbandonedEvent;
import org.bukkit.conversations.ManuallyAbandonedConversationCanceller;
import org.bukkit.craftbukkit.conversations.ConversationTracker;

/**
 * Represents CLI input from a console
 */
public class CraftConsoleCommandSender extends ServerCommandSender implements ConsoleCommandSender {

    protected final ConversationTracker conversationTracker;

    protected CraftConsoleCommandSender() {
    }

    public void sendMessage(String message) {
    }

    public void sendRawMessage(String message) {
    }

    public void sendMessage(String[] messages) {
    }

    public String getName() {
        return null;
    }

    public boolean isOp() {
        return false;
    }

    public void setOp(boolean value) {
    }

    public boolean beginConversation(Conversation conversation) {
        return false;
    }

    public void abandonConversation(Conversation conversation) {
    }

    public void abandonConversation(Conversation conversation, ConversationAbandonedEvent details) {
    }

    public void acceptConversationInput(String input) {
    }

    public boolean isConversing() {
        return false;
    }
}
