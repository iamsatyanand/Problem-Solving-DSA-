package LinkedList;


public class MyDoublyLinkedListWithTail {

    private DoublyNode head;
    private DoublyNode tail;

    public MyDoublyLinkedListWithTail() {
        head = null;
        tail = null;
    }

    // Add at Head - O(1)
    public void addAtHead(int val) {
        DoublyNode newNode = new DoublyNode(val);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Add at Tail - O(1)
    public void addAtTail(int val) {
        DoublyNode newNode = new DoublyNode(val);

        if (tail == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Remove from Head - O(1)
    public void removeFromHead() {

        if (head == null)
            return;

        if (head == tail) {
            head = tail = null;
            return;
        }

        head = head.next;
        head.prev = null;
    }

    // Remove from Tail - O(1)
    public void removeFromTail() {

        if (tail == null)
            return;

        if (head == tail) {
            head = tail = null;
            return;
        }

        tail = tail.prev;
        tail.next = null;
    }

    // Display Forward
    public void displayForward() {

        DoublyNode temp = head;

        System.out.print("X <-> ");

        while (temp != null) {
            System.out.print(temp.val + " <-> ");
            temp = temp.next;
        }

        System.out.println("X");
    }

    // Display Backward
    public void displayBackward() {

        DoublyNode temp = tail;

        System.out.print("X <-> ");

        while (temp != null) {
            System.out.print(temp.val + " <-> ");
            temp = temp.prev;
        }

        System.out.println("X");
    }
}
