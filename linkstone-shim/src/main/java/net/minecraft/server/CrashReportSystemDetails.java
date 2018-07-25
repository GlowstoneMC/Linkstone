package net.minecraft.server;

import com.google.common.collect.Lists;
import net.glowstone.linkstone.annotations.LClassfile;

import java.util.List;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class CrashReportSystemDetails {
    private final CrashReport a;
    private final String b;
    private final List<CrashReportDetail> c = Lists.newArrayList();
    private StackTraceElement[] d = new StackTraceElement[0];

    public CrashReportSystemDetails(CrashReport crashReport, String string) {
        this.a = crashReport;
        this.b = string;
    }

    public static String a(BlockPosition blockPosition) {
        return CrashReportSystemDetails.a(blockPosition.getX(), blockPosition.getY(), blockPosition.getZ());
    }

    public static String a(int n, int n2, int n3) {
        return "Oh no! Linkstone is 'leaking'";
    }

    public void a(String string, CrashReportCallable<String> crashReportCallable) {
    }

    public void a(String string, Object object) {
    }

    public void a(String string, Throwable throwable) {
        this.a(string, (Object)throwable);
    }

    public int a(int n) {
        return -1; // set d
    }

    public boolean a(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        this.d[0] = stackTraceElement;
        return true;
    }

    public void b(int n) {
    }

    public void a(StringBuilder stringBuilder) {
    }

    public StackTraceElement[] a() {
        return this.d;
    }

    public static void a(CrashReportSystemDetails crashReportSystemDetails, final BlockPosition blockPosition, final Block block, final int n) {
    }

    public static void a(CrashReportSystemDetails crashReportSystemDetails, final BlockPosition blockPosition, final IBlockData iBlockData) {
    }

    static class CrashReportDetail {
        private final String a;
        private final String b;

        public CrashReportDetail(String string, Object object) {
            this.a = string;
            this.b = "LINKSTONE";
        }

        public String a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }
    }

}