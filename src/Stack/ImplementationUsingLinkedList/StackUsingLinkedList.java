package Stack.ImplementationUsingLinkedList;

public class StackUsingLinkedList {

    public int size;

    class Node {
        int val;
        Node next;

        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    Node head;

    public StackUsingLinkedList(){
        this.head = null;
        this.size = 0;
    }

    // add at head
    public void push(int val){
        Node newNode = new Node(val);
        newNode.next = this.head;
        this.head = newNode;
        this.size ++;
    }

    // remove from head
    public int pop(){
        if(this.head == null){
            return -1;
        }

        int data = this.head.val;
        this.head = this.head.next;
        this.size--;
        return data;

    }

    public int peek(){
        if(this.head == null){
            return -1;
        }
        return this.head.val;
    }

    public boolean isEmpty(){
        return this.head == null;
    }

    public int size(){
        return size;
    }

    public void display(){
        if(this.head == null){
            System.out.println("Stack is empty");
            return;
        }

        Node temp = this.head;
        while(temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }

        System.out.println();
    }

    public void clear(){
        this.head = null;
        this.size = 0;
    }



}
