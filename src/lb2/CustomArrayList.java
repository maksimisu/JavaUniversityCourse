package lb2;

import java.lang.reflect.Array;

public class CustomArrayList<E> {

    private final int DEFAULT_SIZE = 10;

    private int size = 0;

    private E[] array;

    public CustomArrayList() {
        //array = (E[]) Array.newInstance(genericClass, DEFAULT_SIZE);
        array = (E[]) new Object[DEFAULT_SIZE];
    }

    public void add(E item) {
        if (size < array.length) {
            array[size] = item;
            size++;
        }

        if (size == array.length) {
            E[] newArray = (E[]) Array.newInstance(Object.class, array.length + DEFAULT_SIZE);
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
            System.out.println("INFO: New array actual size = " + array.length);
        }
    }

    public void remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }

        if (array.length - size > DEFAULT_SIZE) {
            E[] newArray = (E[]) Array.newInstance(Object.class, array.length - DEFAULT_SIZE);
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
            System.out.println("INFO: New array actual size = " + array.length);
        }
    }

    public void remove(E item) {
        for (int i = 0; i < size; i++) {
            if (array[i] == item) {
                remove(i);
                break;
            }
        }
    }

    public boolean contains(E item) {
        for (int i = 0; i < size; i++) {
            if (array[i] == item) return true;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public E get(int index) {
        return array[index];
    }
}
