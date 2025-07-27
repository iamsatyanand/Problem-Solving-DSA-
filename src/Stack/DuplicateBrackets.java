package Stack;

import java.util.Scanner;
import java.util.Stack;

public class DuplicateBrackets {


    public static boolean checkDuplicates(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ')') {
                if (stack.peek() == '(') {
                    return true; // Duplicate brackets found
                } else {
                    while (stack.peek() != '(') {
                        stack.pop();
                    }
                    stack.pop(); // Pop the opening bracket '('
                }
            } else {
                stack.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(checkDuplicates(str));
    }
}

/**
*
 * Stack Logic (Simple Steps):
 * Use a Stack (to store characters).
 *
 * Loop through each character of the string:
 *
 * If the character is not ), push it onto the stack.
 *
 * If the character is ), then:
 *
 * Check the top of the stack using peek():
 *
 * If it's '(' → duplicate brackets found → return true.
 *
 * Else → pop everything until '(' (remove content inside brackets).
 *
 * Finally, pop the '(' as well.
 *
 * If loop completes without returning true, return false.
 *
 * 🧪 Examples:
 * Input: ((a + b)) → true (extra/duplicate brackets)
 *
 * Input: (a + (b + c)) → false (valid)
 *
 * 📌 Notes:
 * Top of stack = peek() → used to check last pushed item.
 *
 * pop() → removes items from the stack.
 *
 *
 * why used stack
 * Think of a Stack like a bag of last-in items:
 * The last thing you put in is the first thing you take out — LIFO (Last In, First Out).
 *
 * 🧠 Why use it here?
 * Because in expressions like ((a + b)), we need to track opening ( and closing ) brackets and what's inside them, in the right order.
 *
 * Stack helps track brackets and content in correct order.
 *
 * Lets you detect empty or duplicate brackets quickly and cleanly.
 *
*
 * **/
