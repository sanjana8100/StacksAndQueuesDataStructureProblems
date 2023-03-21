package com.bridgelabz.StacksAndQueues;

public class StackMain {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(70);
        stack.push(30);
        stack.push(56);
        System.out.println("The Stack:");
        stack.show();
        System.out.println();

        Integer poppedData;
        do {
            poppedData = stack.pop();
            if (poppedData == null)
                System.out.println("Stack is Empty");
            else
                System.out.println("The element popped is => " + poppedData);
            stack.show();
        } while( poppedData != null);
    }
}
