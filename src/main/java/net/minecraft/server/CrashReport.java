package net.minecraft.server;

import com.google.common.collect.Lists;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CrashReport {

    private static final Logger a;

    private final String b;

    private final Throwable c;

    private final CrashReportSystemDetails d;

    private final List<CrashReportSystemDetails> e;

    private File f;

    private boolean g;

    private StackTraceElement[] h;

    public CrashReport(String s, Throwable throwable) {
    }

    private void h() {
    }

    public String a() {
        return null;
    }

    public Throwable b() {
        return null;
    }

    public void a(StringBuilder stringbuilder) {
    }

    public String d() {
        return null;
    }

    public String e() {
        return null;
    }

    public boolean a(File file) {
        return false;
    }

    public CrashReportSystemDetails g() {
        return null;
    }

    public CrashReportSystemDetails a(String s) {
        return null;
    }

    public CrashReportSystemDetails a(String s, int i) {
        return null;
    }

    private static String i() {
        return null;
    }

    public static CrashReport a(Throwable throwable, String s) {
        return null;
    }
}
