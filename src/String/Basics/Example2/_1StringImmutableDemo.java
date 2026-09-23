package String.Basics.Example2;

public class _1StringImmutableDemo {
    public static void main(String[] args) {
        String s1 = "hello";
        s1 = "Hello World!";
        System.out.println(s1);

        final String s2 = "Hi"; // no one can alter the content also no one can reuse the s2 reference name to create another
//        s2 = "Hey"; // compile time error
    }
}
