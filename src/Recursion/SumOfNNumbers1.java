package Recursion;

public class SumOfNNumbers1 {
    public static void main(String[] args) {

        int n = 5;
        sumOfNNumbers(n, 0);

    }

    private static void sumOfNNumbers(int n, int sum) {
        if(n < 1) {
            System.out.println("Sum  is: " + sum);
            return;
        }
        sumOfNNumbers(n -1, sum+n);


    }
}
