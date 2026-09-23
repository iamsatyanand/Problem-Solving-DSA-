package String.Basics.Example1;

public class StringJoinDemo {
    public static void main(String[] args) {
        String result = String.join(",", "Hello", "World", "Java");
        String result1 = String.join("", "Java is", "fun and", "powerful");

        System.out.println(result);
        System.out.println(result1);
    }
}
