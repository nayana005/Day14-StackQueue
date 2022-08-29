package com.bridgelabz;

public class MyLinkedList <E> {
    Node<E> head;
    Node<E> tail;
    public void push(E key) {
        Node<E> newNode = new Node<>(key);
        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.setNext(head);
            head = newNode;
        }
    }

    public void add(E key) {
        Node<E> newNode = new Node<>(key);
        if (head == null) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
    }

    void print(){
        Node<E> temp = head;
        while(temp!=null){
            System.out.print(temp.getKey() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }

    public E pop(){
        E popData = head.getKey();
        head = head.getNext();
        return popData;
    }

    public int size() {
        int count = 0;
        Node<E> temp = head;
        while (temp != null) {
            count++;
            temp = temp.getNext();
        }
        return count;
    }
    public E peek(){
        return head.getKey();
    }
}
