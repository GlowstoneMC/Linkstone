package net.minecraft.server;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChatMessage extends ChatBaseComponent {

    private final String d;

    private final Object[] e;

    private final Object f;

    private long g;

    @VisibleForTesting
    List<IChatBaseComponent> b;

    public static final Pattern c;

    public ChatMessage(String s, Object... aobject) {
    }

    @VisibleForTesting
    synchronized void g() {
    }

    protected void b(String s) {
    }

    private IChatBaseComponent a(int i) {
        return null;
    }

    public IChatBaseComponent setChatModifier(ChatModifier chatmodifier) {
        return null;
    }

    public Iterator<IChatBaseComponent> iterator() {
        return null;
    }

    public String getText() {
        return null;
    }

    public ChatMessage h() {
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

    public String i() {
        return null;
    }

    public Object[] j() {
        return null;
    }

    public IChatBaseComponent f() {
        return null;
    }
}
