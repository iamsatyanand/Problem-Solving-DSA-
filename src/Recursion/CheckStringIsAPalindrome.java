package Recursion;

public class CheckStringIsAPalindrome {

    public static void main(String[] args){
        String str = "madam"; // Example input
        boolean isPalindrome = checkPalindrome(str, 0);
        System.out.println("Is the string \"" + str + "\" a palindrome? " + isPalindrome);
    }

    public static boolean checkPalindrome(String str, int i) {
        // Base case: if index is greater than or equal to half the length of the string, return true
        if(i >= str.length()/2) {
            return true;
        }

        // Check if characters at the current index and its corresponding character from the end are equal
        if(str.charAt(i) != str.charAt(str.length() - i -1) ){
            return false;
        }

        // Recursive case: check the next pair of characters
        return checkPalindrome(str, i + 1);
    }
}
