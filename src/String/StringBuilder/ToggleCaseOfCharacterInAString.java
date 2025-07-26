package String.StringBuilder;

import java.util.Scanner;

public class ToggleCaseOfCharacterInAString {

    public static String toggleCase(String str){
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                char ucase = (char)('A' + ch - 'a');
                sb.setCharAt(i, ucase);
            }
            else if(ch >= 'A' && ch<= 'Z'){
                char lcase = (char)('a' + ch - 'A');
                sb.setCharAt(i, lcase);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str1 = toggleCase(str);
        System.out.println(str1);
    }
}

/**
 * 'a' to 'z' → ASCII values from 97 to 122
 *
 * 'A' to 'Z' → ASCII values from 65 to 90
 *
 * The difference between lowercase and uppercase letters in ASCII is always 32.
 *
 * example:
 * ch = 'p' and 'P'
 *
 * Foundational Formula:
 * 'p' - 'a' = 'P' - 'A'
 *
 * This means:
 *
 * The relative position of 'p' in lowercase is the same as the relative position of 'P' in uppercase.
 *
 * In ASCII:
 *
 * 'p' = 112, 'a' = 97 → 112 - 97 = 15
 *
 * 'P' = 80, 'A' = 65 → 80 - 65 = 15
 *
 * useing this
 * 'p' - 'a' = 'P' - 'A'
 * lower case
 * 'p' = 'a' + 'P' - 'A'   ( ch is the character which we have to toggle as ch='P' whe have given
 *
 * upper case
 * 'P' = 'A' + 'p' - 'a'
 *
 * 🔁 This 15 is the distance from the start of the alphabet, and it's consistent between cases.
 *
 * */
