package String.Basics.Example1;

public class StringPoolDemo {

    public static void main(String[] args) {
        String hello = "hello";
        String hello1 = "hello";
        String hi = "hello1";
        String hey = "hey";

        System.out.println(hello == hello1); // true as == compares hashcode and memory location
        System.out.println(hello == hi); // false

        System.out.println(hello.hashCode()); // 99162322
        System.out.println(hello1.hashCode()); //99162322
        System.out.println(hi.hashCode()); //-1220935265
        System.out.println(hey.hashCode()); //103196


        String obj = new String("hello"); //  separate object in heap memory
        String obj1 = new String("hello"); //  separate object in heap memory
        String obj2= new String("hey");

        System.out.println(obj.hashCode()); // 99162322
        System.out.println(obj1.hashCode()); //99162322
        System.out.println(obj2.hashCode()); //103196

        System.out.println(obj == obj1); // false as separate object in heap memory

    }
}
