package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class ReportedException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private final CrashReport a;

    public ReportedException(CrashReport crashReport) {
        this.a = crashReport;
    }

    public CrashReport a() {
        return a;
    }

    @Override
    public Throwable getCause() {
        return a.b();
    }

    @Override
    public String getMessage() {
        return a.a();
    }

}