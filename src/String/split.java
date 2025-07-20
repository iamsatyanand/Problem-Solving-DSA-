package String;

import java.util.Arrays;
import java.util.Scanner;

public class split {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s1 = scan.nextLine();
        System.out.println(s1);

        String[] s2 = s1.split(" ");
        System.out.println(Arrays.toString(s2));
    }
}
