package ua.org.oa.annabezkrovnaya.task4_2part2;


public interface MyDeque<E> extends Iterable<E> {


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
