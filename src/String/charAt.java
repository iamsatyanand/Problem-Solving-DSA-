package String;

import java.util.Scanner;

public class charAt {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String s1 = scan.nextLine();
        System.out.println(s1);
        // length of String
        System.out.println(s1.length());

        char ch = s1.charAt(2);
        System.out.println(ch);

        for(int i = 0; i < s1.length(); i++){
            System.out.println(s1.charAt(i));
        }

        //s1.charAt(0) = 'z'   //  set char in string is not possible
    }
}
