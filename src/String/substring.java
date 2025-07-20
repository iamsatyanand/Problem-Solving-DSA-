package String;

import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s1 = scan.nextLine();
        System.out.println(s1);

//        System.out.println(s1.substring(1));

        // last index will not be considered start to end - 1 index
//        System.out.println(s1.substring(1,3));

        for (int i = 0; i < s1.length(); i++) {
            for (int j = i+1; j <= s1.length(); j++) {
                System.out.println(s1.substring(i, j));
            }
        }
    }
}
