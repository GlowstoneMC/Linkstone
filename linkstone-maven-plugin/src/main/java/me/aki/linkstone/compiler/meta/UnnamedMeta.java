package me.aki.linkstone.compiler.meta;

import me.aki.linkstone.annotations.Version;

import java.util.HashSet;
import java.util.Set;

public abstract class UnnamedMeta implements Meta {
    private final Set<Version> versions;

    public UnnamedMeta() {
        this(new HashSet<>());
    }

    private UnnamedMeta(Set<Version> versions) {
        this.versions = versions;
    }

    public Set<Version> getVersions() {
        return versions;
    }

    @Override
    public boolean hasAnnotation() {
        return !versions.isEmpty();
    }
}
