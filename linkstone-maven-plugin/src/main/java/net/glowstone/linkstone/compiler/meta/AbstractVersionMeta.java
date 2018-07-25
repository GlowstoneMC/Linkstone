package net.glowstone.linkstone.compiler.meta;

import net.glowstone.linkstone.annotations.LConstructor;
import net.glowstone.linkstone.annotations.LGetter;
import net.glowstone.linkstone.annotations.LSetter;
import net.glowstone.linkstone.annotations.Version;

import java.util.HashSet;
import java.util.Set;

/**
 * Superclass for metas of annotations that store only a set of versions.
 *
 * @see LConstructor
 * @see LGetter
 * @see LSetter
 */
public abstract class AbstractVersionMeta implements VersionedMeta {
    private boolean isAnnotated;
    private final Set<Version> versions;

    public AbstractVersionMeta() {
        this(new HashSet<>());
    }

    private AbstractVersionMeta(Set<Version> versions) {
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
