package net.minecraft.server;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.annotation.Nullable;
// CraftBukkit start
import java.util.ArrayList;
import org.bukkit.craftbukkit.command.VanillaCommandWrapper;
import com.google.common.base.Joiner;
import java.util.logging.Level;

// CraftBukkit end
public abstract class CommandBlockListenerAbstract implements ICommandListener {

    private static final SimpleDateFormat a;

    private int b;

    private boolean c;

    private IChatBaseComponent d;

    private String e;

    private String f;

    private final CommandObjectiveExecutor g;

    protected org.bukkit.command.CommandSender sender;

    // CraftBukkit - add sender
    public CommandBlockListenerAbstract() {
    }

    public int k() {
        return 0;
    }

    public void a(int i) {
    }

    public IChatBaseComponent l() {
        return null;
    }

    public NBTTagCompound a(NBTTagCompound nbttagcompound) {
        return null;
    }

    public void b(NBTTagCompound nbttagcompound) {
    }

    public boolean a(int i, String s) {
        return false;
    }

    public void setCommand(String s) {
    }

    public String getCommand() {
        return null;
    }

    public void a(World world) {
    }

    // CraftBukkit start
    public static int executeCommand(ICommandListener sender, org.bukkit.command.CommandSender bSender, String command) {
        return 0;
    }

    private static ArrayList<String[]> buildCommands(ICommandListener sender, String[] args, int pos) {
        return null;
    }

    // CraftBukkit end
    public String getName() {
        return null;
    }

    public IChatBaseComponent getScoreboardDisplayName() {
        return null;
    }

    public void setName(String s) {
    }

    public void sendMessage(IChatBaseComponent ichatbasecomponent) {
    }

    public boolean getSendCommandFeedback() {
        return false;
    }

    public void a(CommandObjectiveExecutor.EnumCommandResult commandobjectiveexecutor_enumcommandresult, int i) {
    }

    public abstract void i();

    public void b(@Nullable IChatBaseComponent ichatbasecomponent) {
    }

    public void a(boolean flag) {
    }

    public boolean n() {
        return false;
    }

    public boolean a(EntityHuman entityhuman) {
        return false;
    }

    public CommandObjectiveExecutor o() {
        return null;
    }
}
