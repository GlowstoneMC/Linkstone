package net.minecraft.server;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import javax.annotation.Nullable;

public class IteratorUtils {

    public static <T> Iterable<T[]> a(Class<T> oclass, Iterable<? extends Iterable<? extends T>> iterable) {
        return null;
    }

    public static <T> Iterable<List<T>> a(Iterable<? extends Iterable<? extends T>> iterable) {
        return null;
    }

    private static <T> Iterable<List<T>> b(Iterable<Object[]> iterable) {
        return null;
    }

    private static <T> T[] b(Class<? super T> oclass, Iterable<? extends T> iterable) {
        return null;
    }

    private static <T> T[] b(Class<? super T> oclass, int i) {
        return null;
    }

    static class SyntheticClass_1 {
    }

    static class ClassIterable<T> implements Iterable<T[]> {

        private final Class<T> a = null;

        private final Iterable<? extends T>[] b = null;

        private ClassIterable(Class<T> oclass, Iterable<? extends T>[] aiterable) {
        }

        public Iterator<T[]> iterator() {
            return null;
        }

        ClassIterable(Class oclass, Iterable[] aiterable, IteratorUtils.SyntheticClass_1 iteratorutils_syntheticclass_1) {
        }

        static class ClassIterable$ClassIterator<T> extends UnmodifiableIterator<T[]> {

            private int a = 0;

            private final Iterable<? extends T>[] b = null;

            private final Iterator<? extends T>[] c = null;

            private final T[] d = null;

            private ClassIterable$ClassIterator(Class<T> oclass, Iterable<? extends T>[] aiterable) {
            }

            private void b() {
            }

            public boolean hasNext() {
                return false;
            }

            public T[] a() {
                return null;
            }

            public Object next() {
                return null;
            }

            ClassIterable$ClassIterator(Class oclass, Iterable[] aiterable, IteratorUtils.SyntheticClass_1 iteratorutils_syntheticclass_1) {
            }
        }
    }

    static class ArrayToList<T> implements Function<Object[], List<T>> {

        private ArrayToList() {
        }

        public List<T> a(@Nullable Object[] aobject) {
            return null;
        }

        public Object apply(Object object) {
            return null;
        }

        ArrayToList(IteratorUtils.SyntheticClass_1 iteratorutils_syntheticclass_1) {
        }
    }
}
