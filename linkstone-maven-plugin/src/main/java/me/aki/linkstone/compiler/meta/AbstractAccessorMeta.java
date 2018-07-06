package me.aki.linkstone.compiler.meta;

import me.aki.linkstone.annotations.Getter;
import me.aki.linkstone.annotations.Setter;
import me.aki.linkstone.annotations.Version;

import java.util.HashSet;
import java.util.Set;

/**
 * Superclass for accessor annotation metas.
 *
 * They have in common that they represent a set of versions.
 *
 * @see Getter
 * @see Setter
 */
public abstract class AbstractAccessorMeta implements VersionedMeta {
    private boolean isAnnotated;
    private final Set<Version> versions;

    public AbstractAccessorMeta() {
        this(new HashSet<>());
    }

    private AbstractAccessorMeta(Set<Version> versions) {
        this.versions = versions;
    }

    public Set<Version> getVersions() {
        return versions;
    }

    @Override
    public boolean isAnnotated() {
        return isAnnotated;
    }

    public void setAnnotated(boolean annotated) {
        isAnnotated = annotated;
    }
}
