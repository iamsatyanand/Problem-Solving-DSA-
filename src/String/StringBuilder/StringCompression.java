package String.StringBuilder;

import java.util.Scanner;

public class StringCompression {

    public static String compression1(String str){
        String s = String.valueOf(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            char current = str.charAt(i);
            char prev = str.charAt(i-1);

            if(current != prev){
                s += current;
            }
        }
        return s;
    }

    public static String compression2(String str){
        String s = str.substring(0,1);
        System.out.println(s);
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);

            if(curr != prev){
                if(count > 1){
                    s += Integer.toString(count);
                }
                s += curr;
                count = 0;

            }

            count++;
        }

        if(count > 1){
            s += Integer.toString(count);
        }
        return s;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(compression1(str));
        System.out.println(compression2(str));
    }
}
