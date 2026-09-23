package String.Basics.Example1;

public class StringFormatDemo {

    public static void main(String[] args) {

        String message = "Hello %s! You have %d messages";

        String message1 = String.format(message, "Satya", 5);
        String message2 = String.format(message, "Ved", 6);

        System.out.println(message1);
        System.out.println(message2);

        String message3 = "The price is $ %2f";
        String message4 = String.format(message3, 19.999);
        String message5 = String.format(message3, 9.56);

        System.out.println(message4);
        System.out.println(message5);

        String message6 = "The number is %5d";
        String message7 = String.format(message6, 7);
        String message8 = String.format(message6, 9);

        System.out.println(message7);
        System.out.println(message8);

        String message9 = "My Name is %3$s , I am %2$d years old, and I live in %1$s";
        String message10 = String.format(message9, "NewYork", 30, "Satyanand");

        System.out.println(message10);
    }
}
