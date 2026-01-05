package Recursion;

/***
 * Given a number x, calculate the count of binary strings of length x
 * which have no consecutive ones
 */

public class _3CountBinaryStrings {

    public static int countString(int n){
        if( n < 0) return 0;

        if(n < 3) return n+1;

        return countString(n-1) + countString(n-2);
    }

    public static void main(String[] args) {
        int n = 15;
        System.out.println(countString(n));
    }
}
