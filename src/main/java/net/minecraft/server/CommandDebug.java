package net.minecraft.server;

import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CommandDebug extends CommandAbstract {

    private static final Logger a = null;

    private long b = 0;

    private int c = 0;

    public CommandDebug() {
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

    public void execute(MinecraftServer minecraftserver, ICommandListener icommandlistener, String[] astring) throws CommandException {
    }

    private void a(long i, int j, MinecraftServer minecraftserver) {
    }

    private String b(long i, int j, MinecraftServer minecraftserver) {
        return null;
    }

    private void a(int i, String s, StringBuilder stringbuilder, MinecraftServer minecraftserver) {
    }

    private static String d() {
        return null;
    }

    public List<String> tabComplete(MinecraftServer minecraftserver, ICommandListener icommandlistener, String[] astring, @Nullable BlockPosition blockposition) {
        return null;
    }
}
