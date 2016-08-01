package net.minecraft.server;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;

public class CrashReportSystemDetails {

    private final CrashReport a = null;

    private final String b = null;

    private final List<CrashReportSystemDetails.CrashReportDetail> c = null;

    private StackTraceElement[] d = null;

    public CrashReportSystemDetails(CrashReport crashreport, String s) {
    }

    public static String a(BlockPosition blockposition) {
        return null;
    }

    public static String a(int i, int j, int k) {
        return null;
    }

    public void a(String s, CrashReportCallable<String> crashreportcallable) {
    }

    public void a(String s, Object object) {
    }

    public void a(String s, Throwable throwable) {
    }

    public int a(int i) {
        return 0;
    }

    public boolean a(StackTraceElement stacktraceelement, StackTraceElement stacktraceelement1) {
        return false;
    }

    public void b(int i) {
    }

    public void a(StringBuilder stringbuilder) {
    }

    public StackTraceElement[] a() {
        return null;
    }

    public static void a(CrashReportSystemDetails crashreportsystemdetails, final BlockPosition blockposition, final Block block, final int i) {
    }

    public static void a(CrashReportSystemDetails crashreportsystemdetails, final BlockPosition blockposition, final IBlockData iblockdata) {
    }

    static class CrashReportDetail {

        private final String a = null;

        private final String b = null;

        public CrashReportDetail(String s, Object object) {
        }

        public String a() {
            return null;
        }

        public String b() {
            return null;
        }
    }
}
