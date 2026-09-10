package String.Basics.Example1;

public class InternMethodDemo {

    public static void main(String[] args) {
        String hello = "hello"; // stored inside string pool
        String obj = new String("hello"); // it will create a new object inside heap

        String obj1 = new String("hello").intern(); // it will either create a new object inside String pool or share the same memory location

        System.out.println(hello == obj); // false
        System.out.println(hello == obj1); // true
    }
}
