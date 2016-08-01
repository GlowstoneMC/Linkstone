package net.minecraft.server;

import java.util.UUID;
import javax.annotation.Nullable;

public interface EntityOwnable {

    @Nullable
    UUID getOwnerUUID() {
        return null;
    }

    @Nullable
    Entity getOwner() {
        return null;
    }
}
