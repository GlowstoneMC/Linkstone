package net.minecraft.server;

public enum DataConverterTypes implements DataConverterType {

    LEVEL, PLAYER, CHUNK, BLOCK_ENTITY, ENTITY, ITEM_INSTANCE, OPTIONS;

    private DataConverterTypes() {
    }
}
