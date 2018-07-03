package me.aki.linkstone.compiler.meta;

import me.aki.linkstone.annotations.Version;

import java.util.Set;

/**
 * Runtime model for the linkstone annotations.
 */
public interface Meta {
    /**
     * @return all versions where this entity exists.
     */
    Set<Version> getVersions();

    /**
     * @return was the entity annotated
     */
    boolean hasAnnotation();
}
