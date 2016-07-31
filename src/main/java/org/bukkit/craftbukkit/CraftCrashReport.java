package org.bukkit.craftbukkit;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Callable;
import net.minecraft.server.CrashReportCallable;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;
import net.minecraft.server.MinecraftServer;

public class CraftCrashReport implements CrashReportCallable<Object> {

    public Object call() throws Exception {
        return null;
    }
}
