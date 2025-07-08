package Recursion;

public class FibonacciSeries {

    public static void main(String[] args) {
        int n = 9;

        System.out.println("Fibonacci series up to " + n + " terms:");

        int result = fibonacci(n);
        System.out.println("Fibonacci of " + n + " is: " + result);
    }

    public static int fibonacci(int n){

        if(n <= 1){
            return n;
        }

        int last = fibonacci(n - 1);
        int secondLast = fibonacci(n - 2);

        return last + secondLast;
    }
}
