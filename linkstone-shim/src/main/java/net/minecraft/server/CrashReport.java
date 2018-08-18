package net.minecraft.server;

import com.google.common.collect.Lists;
import java.io.File;
import java.util.List;

import net.glowstone.linkstone.annotations.LClassfile;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class CrashReport {
    private static final Logger a = LogManager.getLogger();
    private final String b;
    private final Throwable c;
    private final CrashReportSystemDetails d;
    private final List<CrashReportSystemDetails> e;
    private File f;
    private boolean g;
    private StackTraceElement[] h;

    public CrashReport(String s, Throwable throwable) {
        this.d = new CrashReportSystemDetails(this, "System Details");
        this.e = Lists.newArrayList();
        this.g = true;
        this.h = new StackTraceElement[0];
        this.b = s;
        this.c = throwable;
        this.h();
    }

    private void h() { // add system infomation
    }

    public String a() {
        return this.b;
    }

    public Throwable b() {
        return this.c;
    }

    public void a(StringBuilder stringbuilder) {

    }

    public String d() { // type of error?
        return "Crash Reports not implmented";
    }

    public String e() { // get content
        return "Ooops! Minecraft has crashed!\nLinkstone has not implmented CrashReports so no infomation.";
    }

    public boolean a(File file) { // save crash report to file
        return false;
    }

    public CrashReportSystemDetails g() {
        return this.d;
    }

    public CrashReportSystemDetails a(String s) {
        return this.a(s, 1);
    }

    public CrashReportSystemDetails a(String s, int i2) {
        CrashReportSystemDetails z = new CrashReportSystemDetails(this, s);
        return z;
    }

    private static String i() {
        return "Linkstone. Leakstone?";
    }

    public static CrashReport a(Throwable throwable, String s) {
        return new CrashReport(s, throwable); // TODO: reported execption
    }

}
