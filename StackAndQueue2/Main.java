package StackAndQueue2;

public class Main {
    public static void main(String[] args) {
        // Create a stack with a capacity of 10
        Stack stack = new Stack(10);

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Pop elements from the stack
        System.out.println("Popped element: " + stack.pop()); // Output: 3
        System.out.println("Popped element: " + stack.pop()); // Output: 2

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: false

        // Push more elements
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);

        // Check if the stack is full
        System.out.println("Is stack full? " + stack.isFull()); // Output: true

        // Try to push onto a full stack
        stack.push(8); // Output: Stack is full

        // Pop the remaining elements
        while (!stack.isEmpty()) {
            System.out.println("Popped element: " + stack.pop());
        }

        // Try to pop from an empty stack
        System.out.println("Popped element: " + stack.pop()); // Output: Stack is empty
    }
}
