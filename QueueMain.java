package com.bridgelabz.StacksAndQueues;

public class QueueMain {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        System.out.println("The Queue:");
        queue.show();
        System.out.println();

        Integer dequeueData;
        do {
            dequeueData = queue.dequeue();
            if (dequeueData == null)
                System.out.println("Queue is Empty");
            else
                System.out.println("The dequeued element is => " + dequeueData);
            queue.show();
        } while( dequeueData != null);
    }
}
