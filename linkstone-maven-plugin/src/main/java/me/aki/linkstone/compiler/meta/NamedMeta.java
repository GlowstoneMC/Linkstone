package me.aki.linkstone.compiler.meta;

import me.aki.linkstone.annotations.Version;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

public abstract class NamedMeta implements Meta {
    private final String templateName;
    private final Map<Version, Optional<String>> mapping;

    public NamedMeta(String templateName, Map<Version, Optional<String>> mapping) {
        this.templateName = templateName;
        this.mapping = mapping;
    }

    @Override
    public Set<Version> getVersions() {
        return mapping.keySet();
    }

    @Override
    public boolean hasAnnotation() {
        return !getMapping().isEmpty();
    }

    /**
     * Get the custom name assigned for a specific version.
     *
     * @param version where the name is valid
     * @return custom name
     */
    public Optional<String> getName(Version version) {
        return mapping.getOrDefault(version, Optional.empty());
    }

    /**
     * Get the custom name assigned for a specific version or else the template name.
     *
     * @param version where the name is valid
     * @return custom name or else template name
     */
    public String getNameOrDefault(Version version) {
        return getName(version).orElse(templateName);
    }

    /**
     * @return Class/Field/Method name in the template.
     */
    public String getTemplateName() {
        return templateName;
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
