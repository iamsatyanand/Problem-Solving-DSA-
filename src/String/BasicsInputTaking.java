package String;

import java.util.Scanner;

public class BasicsInputTaking {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // reads till spaces
        String s1 = scan.next(); // reads till space
        String s2 = scan.next();
        System.out.println(s1);
        System.out.println(s2);

        // reads the entire line not the next line
        String s3 = scan.nextLine();
        String s4 = scan.nextLine();
        System.out.println(s3);
        System.out.println(s4);
    }
}
