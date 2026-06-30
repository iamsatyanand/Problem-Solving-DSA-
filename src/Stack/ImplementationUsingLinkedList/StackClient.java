package Stack.ImplementationUsingLinkedList;

public class StackClient {
    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();

        System.out.println("Is Stack Empty? " + stack.isEmpty());

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("After pushing 10, 20, 30, 40:");
        stack.display();

        // Peek
        System.out.println("Top Element: " + stack.peek());

        // Size
        System.out.println("Size: " + stack.size());

        // Pop one element
        System.out.println("Popped: " + stack.pop());

        System.out.println("Stack after one pop:");
        stack.display();

        System.out.println("Top Element: " + stack.peek());
        System.out.println("Size: " + stack.size());

        // Pop all elements
        System.out.println("Removing all elements:");

        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }

        System.out.println("Stack after removing everything:");
        stack.display();

        System.out.println("Is Stack Empty? " + stack.isEmpty());

        // Pop from empty stack
        System.out.println("Trying to pop from empty stack:");
        System.out.println("Popped: " + stack.pop());

        // Peek from empty stack
        System.out.println("Trying to peek from empty stack:");
        System.out.println("Top Element: " + stack.peek());

        // Push again
        stack.push(100);
        stack.push(200);

        System.out.println("After pushing again:");
        stack.display();

        // Clear
        stack.clear();

        System.out.println("After clear():");
        stack.display();
        System.out.println("Is Stack Empty? " + stack.isEmpty());
    }
}
