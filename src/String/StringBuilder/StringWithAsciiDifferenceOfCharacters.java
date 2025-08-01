package String.StringBuilder;

import java.util.Scanner;

public class StringWithAsciiDifferenceOfCharacters {

    public static String asciiDifference(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            int gap = curr - prev;
            sb.append(gap);
            sb.append(curr);
//            sb.append(Integer.toString(gap)).append(curr);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(asciiDifference(str));
    }
}
