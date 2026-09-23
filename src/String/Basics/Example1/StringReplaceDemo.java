package String.Basics.Example1;

public class StringReplaceDemo {

    public static void main(String[] args) {
        String originalString = "Hello, World!";

        String replacedString = originalString.replace('o', '*');
        String replacedString1 = originalString.replace("World", "Universe");
        String replacedString2 = originalString.replace("world", "universe");

        String originalString1 = "ababababa";
        String replacedString3 = originalString1.replace("ab", "X");

        String originalString2 = "Java is A Fun";
        String replacedString4 = originalString2.replaceAll("a|e|i|o|u", "*");

        String originalString3 = "apple orange apple banana apple";
        String replacedString5 = originalString3.replaceFirst("apple", "grape");

        System.out.println(replacedString);
        System.out.println(replacedString1);
        System.out.println(replacedString2);
        System.out.println(replacedString3);
        System.out.println(replacedString4);
        System.out.println(replacedString5);
    }
}
