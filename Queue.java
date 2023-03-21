package com.bridgelabz.StacksAndQueues;

import com.bridgelabz.LinkedList.LinkedList;

public class Queue<T extends Comparable<T>> {
    LinkedList<T> linkedList = new LinkedList<>();

    public void enqueue(T data) {
        linkedList.append(data);
    }

    public void show() {
        linkedList.show();
    }

    public T dequeue(){
        return linkedList.pop();
    }
}
