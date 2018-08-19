package net.minecraft.server;

import net.glowstone.entity.GlowEntity;
import net.glowstone.io.entity.EntityStorage;
import net.glowstone.linkstone.annotations.LBox;
import net.glowstone.linkstone.annotations.LBoxed;
import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LField;
import net.glowstone.linkstone.annotations.LGetter;
import net.glowstone.linkstone.annotations.LMethod;
import net.glowstone.linkstone.annotations.LSetter;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LBox(GlowEntity.class)
@LClassfile(version = V1_12_R1)
public abstract class Entity {
    @LBoxed
    public final GlowEntity glow;

    @LField(version = V1_12_R1)
    public double locX;
    @LGetter(version = V1_12_R1)
    public double getLocX() {
        return glow.getLocation().getX();
    }
    @LSetter(version = V1_12_R1)
    public void setLocX(double x) {
        glow.getLocation().setX(x);
    }

    @LField(version = V1_12_R1)
    public double locY;
    @LGetter(version = V1_12_R1)
    public double getLocY() {
        return glow.getLocation().getY();
    }
    @LSetter(version = V1_12_R1)
    public void setLocY(double y) {
        glow.getLocation().setY(y);
    }

    @LField(version = V1_12_R1)
    public double locZ;
    @LGetter(version = V1_12_R1)
    public double getLocZ() {
        return glow.getLocation().getZ();
    }
    @LSetter(version = V1_12_R1)
    public void setLocZ(double z) {
        glow.getLocation().setZ(z);
    }

    protected Entity(GlowEntity glow) {
        this.glow = glow;
    }

    @LMethod(version = V1_12_R1, name = "f")
    public void loadNbtTag(NBTTagCompound tag) {
        EntityStorage.load(glow, tag.toGlowstone());
    }
}
