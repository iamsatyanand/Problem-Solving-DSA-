package String.Basics.Example1;

public class SubstringDemo {

    public static void main(String[] args) {
        String originalString = "Hello, World!";

        String subString = originalString.substring(7);
        String subString1 = originalString.substring(0, 5);

        System.out.println(subString);
        System.out.println(subString1);
    }
}
