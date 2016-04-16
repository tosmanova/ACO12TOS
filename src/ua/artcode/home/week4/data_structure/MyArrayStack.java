package ua.artcode.home.week4.data_structure;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created by tos on 4/14/16.
 */
public class MyArrayStack implements Iterable, MyStack {

    private Object[] mas;
    private int top;

    public MyArrayStack(int size) {
        mas = new Object[size];
    }

    @Override
    public Iterator iterator() {
        return new MyIterator();
    }

    @Override
    public void forEach(Consumer action) {

    }

    @Override
    public Spliterator spliterator() {
        return null;
    }

    @Override
    public void push(Object obj) {
        if (top == mas.length) {
            System.out.println("Stack is full");
            return;
        }
        mas[top++] = obj;
    }

    @Override
    public Object pop() {
        Object forRet = mas[--top];
        mas[top] = null;
        return forRet;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = top - 1; i >= 0; i--) {
            sb.append(mas[i]).append("\n");
        }

        return "MyArrayStack{\n" +
                sb +
                '}';
    }

    private class MyIterator implements Iterator {

        private int index = -1;

        @Override
        public Object next() {
            if (index >= top) {
                throw new NoSuchElementException();
            }
            return mas[++index];
        }

        @Override
        public boolean hasNext() {
            return index < top - 1;
        }
    }
}
