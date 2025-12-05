package Recursion;

// Given an integer value a and b write a recursive function to
// implement a^b.

public class _1PowerFunction {

    public static int helper(int a, int b){

        if (b == 0) return 1;

        return a * helper(a, b - 1);
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        System.out.println(helper(a, b));
    }

}
