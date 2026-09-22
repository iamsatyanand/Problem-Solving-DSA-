package String.Basics.Example1;

public class StringTrimDemo {

    public static void main(String[] args) {
        String java1 = " java ".trim();
        String java2 = "java ".trim();
        String java3 = " \n \t java \n \r".trim();
        String java4 = " \n \t java \n \r";

        System.out.println(java1);
        System.out.println(java2);
        System.out.println(java3);
        System.out.println(java4);

        String java5 = " ja va ".trim();
        String java6 = " ja \n va ".trim();

        System.out.println(java5);
        System.out.println(java6);

        // practical use case is to compare two strings
        boolean isSame = "java".equals("java ");
        boolean isSame1 = "java".equals("java ".trim());

        System.out.println(isSame);
        System.out.println(isSame1);
        System.out.println();

    }
}
