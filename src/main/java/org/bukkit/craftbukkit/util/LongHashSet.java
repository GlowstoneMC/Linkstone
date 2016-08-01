/*
  Based on CompactHashSet Copyright 2011 Ontopia Project

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
*/
package org.bukkit.craftbukkit.util;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class LongHashSet {

    private static final int INITIAL_SIZE = 0;

    private static final double LOAD_FACTOR = 0.0;

    private static final long FREE = 0;

    private static final long REMOVED = 0;

    private int freeEntries = 0;

    private int elements = 0;

    private long[] values = null;

    private int modCount = 0;

    public LongHashSet() {
    }

    public LongHashSet(int size) {
    }

    public Iterator iterator() {
        return null;
    }

    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean contains(int msw, int lsw) {
        return false;
    }

    public boolean contains(long value) {
        return false;
    }

    public boolean add(int msw, int lsw) {
        return false;
    }

    public boolean add(long value) {
        return false;
    }

    public void remove(int msw, int lsw) {
    }

    public boolean remove(long value) {
        return false;
    }

    public void clear() {
    }

    public long[] toArray() {
        return null;
    }

    public long popFirst() {
        return 0;
    }

    public long[] popAll() {
        return null;
    }

    // This method copied from Murmur3, written by Austin Appleby released under Public Domain
    private int hash(long value) {
        return 0;
    }

    private void rehash() {
    }

    private void rehash(int newCapacity) {
    }

    private class Itr implements Iterator {

        private int index = 0;

        private int lastReturned = 0;

        private int expectedModCount = 0;

        public Itr() {
        }

        public boolean hasNext() {
            return false;
        }

        public Long next() {
            return null;
        }

        public void remove() {
        }
    }
}
