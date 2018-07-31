package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LConstructor;
import net.glowstone.linkstone.annotations.LField;
import net.glowstone.linkstone.annotations.LGenerate;
import net.glowstone.linkstone.annotations.LMethod;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class ReportedException extends RuntimeException {
    @LGenerate
    @LField(version = V1_12_R1, name = "a")
    private final CrashReport crashReport;

    @LConstructor(version = V1_12_R1)
    public ReportedException(CrashReport crashReport) {
        this.crashReport = crashReport;
    }

    @LMethod(version = V1_12_R1, name = "a")
    public CrashReport getCrashReport() {
        return crashReport;
    }

    @Override
    @LMethod(version = V1_12_R1)
    public Throwable getCause() {
        return crashReport.b();
    }

    @Override
    @LMethod(version = V1_12_R1)
    public String getMessage() {
        return crashReport.a();
    }
}
