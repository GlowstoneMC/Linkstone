package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LEnum;
import net.glowstone.linkstone.annotations.LMethod;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public enum EnumParticle {
    @LEnum(version = V1_12_R1)
    EXPLOSION_NORMAL("explode"),

    @LEnum(version = V1_12_R1)
    EXPLOSION_LARGE("largeexplode"),

    @LEnum(version = V1_12_R1)
    EXPLOSION_HUGE("hugeexplosion"),

    @LEnum(version = V1_12_R1)
    FIREWORKS_SPARK("fireworksSpark"),

    @LEnum(version = V1_12_R1)
    WATER_BUBBLE("bubble"),

    @LEnum(version = V1_12_R1)
    WATER_SPLASH("splash"),

    @LEnum(version = V1_12_R1)
    WATER_WAKE("wake"),

    @LEnum(version = V1_12_R1)
    SUSPENDED("suspended"),

    @LEnum(version = V1_12_R1)
    SUSPENDED_DEPTH("depthsuspend"),

    @LEnum(version = V1_12_R1)
    CRIT("crit"),

    @LEnum(version = V1_12_R1)
    CRIT_MAGIC("magicCrit"),

    @LEnum(version = V1_12_R1)
    SMOKE_NORMAL("smoke"),

    @LEnum(version = V1_12_R1)
    SMOKE_LARGE("largesmoke"),

    @LEnum(version = V1_12_R1)
    SPELL("spell"),

    @LEnum(version = V1_12_R1)
    SPELL_INSTANT("instantSpell"),

    @LEnum(version = V1_12_R1)
    SPELL_MOB("mobSpell"),

    @LEnum(version = V1_12_R1)
    SPELL_MOB_AMBIENT("mobSpellAmbient"),

    @LEnum(version = V1_12_R1)
    SPELL_WITCH("witchMagic"),

    @LEnum(version = V1_12_R1)
    DRIP_WATER("dripWater"),

    @LEnum(version = V1_12_R1)
    DRIP_LAVA("dripLava"),

    @LEnum(version = V1_12_R1)
    VILLAGER_ANGRY("angryVillager"),

    @LEnum(version = V1_12_R1)
    VILLAGER_HAPPY("happyVillager"),

    @LEnum(version = V1_12_R1)
    TOWN_AURA("townaura"),

    @LEnum(version = V1_12_R1)
    NOTE("note"),

    @LEnum(version = V1_12_R1)
    PORTAL("portal"),

    @LEnum(version = V1_12_R1)
    ENCHANTMENT_TABLE("enchantmenttable"),

    @LEnum(version = V1_12_R1)
    FLAME("flame"),

    @LEnum(version = V1_12_R1)
    LAVA("lava"),

    @LEnum(version = V1_12_R1)
    FOOTSTEP("footstep"),

    @LEnum(version = V1_12_R1)
    CLOUD("cloud"),

    @LEnum(version = V1_12_R1)
    REDSTONE("reddust"),

    @LEnum(version = V1_12_R1)
    SNOWBALL("snowballpoof"),

    @LEnum(version = V1_12_R1)
    SNOW_SHOVEL("snowshovel"),

    @LEnum(version = V1_12_R1)
    SLIME("slime"),

    @LEnum(version = V1_12_R1)
    HEART("heart"),

    @LEnum(version = V1_12_R1)
    BARRIER("barrier"),

    @LEnum(version = V1_12_R1)
    ITEM_CRACK("iconcrack"),

    @LEnum(version = V1_12_R1)
    BLOCK_CRACK("blockcrack"),

    @LEnum(version = V1_12_R1)
    BLOCK_DUST("blockdust"),

    @LEnum(version = V1_12_R1)
    WATER_DROP("droplet"),

    @LEnum(version = V1_12_R1)
    ITEM_TAKE("take"),

    @LEnum(version = V1_12_R1)
    MOB_APPEARANCE("mobappearance"),

    @LEnum(version = V1_12_R1)
    DRAGON_BREATH("dragonbreath"),

    @LEnum(version = V1_12_R1)
    END_ROD("endRod"),

    @LEnum(version = V1_12_R1)
    DAMAGE_INDICATOR("damageIndicator"),

    @LEnum(version = V1_12_R1)
    SWEEP_ATTACK("sweepAttack"),

    @LEnum(version = V1_12_R1)
    FALLING_DUST("fallingdust"),

    @LEnum(version = V1_12_R1)
    TOTEM("totem"),

    @LEnum(version = V1_12_R1)
    SPIT("spit");

    private final String name;

    EnumParticle(String name) {
        this.name = name;
    }

    @LMethod(version = V1_12_R1, name = "c")
    public int getId() {
        return ordinal();
    }

    @LMethod(version = V1_12_R1, name = "b")
    public String getName() {
        return name;
    }
}
