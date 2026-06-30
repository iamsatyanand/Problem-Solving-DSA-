package LinkedList;

public class _2Design_DoublyLinkedListWithTail {

    public static void main(String[] args) {

        MyDoublyLinkedListWithTail list = new MyDoublyLinkedListWithTail();

        list.addAtHead(10);
        list.addAtHead(20);
        list.addAtHead(30);

        System.out.println("After adding at head:");
        list.displayForward();
        list.displayBackward();

        list.addAtTail(40);
        list.addAtTail(50);

        System.out.println("\nAfter adding at tail:");
        list.displayForward();
        list.displayBackward();

        list.removeFromHead();

        System.out.println("\nAfter removing from head:");
        list.displayForward();
        list.displayBackward();

        list.removeFromTail();

        System.out.println("\nAfter removing from tail:");
        list.displayForward();
        list.displayBackward();
    }
}