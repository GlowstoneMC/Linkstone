package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LField;
import net.glowstone.linkstone.annotations.LGenerate;
import net.glowstone.linkstone.annotations.LMethod;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class MojangStatisticsGenerator {
    @LField(version = V1_12_R1, name = "e")
    private final IMojangStatistics iMojangStatistics;

    @LGenerate
    @LField(version = V1_12_R1, name = "h")
    private final long startTime;

    //TODO @Isaiah Deobfuscate and Annotated Method
    private boolean i;

    public MojangStatisticsGenerator(String string, IMojangStatistics iMojangStatistics, long startTime) {
        this.iMojangStatistics = iMojangStatistics;
        this.startTime = startTime;
    }

    //TODO @Isaiah Deobfuscate and Annotated Method
    public void a() {
    }

    //TODO @Isaiah Deobfuscate and Annotated Method
    private void h() {
    }

    //TODO @Isaiah Deobfuscate and Annotated Method
    private void i() {
    }

    //TODO @Isaiah Deobfuscate and Annotated Method
    public void b() {
    }

    //TODO @Isaiah Deobfuscate and Annotated Method
    public void a(String string, Object object) {
    }

    //TODO @Isaiah Deobfuscate and Annotated Method
    public void b(String string, Object object) {
    }

    //TODO @Isaiah Deobfuscate and Annotated Method
    public boolean d() {
        return this.i;
    }

    //TODO @Isaiah Deobfuscate and Annotated Method
    public void e() {
    }

    @LMethod(version = V1_12_R1, name = "g")
    public long getStartTime() {
        return this.startTime;
    }
}