package String.Basics.Example1;

public class EscapeSeqDemo {
    public static void main(String[] args) {
        String name = "\"Satya\"";
        System.out.println(name);

        String name1 = "\u0053atya\u0021";
        System.out.println(name1);
    }
}
