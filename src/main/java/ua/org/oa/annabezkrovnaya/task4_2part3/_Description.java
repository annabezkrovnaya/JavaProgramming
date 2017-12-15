package ua.org.oa.annabezkrovnaya.task4_2part3;


public @interface _Description {

    /*
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     Часть №3 (пакет ua.org.oa.<JIRALOGIN>.task4_2part1.part3)
     Скопировать созданные в части №2 типы в пакет part3 (изменив декларацию пакета вверху каждого типа).
     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        ***3.1. Определить интерфейс ListIterator:
        public interface ListIterator<E> extends Iterator<E> { // java.util.Iterator
        // проверяет, есть ли предыдущий элемент для выборки методом previous
        boolean hasPrevious();
        // возвращает предыдущий элемент
        E previous();
        // заменяет элемент, который на предыдущем шаге был возвращен next/previous на данный элемент
        void set(E e);
        // удаляет элемент, который на предыдущем шаге был возвращен next/previous
        void remove();
        }
        Методы set/remove могут быть вызваны только после next/previous. Повторный вызов (подряд) set/remove должен приводить к
        выбросу исключения IllegalStateException
        ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        ***3.2. Создать интерфейс ListIterable:
        public interface ListIterable<E> { ListIterator<E> listIterator(); }
        ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        ***3.3. Добавить к интерфейсу MyDeque наследование интерфейса ListIterable:
        public interface MyDeque<E> extends Iterable<E>, ListIterable<E> {...}
        ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        ***3.4. Добавить в класс MyDequeImpl метод
        public ListIterator<E> listIterator()
        { return new ListIteratorImpl(); } который возвращает объект внутреннего класса ListIteratorImpl:
        private class ListIteratorImpl extends IteratorImpl implements ListIterator<E>
        { // РЕАЛИЗОВАТЬ ВСЕ МЕТОДЫ интерфейса ListIterator }
        ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        3.5. Продемонстрировать работу итератора ListIterator.
        public class Demo {
        public static void main(String[] args) {
            MyDeque<Number> deque = new MyDequeImpl<Number>();
            deque.addFirst(433);
            deque.addLast(8.88);
            // ...
            ListIterator<Number> listIt = deque.listIterator();
            while (listIt.hasNext())
                System.out.println(listIt.next());
            while (listIt.hasPrevious())
                System.out.println(listIt.previous());
                // ...
            }
       }
     */
}
