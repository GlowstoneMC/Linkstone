package net.glowstone.linkstone.compiler.linting;

import org.objectweb.asm.Type;

import java.util.ArrayList;
import java.util.List;

public class ErrorReport {
    private final List<Error> errors = new ArrayList<>();

    public void addError(Error error) {
        errors.add(error);
    }

    public List<Error> getErrors() {
        return errors;
    }

    public static class Error {
        private final String message;
        private final ErrorLocation location;

        public Error(String message, ErrorLocation location) {
            this.message = message;
            this.location = location;
        }

        public String getMessage() {
            return message;
        }

        public ErrorLocation getLocation() {
            return location;
        }
    }

    /**
     * Describes which element caused an exception
     */
    public interface ErrorLocation {
        /**
         * @return human readable description of the error location
         */
        String toString();
    }

    public static class Package implements ErrorLocation {
        private final String packages;

        private Package(String packages) {
            this.packages = packages;
        }

        @Override
        public String toString() {
            return packages.replace('.', '/');
        }
    }

    public static class Class implements ErrorLocation {
        private final String classname;

        public Class(String classname) {
            this.classname = classname;
        }

        @Override
        public String toString() {
            return classname.replace('/', '.');
        }
    }

    public static class Field implements ErrorLocation {
        private final String classname;
        private final String name;
        private final String descriptor;

        public Field(String classname, String name, String descriptor) {
            this.classname = classname;
            this.name = name;
            this.descriptor = descriptor;
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append(Type.getType(descriptor).getClassName());
            builder.append(' ');
            builder.append(classname.replace('/', '.'));
            builder.append(".");
            builder.append(name);
            return builder.toString();
        }
    }

    public static class Method implements ErrorLocation {
        private final String classname;
        private final String name;
        private final String descriptor;

        public Method(String classname, String name, String descriptor) {
            this.classname = classname;
            this.name = name;
            this.descriptor = descriptor;
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append(classname.replace('/', '.'));
            builder.append(' ');
            builder.append(Type.getReturnType(descriptor).getClassName());
            builder.append(' ');
            builder.append(name);
            builder.append('(');

            Type[] argumentTypes = Type.getArgumentTypes(descriptor);
            for (int i = 0; i < argumentTypes.length; i++) {
                builder.append(argumentTypes[i].getClassName());
                if (i < argumentTypes.length - 1) {
                    builder.append(", ");
                }
            }

            builder.append(')');
            return builder.toString();
        }
    }
}
