package com.logos.lesson12.linkedlist;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyIntLinkedList implements List<Integer> {
    private int size = 0;
    private Node first;
    private Node last;

    private class Node{
        Integer item;
        Node next;
        Node prev;

        public Node(Integer item, Node next, Node prev) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }

    @Override
    public int size() { return size; }
    @Override
    public boolean isEmpty() { return size == 0; }
    @Override
    public void clear() { size = 0; first = null; last = null; }

    @Override
    public boolean add(Integer integer) {

        if (isEmpty()) {
            first = new Node(integer, null, null);
        } else if (size == 1) {
            last = new Node(integer, null, first);
            first.next = last;
        } else {
            last.next = new Node(integer, null, last);
            last = last.next;
        }

        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        Integer integer = (Integer) o;

        Node point = first;
        for (int i = 0; i < size; i++){
            if (point != null && point.item.equals(integer)) {
                if (point.prev != null) point.prev.next = point.next;
                if (point.next != null) point.next.prev = point.prev;
                size--;
                return true;
            }
            point = point.next;
        }

        return false;
    }

    @Override
    public Integer get(int index) {
        if (isEmpty()) return null;

        int i = 0;
        Iterator<Integer> iter = this.iterator();
        while (iter.hasNext()) {
            Integer item = iter.next();
            if (i == index) return item;
            i++;
        }

        return null;
    }







    //TODO: Try to implement

    private class MyIterator implements Iterator<Integer> {
        Node point = first;

        @Override
        public boolean hasNext() {
            return point != null;
        }

        @Override
        public Integer next() {
            Integer item = point.item;
            point = point.next;
            return item;
        }

        //TODO:
        @Override
        public void remove() {

        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyIterator();
    }

    @Override
    public Integer remove(int index) {
        return null;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public Integer set(int index, Integer element) {
        return null;
    }

    @Override
    public void add(int index, Integer element) {

    }






    @Override public boolean containsAll(Collection<?> c) { return false; }
    @Override public boolean addAll(Collection<? extends Integer> c) { return false; }
    @Override public boolean addAll(int index, Collection<? extends Integer> c) { return false; }
    @Override public boolean removeAll(Collection<?> c) { return false; }
    @Override public boolean retainAll(Collection<?> c) { return false; }
    @Override public int lastIndexOf(Object o) { return 0; }
    @Override public ListIterator<Integer> listIterator() { return null; }
    @Override public ListIterator<Integer> listIterator(int index) { return null; }
    @Override public List<Integer> subList(int fromIndex, int toIndex) { return null; }
}
