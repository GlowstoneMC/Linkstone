package net.minecraft.server;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
// CraftBukkit start
import org.bukkit.craftbukkit.entity.CraftEnderDragon;
import org.bukkit.event.entity.EnderDragonChangePhaseEvent;

// CraftBukkit end
public class DragonControllerManager {

    private static final Logger a;

    private final EntityEnderDragon enderDragon;

    private final IDragonController[] dragonControllers;

    private IDragonController currentDragonController;

    public DragonControllerManager(EntityEnderDragon entityenderdragon) {
    }

    public void setControllerPhase(DragonControllerPhase<?> dragoncontrollerphase) {
    }

    public IDragonController a() {
        return null;
    }

    public <T extends IDragonController> T b(DragonControllerPhase<T> dragoncontrollerphase) {
        return null;
    }
}
