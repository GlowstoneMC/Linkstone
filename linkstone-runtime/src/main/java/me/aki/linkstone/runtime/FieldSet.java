package me.aki.linkstone.runtime;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class FieldSet {
    private final Set<FieldDescriptor> fields = new HashSet<>();

    public boolean contains(String classname, String name, String descriptor) {
        FieldDescriptor fieldDescriptor = new FieldDescriptor(classname, name, descriptor);
        return fields.contains(fieldDescriptor);
    }

    public boolean remove(String classname, String name, String descriptor) {
        FieldDescriptor fieldDescriptor = new FieldDescriptor(classname, name, descriptor);
        return fields.remove(fieldDescriptor);
    }

    public boolean add(String classname, String name, String descriptor) {
        FieldDescriptor fieldDescriptor = new FieldDescriptor(classname, name, descriptor);
        return fields.add(fieldDescriptor);
    }

    private class FieldDescriptor {
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
