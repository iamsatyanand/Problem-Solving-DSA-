package LinkedList;

public class MyDoublyLinkedList {
    DoublyNode head;

    public MyDoublyLinkedList(){
        this.head = null;
    }

    // add at head
    public void addAtHead(int val){
        DoublyNode newNode = new DoublyNode(val);
        if(this.head == null){
            this.head = newNode;
        }
        else {
            newNode.next = this.head;
            this.head.prev = newNode;
            this.head = newNode;
        }
    }

    // add at tail
    public void addAtTail(int val){
        DoublyNode newNode = new DoublyNode(val);
        DoublyNode temp = this.head;
        if(this.head == null){
            this.head = newNode;
        }
        else {
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    // remove from Head
    public void removeFromHead(){
        if(this.head == null){
            return;
        }
        if(this.head.next == null){
            this.head = null;
        }
        else {
            this.head = this.head.next;
            this.head.prev = null;
        }
    }

    // remove from Tail
    public void removeFromTail(){

        if(this.head == null) return;

        if(this.head.next == null){
            this.head = null;
            return;
        }
        DoublyNode temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next.prev = null;
        temp.next = null;


    }

    public void display(){
        StringBuilder sb = new StringBuilder();
        sb.append("X <-> ");
        DoublyNode temp = this.head;
        while(temp != null){
            sb.append(temp.val).append(" <-> ");
            temp = temp.next;
        }
        sb.append("X");
        System.out.println(sb.toString());
    }
}
