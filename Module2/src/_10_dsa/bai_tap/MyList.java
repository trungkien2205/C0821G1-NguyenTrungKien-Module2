package _10_dsa.bai_tap;

import java.util.Arrays;

public class MyList <E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {

    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(int index, E element) {
        rangeCheckForAdd(index);
        if (size == elements.length) {
            ensureCapa();
            moveIndexForAdd(index);
        } else {
            moveIndexForAdd(index);
            elements[index] = element;
        }
    }

    private void moveIndexForAdd(int index) {
        for (int i = size; i > index + 1; i--) {
            elements[i] = elements[i - 1];
        }
    }

    private void rangeCheckForAdd(int index) {
        if (index >= size || index < 0) {
            System.out.println("Index: " + index + ", Size: " + size);
        }
    }
    private void rangeCheck(int index){
        if(index >= size){
            System.out.println("Index: " + index + ", Size: " + size);
        }
    }

    public void remove(int index){
        rangeCheck(index);
        moveIndexForRemove(index);
        elements[--size]=null;
    }

    private void moveIndexForRemove(int index) {
        for(int i=index;i<size;i++){
            elements[index]=elements[index+1];
        }
    }
    public int size(){
        return size;
    }
    public int indexOf(Object o){
        if (o == null) {
            for (int i = 0; i < size; i++)
                if (elements[i]==null)
                    return i;
        } else {
            for (int i = 0; i < size; i++)
                if (o.equals(elements[i]))
                    return i;
        }
        return -1;
    }
    public boolean add(E e){
        if(size==elements.length){
            ensureCapa();
        }else{
            elements[size]=e;
        }
        return true;
    }
    public boolean contains(E o){
        return indexOf(o)>=0;
    }
    public E get(int i){
        rangeCheck(i);
        return (E) elements[i];
    }
    public void clear(){
        for(int i=0;i<size;i++){
            elements[i]=null;
        }
        size=0;
    }


}