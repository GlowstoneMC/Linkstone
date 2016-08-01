package net.minecraft.server;

import com.google.common.collect.ComparisonChain;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MobEffect implements Comparable<MobEffect> {

    private static final Logger a = null;

    private final MobEffectList b = null;

    private int duration = 0;

    private int amplification = 0;

    private boolean splash = false;

    private boolean ambient = false;

    private boolean h = false;

    public MobEffect(MobEffectList mobeffectlist) {
    }

    public MobEffect(MobEffectList mobeffectlist, int i) {
    }

    public MobEffect(MobEffectList mobeffectlist, int i, int j) {
    }

    public MobEffect(MobEffectList mobeffectlist, int i, int j, boolean flag, boolean flag1) {
    }

    public MobEffect(MobEffect mobeffect) {
    }

    public void a(MobEffect mobeffect) {
    }

    public MobEffectList getMobEffect() {
        return null;
    }

    public int getDuration() {
        return 0;
    }

    public int getAmplifier() {
        return 0;
    }

    public boolean isAmbient() {
        return false;
    }

    public boolean isShowParticles() {
        return false;
    }

    public boolean tick(EntityLiving entityliving) {
        return false;
    }

    private int h() {
        return 0;
    }

    public void b(EntityLiving entityliving) {
    }

    public String f() {
        return null;
    }

    public String toString() {
        return null;
    }

    public boolean equals(Object object) {
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public NBTTagCompound a(NBTTagCompound nbttagcompound) {
        return null;
    }

    public static MobEffect b(NBTTagCompound nbttagcompound) {
        return null;
    }

    public int b(MobEffect mobeffect) {
        return 0;
    }

    public int compareTo(Object object) {
        return 0;
    }
}
