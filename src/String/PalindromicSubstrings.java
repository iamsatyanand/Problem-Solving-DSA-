package String;

import java.util.Scanner;

public class PalindromicSubstrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.next();
        System.out.println(s1);

        for (int i = 0; i < s1.length(); i++) {
            for (int j = i + 1; j <= s1.length(); j++) {
                String subStr = s1.substring(i,j);
                boolean  isPallindrome = checkPalindrome(subStr);
                if(isPallindrome){
                    System.out.println(subStr);
                }
            }

        }

    }

    private static boolean checkPalindrome(String subStr) {
        for (int i = 0; i < subStr.length()/2; i++) {
            if(subStr.charAt(i) != subStr.charAt(subStr.length() - i - 1))
            {
                return false;
            }
        }
        return true;
    }
}
