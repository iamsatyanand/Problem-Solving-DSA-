package Basics;

public class ReverseOfaNmber {

    public static void main(String[] args) {

        int num = 78945;
        int reverseDigit = 0;

        while(num > 0){

            int lastDigit = num % 10;
            num = num / 10;
            reverseDigit = reverseDigit * 10 + lastDigit;
        }

        System.out.println(reverseDigit);
    }
}
