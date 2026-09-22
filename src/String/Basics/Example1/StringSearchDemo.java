package String.Basics.Example1;

public class StringSearchDemo {

    public static void main(String[] args) {
        String originalString = "Hello World!";
        int index = originalString.indexOf('!');
        int index1 = originalString.indexOf("World");
        int index2 = originalString.indexOf("@");

        System.out.println(index); // 11
        System.out.println(index1); // 6
        System.out.println(index2); // -1

        boolean isContains = originalString.contains("World");
        boolean isPresent = originalString.contains("@");

        System.out.println(isContains);
        System.out.println(isPresent);

        boolean startsWith = originalString.startsWith("Hello");
        boolean endsWith = originalString.endsWith("@");
        boolean endsWith1 = originalString.endsWith("ld!");

        System.out.println(startsWith);
        System.out.println(endsWith);
        System.out.println(endsWith1);

        boolean isMatched = originalString.matches(".*World.*");
        System.out.println(isMatched);
    }
}
