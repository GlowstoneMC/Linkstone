package net.minecraft.server;

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