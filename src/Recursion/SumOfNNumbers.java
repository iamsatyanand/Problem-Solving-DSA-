package Recursion;

public class SumOfNNumbers {

    // Function to calculate the sum of first n natural numbers using recursion
    public static void main(String[] args) {

        int n = 5; // Example input
        int sum = sumOfNNumbers(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);

    }

    private static int sumOfNNumbers(int n) {
        // Base case: if n is 0, return 0
        if (n == 0) {
            return 0;
        }
        // Recursive case: sum of n and the sum of first (n-1) natural numbers
        return n + sumOfNNumbers(n - 1);
    }
}
