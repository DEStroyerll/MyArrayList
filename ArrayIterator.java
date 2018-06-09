package MyArrayList;

import java.util.Iterator;

/**
 * The created class works instead of a loop
 * @param <T>
 */
public class ArrayIterator<T> implements Iterator<T> {

    private int index = 0;
    T[] value;

    public ArrayIterator(T[] value) {
        this.value = value;
    }

    @Override
    public boolean hasNext() {
        return index < value.length;
    }

    @Override
    public T next() {
        return value[index++];
    }
}
