package Basics;

public class CountNumberOfDigits {

    public static void main(String[] args) {

        int num = 7894456;
        int count = 0;

        while(num > 0){
            int lastDigit = num % 10;
            count += 1;
            num = num / 10;
        }

        System.out.println(count);

    }
}
