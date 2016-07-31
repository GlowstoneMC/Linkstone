package net.minecraft.server;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
// CraftBukkit start
import org.bukkit.craftbukkit.command.ProxiedNativeCommandSender;
import org.bukkit.craftbukkit.command.VanillaCommandWrapper;

// CraftBukkit end
public class CommandExecute extends CommandAbstract {

    public CommandExecute() {
    }

    public String getCommand() {
        return null;
    }

    public int a() {
        return 0;
    }

    public String getUsage(ICommandListener icommandlistener) {
        return null;
    }

    public void execute(final MinecraftServer minecraftserver, final ICommandListener icommandlistener, String[] astring) throws CommandException {
    }

    public List<String> tabComplete(MinecraftServer minecraftserver, ICommandListener icommandlistener, String[] astring, @Nullable BlockPosition blockposition) {
        return null;
    }

    public boolean isListStart(String[] astring, int i) {
        return false;
    }

    // CraftBukkit start - fix decompiler error
    @Override
    public int compareTo(ICommand o) {
        return 0;
    }
    // CraftBukkit end
}
