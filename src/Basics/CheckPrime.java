package Basics;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        int count = 0;
        for(int div = 2; div * div <= val; div++ ){
            if(val % div == 0){
                count++;
                break;
            }
        }
        System.out.println(count);
        if(count != 0){
            System.out.println(val+" Not prime");
        }
        else{
            System.out.println(val+" Is prime");
        }
        /**
         * we assume it is divisible by 1 and itself
         * we just have to check that from 2 to sqrt (val0 is there any divisor
         * if yes then there will be 3 divisors 1, val, div count
         counting how many numbers between 2 and sqrt(val) divide val exactly.
         If none do, the number is prime; otherwise, it is not.
        **/

    }
}
