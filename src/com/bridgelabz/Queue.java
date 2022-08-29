package com.bridgelabz;

public class Queue <T> {
    MyLinkedList<T> linkedList;

    public Queue() {
        this.linkedList = new MyLinkedList<>();
    }

    public void enqueu(T key) {
        linkedList.add(key);
    }
    public void print() {
        linkedList.print();
    }
}
