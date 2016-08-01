package net.minecraft.server;

import java.util.Collection;
import java.util.Iterator;
import java.util.UUID;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GenericAttributes {

    private static final Logger j;

    public static final IAttribute maxHealth;

    public static final IAttribute FOLLOW_RANGE;

    public static final IAttribute c;

    public static final IAttribute MOVEMENT_SPEED;

    public static final IAttribute ATTACK_DAMAGE;

    public static final IAttribute f;

    public static final IAttribute g;

    public static final IAttribute h;

    public static final IAttribute i;

    public static NBTTagList a(AttributeMapBase attributemapbase) {
        return null;
    }

    private static NBTTagCompound a(AttributeInstance attributeinstance) {
        return null;
    }

    public static NBTTagCompound a(AttributeModifier attributemodifier) {
        return null;
    }

    public static void a(AttributeMapBase attributemapbase, NBTTagList nbttaglist) {
    }

    private static void a(AttributeInstance attributeinstance, NBTTagCompound nbttagcompound) {
    }

    @Nullable
    public static AttributeModifier a(NBTTagCompound nbttagcompound) {
        return null;
    }
}
