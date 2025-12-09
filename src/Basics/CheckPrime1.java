package Basics;

import java.util.Scanner;

public class CheckPrime1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int flag = 0;

        int div = 2;
        int count = 0;
        while(div * div < num){
            count +=1;
            System.out.println(count);
            if(num % div == 0){
                flag = 1;
                break;
            }
            div++;
        }

        if(flag == 0){
            System.out.println(num + " is prime");;
        }
        else{
            System.out.println(num + " is not prime");
        }

    }
}
