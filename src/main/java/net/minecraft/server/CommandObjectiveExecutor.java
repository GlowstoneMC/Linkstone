package net.minecraft.server;

import javax.annotation.Nullable;

public class CommandObjectiveExecutor {

    private static final int a;

    private static final String[] b;

    private String[] c;

    private String[] d;

    public CommandObjectiveExecutor() {
    }

    public void a(MinecraftServer minecraftserver, final ICommandListener icommandlistener, CommandObjectiveExecutor.EnumCommandResult commandobjectiveexecutor_enumcommandresult, int i) {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    public void b(NBTTagCompound nbttagcompound) {
    }

    public static void a(CommandObjectiveExecutor commandobjectiveexecutor, CommandObjectiveExecutor.EnumCommandResult commandobjectiveexecutor_enumcommandresult, @Nullable String s, @Nullable String s1) {
    }

    private static void a(CommandObjectiveExecutor commandobjectiveexecutor, CommandObjectiveExecutor.EnumCommandResult commandobjectiveexecutor_enumcommandresult) {
    }

    public void a(CommandObjectiveExecutor commandobjectiveexecutor) {
    }

    public static enum EnumCommandResult {

        SUCCESS_COUNT(0, "SuccessCount"), AFFECTED_BLOCKS(1, "AffectedBlocks"), AFFECTED_ENTITIES(2, "AffectedEntities"), AFFECTED_ITEMS(3, "AffectedItems"), QUERY_RESULT(4, "QueryResult");

        final int f;

        final String g;

        private EnumCommandResult(int i, String s) {
        }

        public int a() {
            return 0;
        }

        public String b() {
            return null;
        }

        public static String[] c() {
            return null;
        }

        @Nullable
        public static CommandObjectiveExecutor.EnumCommandResult a(String s) {
            return null;
        }
    }
}
