package task1;

import java.util.Iterator;

public class Stack<T> implements Iterable<T> {
    private Node<T> top;
    private int size = 0;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    public void push(T elem) {
        Node<T> newNode = new Node<>(elem);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }

        T data = top.data;
        top = top.next;
        size--;
        return data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> current = top;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    System.out.println("No more elements");
                }
                T data = current.data;
                current = current.next;
                return data;
            }
        };
    }
}