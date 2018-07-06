package me.aki.linkstone.compiler;

import me.aki.linkstone.annotations.Mode;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Store all annotated classes, fields and methods for one version.
 */
public class MappingModel {

    private final Map<String, PackageMapping> packages = new HashMap<>();
    private final Map<String, String> classes = new HashMap<>();
    private final Map<ClassMember, String> fields = new HashMap<>();
    private final Map<ClassMember, String> methods = new HashMap<>();

    public void putPackageName(String oldName, String newName, Mode mode) {
        newName = newName.replace('.', '/');

        packages.put(oldName, new PackageMapping(newName, mode));
    }

    public void putClassName(String oldName, String newName) {
        classes.put(oldName, newName);
    }

    public void putFieldName(String className, String name, String descriptor, String newName) {
        fields.put(new ClassMember(className, name, descriptor), newName);
    }

    public void setMethodName(String className, String name, String descriptor, String newName) {
        methods.put(new ClassMember(className, name, descriptor), newName);
    }

    public String resolveClass(final String qualifiedClassName) {
        String newClassName = classes.get(qualifiedClassName);

        int lastSlashIndex = qualifiedClassName.lastIndexOf('/');
        if (lastSlashIndex < 0) {
            // class has no package
            return newClassName == null ? qualifiedClassName : newClassName;
        } else {
            String pkg = qualifiedClassName.substring(0, lastSlashIndex);
            if (newClassName == null) {
                newClassName = qualifiedClassName.substring(lastSlashIndex + 1, qualifiedClassName.length());
            }

            return resolvePackage(pkg) + "/" + newClassName;
        }
    }

    private String resolvePackage(String packagePath) {
        List<String> packageBuilder = new LinkedList<>();

        while (true) {
            int lastSlashIndex = packagePath.lastIndexOf('/');

            PackageMapping mapping = packages.get(packagePath);
            String currentPackageName =
                    mapping != null ? mapping.getName() :
                            lastSlashIndex < 0 ? packagePath :
                                    packagePath.substring(lastSlashIndex + 1, packagePath.length());

            packageBuilder.add(0, currentPackageName);

            if (mapping != null && mapping.getMode() == Mode.ABSOLUTE)break;
            if (lastSlashIndex < 0)break;

            packagePath = packagePath.substring(0, lastSlashIndex);
        }

        return packageBuilder.stream().collect(Collectors.joining("/"));
    }

    public String resolveFieldName(String className, String name, String descriptor) {
        ClassMember field = new ClassMember(className, name, descriptor);
        return fields.getOrDefault(field, field.getName());
    }

    public String resolveMethodName(String className, String name, String descriptor) {
        ClassMember method = new ClassMember(className, name, descriptor);
        return methods.getOrDefault(method, method.getName());
    }

    private static class PackageMapping {
        private final String name;
        private final Mode mode;

        public PackageMapping(String name, Mode mode) {
            this.name = name;
            this.mode = mode;
        }

        public String getName() {
            return name;
        }

        public Mode getMode() {
            return mode;
        }
    }

    /**
     * Uniquely identifies a field of method
     */
    private static class ClassMember {
        private final String className;
        private final String name;
        private final String descriptor;

        public ClassMember(String className, String name, String descriptor) {
            this.className = className;
            this.name = name;
            this.descriptor = descriptor;
        }

        public String getClassName() {
            return className;
        }

        public String getName() {
            return name;
        }

        public String getDescriptor() {
            return descriptor;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ClassMember classMember = (ClassMember) o;
            return Objects.equals(className, classMember.className) &&
                    Objects.equals(name, classMember.name) &&
                    Objects.equals(descriptor, classMember.descriptor);
        }

        @Override
        public int hashCode() {
            return Objects.hash(className, name, descriptor);
        }

        @Override
        public String toString() {
            return getClass().getSimpleName() + "{" +
                    "className='" + className + '\'' +
                    ", name='" + name + '\'' +
                    ", descriptor='" + descriptor + '\'' +
                    '}';
        }
    }
}
