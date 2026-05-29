package LinkedList;

public class MyLinkedList {
    Node head;

    public MyLinkedList() {

        this.head = null;

    }

    public int get(int index) {
        if (index < 0) return -1;
        int i = 0;
        Node temp = head;
        while (i < index && temp != null) {
            i++;
            temp = temp.next;
        }
        if (temp == null) return -1;

        return temp.val;

    }

    public void addAtHead(int val) {

        Node newNode = new Node(val);
        newNode.next = this.head;

        this.head = newNode;

    }

    public void addAtTail(int val) {


        Node newNode = new Node(val);
        if (this.head == null) {
            this.head = newNode;
            return;
        }
        Node currNode = this.head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;


    }

    public void addAtIndex(int index, int val) {
        // 1. Handle inserting at the head (index 0)
        // This works perfectly whether the list is empty or already has nodes
        if (index == 0) {
            Node newNode = new Node(val);
            newNode.next = this.head;
            this.head = newNode;
            return;
        }

        Node prevNode = null;
        Node currNode = this.head;
        int i = 0;

        // Traverse the list
        while (i < index && currNode != null) {
            i++;
            prevNode = currNode;
            currNode = currNode.next;
        }

        // 2. If we didn't reach the target index, it means index > length
        if (i != index) return;

        // 3. Insert the node (Works for middle and tail insertions)
        Node newNode = new Node(val);
        prevNode.next = newNode;
        newNode.next = currNode;
    }

    public void deleteAtIndex(int index) {
        // 1. If the list is empty, there is nothing to delete
        if (this.head == null) {
            return;
        }

        // 2. Handle deleting the head node (index == 0)
        if (index == 0) {
            this.head = this.head.next;
            return;
        }

        Node prev = null;
        Node curr = this.head;
        int i = 0;

        // Traverse to find the node to delete
        while (i < index && curr != null) {
            i++;
            prev = curr;
            curr = curr.next;
        }

        // 3. Safety Check:
        // If i != index, the index is too large.
        // If curr == null, the index is equal to the length of the list (out of bounds).
        if (i != index || curr == null) {
            return;
        }

        // 4. Disconnect the node from the list
        prev.next = curr.next;

        // Optional but good practice: disconnect the deleted node's pointer
        curr.next = null;
    }

}
