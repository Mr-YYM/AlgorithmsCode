package IteratorTry;

import java.util.Iterator;

public class ResizingArrayStack<Item> implements Iterable<Item> {
    private Item[] a = (Item[]) new Object[1];
    private int size = 0;
    public boolean isEmpty(){return size ==0;}
    public int getSize() {return size;}

    private void resize(int max) {
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < size; i++) {
            temp[i] = a[i];
        }
        a = temp;

    }

    public void push(Item item) {
        if (size ==a.length) {
            resize(2*a.length);
        }
        a[size++] = item;
    }

    public Item pop() {
        Item item = a[--size];
        a[size] = null;
        if (size>0 && size==a.length/4) {
            resize(a.length / 2);
        }
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    public static void main(String[] args) {
        
    }

    private class ReverseArrayIterator implements Iterator<Item> {
        private int i = size;
        @Override
        public boolean hasNext() {
            return i>0;
        }

        @Override
        public Item next() {
            return a[--i];
        }

        @Override
        public void remove() {

        }
    }
}
