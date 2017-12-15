package ua.org.oa.annabezkrovnaya.task4_2part2;

public @interface _Description {

    /*
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    Часть №2 (пакет ua.org.oa.<JIRALOGIN>.task4_2part1.part2)
    Скопировать созданные в части №1 типы в пакет part2 (изменив декларацию пакета вверху каждого типа).
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ***2.1. Добавить к интерфейсу MyDeque<E> наследование интерфейса Iterable<E> (java.lang.Iterable).
    public interface MyDeque<E> extends Iterable<E>
    {...}
    Добавить в класс MyDequeImpl<E> метод, который реализует метод Iterable iterator:
    public Iterator<E> iterator() { return new IteratorImpl(); }
    метод должен возвращает объект внутреннего класса IteratorImpl:
    private class IteratorImpl implements Iterator<E> {
    // проверяет, есть ли следующий элемент для выборки методом next
    public boolean hasNext() { // ... }
    // возвращает следующий элемент
    public E next() { // ... }
    // удаляет элемент, который был возвращен ранее методом next
    public void remove() {

    АЛГОРИТМ:
    ЕСЛИ ПЕРЕД ВЫЗОВОМ remove НЕ БЫЛ ВЫЗВАН МЕТОД next
    ИЛИ ПЕРЕД ВЫЗОВОМ remove БЫЛ ВЫЗВАН remove (повторный вызов remove)
    ВЫБРОСИТЬ ИСКЛЮЧЕНИЕ (так и вставить в код):
    throw new IllegalStateException();
    В ДАННОМ МЕСТЕ ОПРЕДЕЛИТЬ И УДАЛИТЬ СООТВЕТСТВУЮЩИЙ ЭЛЕМЕНТ
    }
   }
   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   2.2. Продемонстрировать работу итератора с помощью циклов while и for each:
   public class Demo {
   public static void main(String[] args) {
        MyDeque<Number> deque = new MyDequeImpl<Number>();
        deque.addFirst(433);
        deque.addLast(8.88);
        // ...
        for (Number element : deque) { System.out.println(element); }
        Iterator<Number> it = deque.iterator();
        while (it.hasNext())
            System.out.println(it.next());
            // ...
        }
     }
     */
}
