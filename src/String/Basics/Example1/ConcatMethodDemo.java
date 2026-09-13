package String.Basics.Example1;

public class ConcatMethodDemo {

    public static void main(String[] args) {
        String hello = "hello";
        hello = hello + " " + "world";
        System.out.println(hello);

        String hello1 = "hello";
        hello1 = hello1.concat(" ").concat("world");
        System.out.println(hello1);

        String emptyString = "";
        String nullString = null;
    }
}
