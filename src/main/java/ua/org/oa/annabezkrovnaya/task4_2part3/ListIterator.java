package ua.org.oa.annabezkrovnaya.task4_2part3;


import java.util.Iterator;

public interface ListIterator<E> extends Iterator<E> {

    //checks if previous element is
    public boolean hasPrevious();

    //returns previous element
    E previous();

    //replace gotten element
    void set(E e);

    //remove gotten element
    void remove();
}
