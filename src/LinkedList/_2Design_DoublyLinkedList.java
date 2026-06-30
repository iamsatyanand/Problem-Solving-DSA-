package LinkedList;

public class _2Design_DoublyLinkedList {
    public static void main(String[] args) {
        MyDoublyLinkedList linkedList = new MyDoublyLinkedList();

        linkedList.addAtHead(10);
        linkedList.addAtHead(20);
        linkedList.display();

        linkedList.addAtTail(30);
        linkedList.addAtTail(40);
        linkedList.display();

        linkedList.removeFromHead();
        linkedList.display();

        linkedList.removeFromTail();
        linkedList.display();

    }
}
