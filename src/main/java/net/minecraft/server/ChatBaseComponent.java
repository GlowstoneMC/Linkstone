package net.minecraft.server;

import com.google.common.base.Function;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public abstract class ChatBaseComponent implements IChatBaseComponent {

    protected List<IChatBaseComponent> a = null;

    private ChatModifier b = null;

    public ChatBaseComponent() {
    }

    public IChatBaseComponent addSibling(IChatBaseComponent ichatbasecomponent) {
        return null;
    }

    public List<IChatBaseComponent> a() {
        return null;
    }

    public IChatBaseComponent a(String s) {
        return null;
    }

    public IChatBaseComponent setChatModifier(ChatModifier chatmodifier) {
        return null;
    }

    public ChatModifier getChatModifier() {
        return null;
    }

    public Iterator<IChatBaseComponent> iterator() {
        return null;
    }

    public final String toPlainText() {
        return null;
    }

    public static Iterator<IChatBaseComponent> a(Iterable<IChatBaseComponent> iterable) {
        return null;
    }

    public boolean equals(Object object) {
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return null;
    }
}
