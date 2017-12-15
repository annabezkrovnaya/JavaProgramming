package ua.org.oa.annabezkrovnaya.task4_2part3;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

@Setter
@Getter
public class MyDequeImpl<E> implements MyDeque<E> {
    private Node<E> firstNode;
    private Node<E> lastNode;
    private int size;
    private E result;

    public ListIterator<E> listIterator() {
        return new ListIteratorImpl();
    }

    private class ListIteratorImpl extends IteratorImpl implements ListIterator<E> {

        ArrayList<E> arrayList = new ArrayList<>();
        private int index = - 1;

        @Override
        public boolean hasPrevious() {
            boolean check = false;
            if (index < size - 1) {
                check = true;
            }
            return check;
        }

        @Override
        public E previous() {
            for (Node<E> node = getLastNode(); node != null; node = node.prev) {
                arrayList.add(node.element);
            }
            if (hasNext()) {
                result = arrayList.get(++index);
            }
            return result;
        }

        @Override
        public void set(E e) {
            E currentElement = result;
            if (currentElement != null) {
                for (Node<E> node = getFirstNode(); node != null; node = node.next) {
                    if (node.element.equals(currentElement)) {
                        node.setElement(e);
                    }
                }
            } else throw new IllegalStateException();
        }

        @Override
        public void remove() {
            E currentElement = result;
            if (currentElement != null) {
                for(Node<E> node = getFirstNode(); node != null; node = node.next){
                    if(node.equals(currentElement)){
                        node.setElement(null);
                    }
                }
            } else throw new IllegalStateException();
        }
    }
    @Override
    public Iterator<E> iterator() {

        return new IteratorImpl();
    }

    private class IteratorImpl implements Iterator<E> {

        ArrayList<E> arrayList = new ArrayList<>();
        private int index = -1;

        //check is next element is
        public boolean hasNext() {
            boolean check = false;
            if(index < size-1){
                check = true;
            }
            return check;
        }
        //return next element
        public E next() {
            for (Node<E> node = getFirstNode(); node!= null; node = node.next) {
                arrayList.add(node.element);
            }
            if(hasNext()) {
                result = arrayList.get(++index);
            }
            return result;
        }
        //remove next element
        public void remove() {
            E currentElement = result;
            if(currentElement != null) {
                for (Node<E> node = getFirstNode(); node != null; node = node.next) {
                    if (node.element.equals(currentElement)) {
                        node.setElement(null);
                    }
                }
            }
            else throw new IllegalStateException();
        }
    }

    @Override
    public void addFirst(E e) {//add the element to the beginning of list

        Node<E> firstNode = getFirstNode();
        Node<E> newNode = new Node<>(e,null, firstNode);
        setFirstNode(newNode);
        if(firstNode == null){
            setLastNode(newNode);
        }
        else {
            firstNode.prev = newNode;
        }
        size++;
    }

    @Override
    public void addLast(E e) {//add the element to the end of list
        Node<E> lastNode = getLastNode();
        Node<E> newNode = new Node<>(e, lastNode,null);
        setLastNode(newNode);
        if (lastNode == null){
            setFirstNode(newNode);
        }
        else {
            lastNode.next = newNode;
        }
        size++;
    }

    @Override
    public E removeFirst() {//get the element from the beginning of list and remove it
        Node<E> firstNode = getFirstNode();
        E first = null;
        if(firstNode == null){
            throw new NoSuchElementException("Такого элемента не существует");
        }
        else {
            first = firstNode.element;
            setFirstNode(getFirstNode().next);
            size--;
        }

        return first;
    }

    @Override
    public E removeLast() {//get the element from the end of list and remove it
        Node<E> lastNode = getLastNode();
        E last = null;
        if(lastNode == null){
            throw new NoSuchElementException("Такого элемента не существует");
        }
        else {
            last = lastNode.element;
            setLastNode(getLastNode().prev);
            getLastNode().next = null;
            size--;
        }
        return last;
    }

    @Override
    public E getFirst() {//get the element from the beginning of list
        Node<E> firstNode = getFirstNode();
        if(firstNode == null){
            throw new NoSuchElementException("Такого элемента не существует");
        }
        else
            return firstNode.element;
    }

    @Override
    public E getLast() {//get the element from the end
        Node<E> lastNode = getLastNode();
        if(lastNode == null){
            throw new NoSuchElementException("Такого элемента не существует");
        }
        else
            return lastNode.element;
    }

    @Override
    public boolean contains(Object o) {//check if Object contain into list
        boolean result = false;
        for (Node<E> node = getFirstNode(); node!= null; node = node.next){
            if(node.element.equals(o)){
                result = true;
            }
        }
        return result;
    }

    @Override
    public void clear() { //clean list
        try {
            for (Node<E> node = getFirstNode(); node!= null; node = node.next){
                node = null;
                size = 0;
                setFirstNode(null);
                setLastNode(null);
            }
        }catch (NullPointerException e){
            System.out.println("Список больше не содержит ни одного элемента");
        }
    }

    @Override
    public Object[] toArray() {//return an array of list elements
        int index = 0;
        Object [] array = new Object[getSize()];
        for (Node<E> node = getFirstNode(); node!= null; node = node.next){
            array[index++] = node.element;
        }
        return array;
    }

    @Override
    public int size() {//return number of elements in the list
        return getSize();
    }

    @Override
    public boolean containsAll(MyDeque<? extends E> deque) {//check is list contains all the elements from deque
        Object[] tempArray = deque.toArray();
        int count = 0;
        int i = 0;
        for (Node<E> node = getFirstNode(); node!= null; node = node.next){
            for (i = 0; i < tempArray.length; i++){
                if (tempArray[i].equals(node.element)){
                    count++;
                }
            }
        }
        return count == tempArray.length;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        String result = null;
        try {
            for (Node<E> node = getFirstNode(); node != null; node = node.next) {
                stringBuilder.append(node.element).append(", ");
            }
            result = stringBuilder.toString().substring(0, stringBuilder.length() - 2);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Список пуст");
        }
        return "MyDeque {" + result + "}";
    }

    @Getter
    @Setter
    @NoArgsConstructor
    private static class Node<E> {
        // element
        E element;
        // reference to next element
        Node<E> next;
        // reference to previous element
        Node<E> prev;

        Node(E element, Node<E> prev, Node<E> next) {
            this.element = element;
            setNext(next);
            setPrev(prev);
        }
    }

}
