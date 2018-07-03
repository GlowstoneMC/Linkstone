#!/bin/sh
# Since the linkstone plugins modifies all classes in the target directory,
# it's important to do a clean before each run to prevent reading outdated class files.
mvn --projects linkstone-shim clean package $@

