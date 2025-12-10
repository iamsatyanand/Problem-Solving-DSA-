package Basics;

import java.util.Scanner;

public class NthFibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        int first_num = 0;
        int sec_num = 1;

        while(count < n){
            System.out.println(first_num);
            int sum = first_num + sec_num;
            first_num = sec_num;
            sec_num = sum;
            count ++;
        }

    }
}
