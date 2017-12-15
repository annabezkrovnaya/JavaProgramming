package ua.org.oa.annabezkrovnaya.task4_2part1;


import lombok.Getter;
import lombok.Setter;

public interface MyDeque<E> {


    void addFirst(E e);

    void addLast(E e);

    E removeFirst();

    E removeLast();

    E getFirst();

    E getLast();

    boolean contains(Object o);

    void clear();

    Object[] toArray();

    int size();

    boolean containsAll(MyDeque<? extends E> deque);

}
