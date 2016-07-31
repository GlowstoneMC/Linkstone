package org.bukkit.craftbukkit.conversations;

import java.util.LinkedList;
import java.util.logging.Level;
import org.bukkit.Bukkit;
import org.bukkit.conversations.Conversation;
import org.bukkit.conversations.ConversationAbandonedEvent;
import org.bukkit.conversations.ManuallyAbandonedConversationCanceller;

/**
 */
public class ConversationTracker {

    private LinkedList<Conversation> conversationQueue;

    public synchronized boolean beginConversation(Conversation conversation) {
        return false;
    }

    public synchronized void abandonConversation(Conversation conversation, ConversationAbandonedEvent details) {
    }

    public synchronized void abandonAllConversations() {
    }

    public synchronized void acceptConversationInput(String input) {
    }

    public synchronized boolean isConversing() {
        return false;
    }

    public synchronized boolean isConversingModaly() {
        return false;
    }
}
