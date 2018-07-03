/**
 * Reflect on the reflection api to redirect all accesses
 * of annotated fields to their getters and setters.
 *
 * This utility will only work on jvms using the module system (jvm 9 and above)
 * when the "java.base" module is opened for the linkstone-runtime module.
 */
package me.aki.linkstone.runtime.reflectionredirect;
