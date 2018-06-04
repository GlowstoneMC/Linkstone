package net.glowstone.linkstone.mixins;

import java.util.Set;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import net.glowstone.GlowServer;
import net.glowstone.util.library.Library;

@Mixin(GlowServer.class)
public class MixinGlowServer {
    @Overwrite
    private Set<Library> aggregateLibraries(String repository, String libraryFolder) {
        return null;
    }
}
