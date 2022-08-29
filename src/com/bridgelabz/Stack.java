package com.bridgelabz;

public class Stack <T> {

    MyLinkedList<T> linkedList;

    public Stack() {
        this.linkedList = new MyLinkedList<>();
    }


    public void push(T key) {
        linkedList.push(key);
    }


    public void print() {
        linkedList.print();
    }

    public T pop() {
        return linkedList.pop();
    }

    public T peek(){
        return linkedList.peek();
    }

    public boolean isEmpty(){
        return linkedList.size() == 0;
    }
}
