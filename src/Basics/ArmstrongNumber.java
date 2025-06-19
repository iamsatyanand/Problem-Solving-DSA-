package Basics;

public class ArmstrongNumber {
    public static void main(String[] args) {

        int num = 153;
        int originalNum = num;
        int sum = 0;

        //Counting the number of digits
        int count = 0;
        int temp = num;
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }
        //Calculating the sum of the cubes of each digit
        while (num > 0) {
            int lastDigit = num % 10;
            sum += (int) Math.pow(lastDigit, count);
            num = num / 10;
        }
        //Checking if the sum is equal to the original number


        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
}
