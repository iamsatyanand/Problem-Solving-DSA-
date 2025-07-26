package Stack;

import java.util.Scanner;
import java.util.Stack;

public class DuplicateBrackets {

    public static boolean checkDuplicates(String str){
        Stack<Character> stringStack = new Stack<>();
        int i = 0;
        int n = str.length();
        while(str.charAt(i) != ')' ){
            if(str.charAt(i) == ')'){
                while(str.cha)
            }
            stringStack.push(str.charAt(i));
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(checkDuplicates(str));
    }
}
