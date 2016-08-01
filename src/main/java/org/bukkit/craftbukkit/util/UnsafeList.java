package org.bukkit.craftbukkit.util;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

// implementation of an ArrayList that offers a getter without range checks
@SuppressWarnings("unchecked")
public class UnsafeList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable {

    private static final long serialVersionUID;

    private transient Object[] data;

    private int size;

    private int initialCapacity;

    private Iterator[] iterPool;

    private int maxPool;

    private int poolCounter;

    public UnsafeList(int capacity, int maxIterPool) {
    }

    public UnsafeList(int capacity) {
    }

    public UnsafeList() {
    }

    public E get(int index) {
        return null;
    }

    public E unsafeGet(int index) {
        return null;
    }

    public E set(int index, E element) {
        return null;
    }

    public boolean add(E element) {
        return false;
    }

    public void add(int index, E element) {
    }

    public E remove(int index) {
        return null;
    }

    public boolean remove(Object o) {
        return false;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public boolean contains(Object o) {
        return false;
    }

    public void clear() {
    }

    // actually rounds up to nearest power of two
    public void trimToSize() {
    }

    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public Object clone() throws CloneNotSupportedException {
        return null;
    }

    public Iterator<E> iterator() {
        return null;
    }

    private void rangeCheck(int index) {
    }

    private void growIfNeeded() {
    }

    private void writeObject(ObjectOutputStream os) throws IOException {
    }

    private void readObject(ObjectInputStream is) throws IOException, ClassNotFoundException {
    }

    public class Itr implements Iterator<E> {

        int index;

        int lastRet;

        int expectedModCount;

        public boolean valid;

        public void reset() {
        }

        public boolean hasNext() {
            return false;
        }

        public E next() {
            return null;
        }

        public void remove() {
        }
    }
}
