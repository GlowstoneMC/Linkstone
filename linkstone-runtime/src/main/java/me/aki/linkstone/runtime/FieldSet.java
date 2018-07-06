package me.aki.linkstone.runtime;

import java.util.*;

public class FieldSet {
    private final Set<FieldDescriptor> fields = new HashSet<>();
    private final Map<String, Set<FieldDescriptor>> fieldsByClass = new HashMap<>();

    public boolean contains(String classname, String name, String descriptor) {
        FieldDescriptor fieldDescriptor = new FieldDescriptor(classname, name, descriptor);
        return fields.contains(fieldDescriptor);
    }

    public boolean remove(String classname, String name, String descriptor) {
        FieldDescriptor fieldDescriptor = new FieldDescriptor(classname, name, descriptor);
        boolean wasRemoved = fields.remove(fieldDescriptor);
        if (wasRemoved) {
            fieldsByClass.get(classname).remove(fieldDescriptor);
        }
        return wasRemoved;
    }

    public boolean add(String classname, String name, String descriptor) {
        FieldDescriptor fieldDescriptor = new FieldDescriptor(classname, name, descriptor);

        fieldsByClass.computeIfAbsent(classname, x -> new HashSet<>()).add(fieldDescriptor);
        return fields.add(fieldDescriptor);
    }

    public Set<FieldDescriptor> get(String className) {
        Set<FieldDescriptor> set = fieldsByClass.get(className);
        return set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
    }

    public class FieldDescriptor {
        private final String classname;
        private final String name;
        private final String descriptor;

        public FieldDescriptor(String classname, String name, String descriptor) {
            this.classname = classname;
            this.name = name;
            this.descriptor = descriptor;
        }

        public String getClassname() {
            return classname;
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
            FieldDescriptor that = (FieldDescriptor) o;
            return Objects.equals(classname, that.classname) &&
                    Objects.equals(name, that.name) &&
                    Objects.equals(descriptor, that.descriptor);
        }

        @Override
        public int hashCode() {
            return Objects.hash(classname, name, descriptor);
        }

        @Override
        public String toString() {
            return getClass().getSimpleName() + "{" +
                    "classname='" + classname + '\'' +
                    ", name='" + name + '\'' +
                    ", descriptor='" + descriptor + '\'' +
                    '}';
        }
    }
}
