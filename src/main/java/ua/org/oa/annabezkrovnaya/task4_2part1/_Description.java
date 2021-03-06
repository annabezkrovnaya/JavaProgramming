package ua.org.oa.annabezkrovnaya.task4_2part1;


public interface _Description {

    /*
   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    Task 4.2
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    Замечания:
    1. Корневой пакет для всех классов: ua.org.oa.<JIRALOGIN>.task4_2part1
    2. Задание состоит из нескольких частей, каждая часть независима от других; код, который относится к одной части должен
    располагаться в отдельном пакете.
    3. Каждый тип класть в отдельный файл.
    4. Целесообразно ознакомится с содержимым класса java.util.LinkedList
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    Задание:
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    Часть №1 (пакет ua.org.oa.<JIRALOGIN>.task4_2part1.part1)
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ***1.1. Создать generic интерфейс MyDeque (двусвязный список) следующего содержания:
    public interface MyDeque<E> {
    // добавить элемент в начало списка
    void addFirst(E e);
    // добавить элемент в конец списка
    void addLast(E e);
    // получить элемент из начала списка и удалить его
    E removeFirst();
    // получить элемент из конца списка и удалить его
    E removeLast();
    // получить элемент из начала списка, не удаляя его
    E getFirst();
    // получить элемент из конца списка, не удаляя его
    E getLast();
    // проверить, содержится ли объект o в списке (с помощью equals)
    boolean contains(Object o);
    // очистить список
    void clear();
    // вернуть массив элементов из списка(сохраняя упорядоченность элементов списка)
    Object[] toArray();
    // вернуть количество элементов в списке
    int size();
    // проверить, содержит ли список все элементы списка deque
    boolean containsAll(MyDeque<? extends E> deque);
    }
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ***1.2. Создать generic класс контейнер MyDequeImpl, который реализует MyDeque (реализовать все методы интерфейса).
    public class MyDequeImpl<E> implements MyDeque<E>
    {...}
    Замечание: для реализации списка написать вложенный класс Node<E> следующего вида:
    private static class Node<E> {
    // хранимый элемент
    E element;
    // ссылка на следующий элемент списка
    Node<E> next;
    // ссылка на предыдущий элемент списка
    Node<E> prev;
    Node(E element, Node<E> prev, Node<E> next) {...}
    }
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    1.3. Переопределить метод toString таким образом, чтобы результат выводился в виде:
    {результат вызова toString для элемента 1, результат вызова toString для элемента 2, ... }
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    1.4. Создать класс Demo, который демонстрирует работу всех методов контейнера.
    Например, так:
    public class Demo {
    public static void main(String[] args) {
    MyDeque<Number> deque = new MyDequeImpl<Number>();
    deque.addFirst(433);
    deque.addLast(8.88);
    // демонстрация всех методов MyDeque
    System.out.println("list contains 433 --> " + deque.contains(433));
    // ...}
    }
     */
}
