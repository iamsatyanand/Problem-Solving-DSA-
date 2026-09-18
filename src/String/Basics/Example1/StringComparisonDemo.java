package String.Basics.Example1;

public class StringComparisonDemo {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "Hey";

        boolean b1 = str1.equals(str2);
        boolean b2 = str1.equals(str3);

        boolean b3 = str1.equals("Hey");
        boolean b4 = "Hey".equals(str1);
        boolean b5 = "Hey".equals("Hello");


        String str4 = "java";
        String str5 = "JAVA";

        boolean b6 = str4.equalsIgnoreCase(str5);

        int comparison1 = "java".compareTo("java"); // 0
        int comparison2 = "java".compareTo("python"); // -6
        int comparison3 = "python".compareTo("java"); // 6

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(b6);

        System.out.println(comparison1);
        System.out.println(comparison2);
        System.out.println(comparison3);



    }

}

/*
== is completely null-safe. Checking obj == null will never throw an exception.
.equals() is not null-safe. Calling obj1.equals(obj2) when obj1 is null will instantly trigger a NullPointerException.
 */
