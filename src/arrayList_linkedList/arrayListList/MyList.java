package arrayList_linkedList.arrayListList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY =10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(int index, E element) {
        if (size > elements.length) {
            ensureCapacity();
        }
        if (index >= elements.length || index < 0) {
            System.out.println("index: " + index + ", size: " + elements.length);
        } else {
            for (int i = size - 1; i >= index; i--) {
                elements[i + 1] = elements[i];
            }
                elements[index] = element;
                size++;
        }
    }

    public Object remove(int index) {
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return elements[index];
    }

    public int size() {
        return this.size;
    }

    public MyList clone() {
        MyList<E> clone = new MyList<E>(elements.length);
        for (E e : (E[]) elements) {
            clone.add(e);
        }
        return clone;
    }

    public boolean contains(E e) {
        for (Object element : elements) {
            if (element == e) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E e) {
        int indexOf = -1;
        for (int i = 0; i < size; i++) {
            if (elements[i] == e) {
                indexOf = i;
            }
        }
        return indexOf;
    }

    public boolean add(E element) {
        if (size == elements.length) {
            return false;
        }
        elements[size] = element;
        size++;
        return true;
    }

    public E get(int i) {
        if (i > size || i < 0) {
            System.out.println("Index invalid!");
        }
        return (E) elements[i];
    }

    public void clear() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
