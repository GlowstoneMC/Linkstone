package net.minecraft.server;

import com.google.common.base.Functions;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.primitives.Doubles;
import com.google.gson.JsonParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.apache.commons.lang3.exception.ExceptionUtils;

public abstract class CommandAbstract implements ICommand {

    private static ICommandDispatcher a = null;

    public CommandAbstract() {
    }

    protected static ExceptionInvalidSyntax a(JsonParseException jsonparseexception) {
        return null;
    }

    protected static NBTTagCompound a(Entity entity) {
        return null;
    }

    public int a() {
        return 0;
    }

    public List<String> b() {
        return null;
    }

    public boolean canUse(MinecraftServer minecraftserver, ICommandListener icommandlistener) {
        return false;
    }

    public List<String> tabComplete(MinecraftServer minecraftserver, ICommandListener icommandlistener, String[] astring, @Nullable BlockPosition blockposition) {
        return null;
    }

    public static int a(String s) throws ExceptionInvalidNumber {
        return 0;
    }

    public static int a(String s, int i) throws ExceptionInvalidNumber {
        return 0;
    }

    public static int a(String s, int i, int j) throws ExceptionInvalidNumber {
        return 0;
    }

    public static long b(String s) throws ExceptionInvalidNumber {
        return 0;
    }

    public static long a(String s, long i, long j) throws ExceptionInvalidNumber {
        return 0;
    }

    public static BlockPosition a(ICommandListener icommandlistener, String[] astring, int i, boolean flag) throws ExceptionInvalidNumber {
        return null;
    }

    public static double c(String s) throws ExceptionInvalidNumber {
        return 0.0;
    }

    public static double a(String s, double d0) throws ExceptionInvalidNumber {
        return 0.0;
    }

    public static double a(String s, double d0, double d1) throws ExceptionInvalidNumber {
        return 0.0;
    }

    public static boolean d(String s) throws CommandException {
        return false;
    }

    public static EntityPlayer a(ICommandListener icommandlistener) throws ExceptionPlayerNotFound {
        return null;
    }

    public static EntityPlayer a(MinecraftServer minecraftserver, ICommandListener icommandlistener, String s) throws ExceptionPlayerNotFound {
        return null;
    }

    public static Entity b(MinecraftServer minecraftserver, ICommandListener icommandlistener, String s) throws ExceptionEntityNotFound {
        return null;
    }

    public static <T extends Entity> T a(MinecraftServer minecraftserver, ICommandListener icommandlistener, String s, Class<? extends T> oclass) throws ExceptionEntityNotFound {
        return null;
    }

    public static List<Entity> c(MinecraftServer minecraftserver, ICommandListener icommandlistener, String s) throws ExceptionEntityNotFound {
        return null;
    }

    public static String d(MinecraftServer minecraftserver, ICommandListener icommandlistener, String s) throws ExceptionPlayerNotFound {
        return null;
    }

    public static String e(MinecraftServer minecraftserver, ICommandListener icommandlistener, String s) throws ExceptionEntityNotFound {
        return null;
    }

    public static IChatBaseComponent a(ICommandListener icommandlistener, String[] astring, int i) throws ExceptionPlayerNotFound {
        return null;
    }

    public static IChatBaseComponent b(ICommandListener icommandlistener, String[] astring, int i, boolean flag) throws ExceptionPlayerNotFound {
        return null;
    }

    public static String a(String[] astring, int i) {
        return null;
    }

    public static CommandAbstract.CommandNumber a(double d0, String s, boolean flag) throws ExceptionInvalidNumber {
        return null;
    }

    public static CommandAbstract.CommandNumber a(double d0, String s, int i, int j, boolean flag) throws ExceptionInvalidNumber {
        return null;
    }

    public static double b(double d0, String s, boolean flag) throws ExceptionInvalidNumber {
        return 0.0;
    }

    public static double b(double d0, String s, int i, int j, boolean flag) throws ExceptionInvalidNumber {
        return 0.0;
    }

    public static Item a(ICommandListener icommandlistener, String s) throws ExceptionInvalidNumber {
        return null;
    }

    public static Block b(ICommandListener icommandlistener, String s) throws ExceptionInvalidNumber {
        return null;
    }

    public static String a(Object[] aobject) {
        return null;
    }

    public static IChatBaseComponent a(List<IChatBaseComponent> list) {
        return null;
    }

    public static String a(Collection<String> collection) {
        return null;
    }

    public static List<String> a(String[] astring, int i, @Nullable BlockPosition blockposition) {
        return null;
    }

    @Nullable
    public static List<String> b(String[] astring, int i, @Nullable BlockPosition blockposition) {
        return null;
    }

    public static boolean a(String s, String s1) {
        return false;
    }

    public static List<String> a(String[] astring, String... astring1) {
        return null;
    }

    public static List<String> a(String[] astring, Collection<?> collection) {
        return null;
    }

    public boolean isListStart(String[] astring, int i) {
        return false;
    }

    public static void a(ICommandListener icommandlistener, ICommand icommand, String s, Object... aobject) {
    }

    public static void a(ICommandListener icommandlistener, ICommand icommand, int i, String s, Object... aobject) {
    }

    public static void a(ICommandDispatcher icommanddispatcher) {
    }

    public int a(ICommand icommand) {
        return 0;
    }

    public int compareTo(Object object) {
        return 0;
    }

    public static class CommandNumber {

        private final double a = 0.0;

        private final double b = 0.0;

        private final boolean c = false;

        protected CommandNumber(double d0, double d1, boolean flag) {
        }

        public double a() {
            return 0.0;
        }

        public double b() {
            return 0.0;
        }

        public boolean c() {
            return false;
        }
    }
}
