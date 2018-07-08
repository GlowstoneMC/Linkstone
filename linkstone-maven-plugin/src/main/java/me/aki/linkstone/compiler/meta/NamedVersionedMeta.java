package me.aki.linkstone.compiler.meta;

import me.aki.linkstone.annotations.*;
import me.aki.linkstone.annotations.LMethod;
import me.aki.linkstone.annotations.LPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

/**
 * Superclass for metas of annotations that map versions to (optional) names.
 *
 * @see LPackage
 * @see LClassfile
 * @see LField
 * @see LMethod
 */
public abstract class NamedVersionedMeta implements VersionedMeta {
    private boolean isAnnotated = false;
    private final String defaultName;
    private final Map<Version, Optional<String>> mapping;

    public NamedVersionedMeta(String defaultName) {
        this(defaultName, new HashMap<>());
    }

    private NamedVersionedMeta(String defaultName, Map<Version, Optional<String>> mapping) {
        this.defaultName = defaultName;
        this.mapping = mapping;
    }

    @Override
    public Set<Version> getVersions() {
        return mapping.keySet();
    }

    @Override
    public boolean isAnnotated() {
        return isAnnotated;
    }

    public void setAnnotated(boolean annotated) {
        isAnnotated = annotated;
    }

    /**
     * Get the name assigned to a specific version.
     *
     * @param version where the name is valid
     * @return custom name
     */
    public Optional<String> getName(Version version) {
        return mapping.getOrDefault(version, Optional.empty());
    }

    /**
     * Get the name assigned to a specific version or the default name.
     *
     * @param version where the name is valid
     * @return custom name or else template name
     */
    public String getNameOrDefault(Version version) {
        return getName(version).orElse(defaultName);
    }

    /**
     * Get the Class/Field/Method name in the template.
     *
     * @return default name.
     */
    public String getDefaultName() {
        return defaultName;
    }

    /**
     * Get a map whose keys are all versions where this class exists.
     * It maps to custom names of that method within one version
     *
     * @return mapping
     */
    public Map<Version, Optional<String>> getMapping() {
        return mapping;
    }

}
