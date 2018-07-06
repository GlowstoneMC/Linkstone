package me.aki.linkstone.compiler.meta;

import me.aki.linkstone.annotations.Version;

import java.util.Set;

public interface VersionedMeta extends Meta {
    /**
     * @return all versions where this entity exists.
     */
    Set<Version> getVersions();
}
