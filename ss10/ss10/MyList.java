package ss10;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private E elements[];

    public MyList() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public MyList(int size) {
        elements = (E[]) new Object[size];
    }

    private void ensureCapacity() {
        if (size == elements.length) {
            int newSize = elements.length * 2;
            elements = Arrays.copyOf(elements, newSize);
        }

    }

    public void add(E e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public E remove(int index) {
        if (index < 0 && index >= size()) {
            throw new IndexOutOfBoundsException("Error");
        } else {
            E deleteItem = elements[index];
            for (int i = index; i < elements.length; i++) {
                if (i != elements.length - 1) {
                    elements[i] = elements[i + 1];
                }
            }
            size--;
            return deleteItem;

        }
    }

    private int size() {
        return size;
    }

    public E[] clone() {
        MyList<E> clone = new MyList<>(size);
        for (int i = 0; i < size; i++) {
            clone.elements[i] = elements[i];
        }
        return clone.elements;
    }

    public boolean contains(E o) {
        for (int i = 0; i < size; i++) {
            if (o == elements[i]) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        if (o == null) {
            return -1;
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(elements[i])) {
                    return i;
                }
            }
            return -1;
        }
    }

    public boolean add(int index, E element) {
        if (index >= 0 && index <= size) {
            size += 1;
            ensureCapacity();
            for (int i = size - 1; i > index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            return true;
        }
        return false;
    }

    public void clear() {
        elements = null;
        size = 0;
    }

    public E get(int i) {
        return (E) elements[i];
    }
}
