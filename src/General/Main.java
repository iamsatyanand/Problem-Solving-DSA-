package General;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;
class Main {
    public static void main(String[] args) {
        CopyOnWriteArrayList list = new CopyOnWriteArrayList();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);

        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            list.add(44); // ✅ No exception
        }


        System.out.println("Final list: " + list);
    }
}