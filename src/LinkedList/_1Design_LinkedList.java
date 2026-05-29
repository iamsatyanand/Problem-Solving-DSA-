package LinkedList;

public class _1Design_LinkedList {
    public static void main(String[] args) {
        System.out.println("--- 🚀 Testing Custom Linked List Implementation 🚀 --- \n");

        MyLinkedList list = new MyLinkedList();

        // 1. Test: Adding at Head
        System.out.println("🧪 Test 1: Adding 10, then 20 at Head...");
        list.addAtHead(10);
        list.addAtHead(20);
        printList(list); // Expected: 20 -> 10 -> null

        // 2. Test: Adding at Tail
        System.out.println("\n🧪 Test 2: Adding 30, then 40 at Tail...");
        list.addAtTail(30);
        list.addAtTail(40);
        printList(list); // Expected: 20 -> 10 -> 30 -> 40 -> null

        // 3. Test: Adding at Specific Indexes
        System.out.println("\n🧪 Test 3: Adding 25 at Index 2 (Middle Insertion)...");
        list.addAtIndex(2, 25);
        printList(list); // Expected: 20 -> 10 -> 25 -> 30 -> 40 -> null

        System.out.println("🧪 Test 4: Adding 5 at Index 0 (Head Insertion via index)...");
        list.addAtIndex(0, 5);
        printList(list); // Expected: 5 -> 20 -> 10 -> 25 -> 30 -> 40 -> null

        System.out.println("🧪 Test 5: Adding 50 at Index 6 (Tail Insertion via index)...");
        list.addAtIndex(6, 50);
        printList(list); // Expected: 5 -> 20 -> 10 -> 25 -> 30 -> 40 -> 50 -> null

        System.out.println("🧪 Test 6: Attempting to add 100 at invalid Index 10...");
        list.addAtIndex(10, 100); // Out of bounds, should ignore safely
        printList(list);

        // 4. Test: Getting elements by Index
        System.out.println("\n🧪 Test 7: Fetching elements by Index...");
        System.out.println("Element at Index 0: " + list.get(0));   // Expected: 5
        System.out.println("Element at Index 3: " + list.get(3));   // Expected: 25
        System.out.println("Element at Index 6: " + list.get(6));   // Expected: 50
        System.out.println("Element at Index 99 (Invalid): " + list.get(99)); // Expected: -1

        // 5. Test: Deleting from specific Indexes
        System.out.println("\n🧪 Test 8: Deleting Element at Index 3 (Middle Node '25')...");
        list.deleteAtIndex(3);
        printList(list); // Expected: 5 -> 20 -> 10 -> 30 -> 40 -> 50 -> null

        System.out.println("🧪 Test 9: Deleting Element at Index 0 (Head Node '5')...");
        list.deleteAtIndex(0);
        printList(list); // Expected: 20 -> 10 -> 30 -> 40 -> 50 -> null

        System.out.println("🧪 Test 10: Deleting Element at Index 4 (Tail Node '50')...");
        list.deleteAtIndex(4);
        printList(list); // Expected: 20 -> 10 -> 30 -> 40 -> null

        System.out.println("🧪 Test 11: Attempting to delete at invalid Index 10...");
        list.deleteAtIndex(10); // Out of bounds, should ignore safely
        printList(list);
    }

    // This helper method was missing its closing brackets in your prompt!
    public static void printList(MyLinkedList list) {
        int i = 0;
        StringBuilder sb = new StringBuilder("Current List: ");
        while (true) {
            int val = list.get(i);
            if (val == -1) break;
            sb.append(val).append(" -> ");
            i++;
        }
        sb.append("null");
        System.out.println(sb.toString());
    }
}

// Sample Output
//**
// --- 🚀 Testing Custom Linked List Implementation 🚀 ---
//
//🧪 Test 1: Adding 10, then 20 at Head...
//Current List: 20 -> 10 -> null
//
//🧪 Test 2: Adding 30, then 40 at Tail...
//Current List: 20 -> 10 -> 30 -> 40 -> null
//
//🧪 Test 3: Adding 25 at Index 2 (Middle Insertion)...
//Current List: 20 -> 10 -> 25 -> 30 -> 40 -> null
//🧪 Test 4: Adding 5 at Index 0 (Head Insertion via index)...
//Current List: 5 -> 20 -> 10 -> 25 -> 30 -> 40 -> null
//🧪 Test 5: Adding 50 at Index 6 (Tail Insertion via index)...
//Current List: 5 -> 20 -> 10 -> 25 -> 30 -> 40 -> 50 -> null
//🧪 Test 6: Attempting to add 100 at invalid Index 10...
//Current List: 5 -> 20 -> 10 -> 25 -> 30 -> 40 -> 50 -> null
//
//🧪 Test 7: Fetching elements by Index...
//Element at Index 0: 5
//Element at Index 3: 25
//Element at Index 6: 50
//Element at Index 99 (Invalid): -1
//
//🧪 Test 8: Deleting Element at Index 3 (Middle Node '25')...
//Current List: 5 -> 20 -> 10 -> 30 -> 40 -> 50 -> null
//🧪 Test 9: Deleting Element at Index 0 (Head Node '5')...
//Current List: 20 -> 10 -> 30 -> 40 -> 50 -> null
//🧪 Test 10: Deleting Element at Index 4 (Tail Node '50')...
//Current List: 20 -> 10 -> 30 -> 40 -> null
//🧪 Test 11: Attempting to delete at invalid Index 10...
//Current List: 20 -> 10 -> 30 -> 40 -> null
// *//