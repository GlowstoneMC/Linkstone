package org.bukkit.craftbukkit.util;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.apache.commons.lang.Validate;

public final class WeakCollection<T> implements Collection<T> {

    static final Object NO_VALUE = null;

    private final Collection<WeakReference<T>> collection = null;

    public WeakCollection() {
    }

    public boolean add(T value) {
        return false;
    }

    public boolean addAll(Collection<? extends T> collection) {
        return false;
    }

    public void clear() {
    }

    public boolean contains(Object object) {
        return false;
    }

    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    public boolean isEmpty() {
        return false;
    }

    public Iterator<T> iterator() {
        return null;
    }

    public boolean remove(Object object) {
        return false;
    }

    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    public int size() {
        return 0;
    }

    public Object[] toArray() {
        return null;
    }

    public <T> T[] toArray(T[] array) {
        return null;
    }

    private Collection<T> toCollection() {
        return null;
    }
}
