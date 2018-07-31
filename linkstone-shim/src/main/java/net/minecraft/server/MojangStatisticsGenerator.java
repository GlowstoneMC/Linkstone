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

    private boolean i;

    public MojangStatisticsGenerator(String string, IMojangStatistics iMojangStatistics, long startTime) {
        this.iMojangStatistics = iMojangStatistics;
        this.startTime = startTime;
    }

    public void a() {
    }

    private void h() {
    }

    private void i() {
    }

    public void b() {
    }

    public void a(String string, Object object) {
    }

    public void b(String string, Object object) {
    }

    public boolean d() {
        return this.i;
    }

    public void e() {
    }

    @LMethod(version = V1_12_R1, name = "g")
    public long getStartTime() {
        return this.startTime;
    }
}