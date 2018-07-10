package net.glowstone.linkstone.compiler.meta;

import net.glowstone.linkstone.annotations.Version;

import java.util.Set;

public interface VersionedMeta extends Meta {
    /**
     * @return all versions where this entity exists.
     */
    Set<Version> getVersions();
}
