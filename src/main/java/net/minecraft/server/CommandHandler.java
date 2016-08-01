package net.minecraft.server;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class CommandHandler implements ICommandHandler {

    private static final Logger a;

    private final Map<String, ICommand> b;

    private final Set<ICommand> c;

    public CommandHandler() {
    }

    public int a(ICommandListener icommandlistener, String s) {
        return 0;
    }

    protected boolean a(ICommandListener icommandlistener, String[] astring, ICommand icommand, String s) {
        return false;
    }

    protected abstract MinecraftServer a();

    public ICommand a(ICommand icommand) {
        return null;
    }

    private static String[] a(String[] astring) {
        return null;
    }

    public List<String> a(ICommandListener icommandlistener, String s, @Nullable BlockPosition blockposition) {
        return null;
    }

    public List<ICommand> a(ICommandListener icommandlistener) {
        return null;
    }

    public Map<String, ICommand> getCommands() {
        return null;
    }

    private int a(ICommand icommand, String[] astring) {
        return 0;
    }
}
