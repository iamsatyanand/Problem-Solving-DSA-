package Recursion;

// Given an integer value a and b write a recursive function to
// implement a^b.

public class _1PowerFunctionOptimised {

    public static int helper(int a, int b){

        if (b == 0) return 1;

        int temp = helper(a, b / 2);
        int res = temp * temp;

        if (b % 2 != 0){
            res = a * res;
        }

        return res;
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 7;
        System.out.println(helper(a, b));
    }

}
