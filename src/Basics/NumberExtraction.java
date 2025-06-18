package Basics;

public class NumberExtraction {

    public static void main(String[] args) {

        int num = 7894;

        while(num > 0){
            int lastDigit = num % 10;
            System.out.print(lastDigit + " ");
            num = num / 10;
        }
        System.out.println();

    }
}

// Output : 4 9 8 7
