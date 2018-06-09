package MyArrayList;

import java.util.Iterator;

public class MyArrayList<T> implements Listable<T> {
    //Fields
    private T[] arrays;

    //Constructor
    public MyArrayList(T[] arrays) {

        this.arrays = (T[]) new Object[16];
    }

    @Override
    public boolean add(T t) {
        T[] array = arrays;
        arrays = (T[]) new Object[array.length + 1];
        System.arraycopy(array,0,arrays,0,array.length);
        arrays[arrays.length - 1] = t;
        return true;
    }

    @Override
    public void remove(int index) {
        T[] array = arrays;
        arrays = (T[]) new Object[array.length - 1];
        System.arraycopy(array,0,arrays,0,index);
        int amountElemAfterIndex = array.length - index - 1;
        System.arraycopy(array,index +1, arrays,index,amountElemAfterIndex);
    }

    @Override
    public T get(int index) {
        return arrays[index];
    }

    @Override
    public int size() {
        return arrays.length;
    }

    @Override
    public void update(int index, T t) {
        arrays[index] = t;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator<T>(arrays);
    }
}
