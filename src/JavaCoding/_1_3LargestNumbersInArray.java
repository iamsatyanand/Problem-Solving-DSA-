package JavaCoding;

import java.util.Scanner;

/**
 find three largest numbers in array without using predefined functions
 */
public class _1_3LargestNumbersInArray {

    public static void largestNumbers(int[] arr){

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;
        if(arr.length <= 0) return;
        for(int i=0; i<arr.length; i++){

            if(arr[i] > firstLargest){
                thirdLargest = secondLargest;
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
            else if (arr[i] > secondLargest && arr[i] != firstLargest){
                thirdLargest = secondLargest;
                secondLargest = arr[i];
            }
            else if(arr[i] > thirdLargest && arr[i] != secondLargest && arr[i] != firstLargest){
                thirdLargest = arr[i];
            }
        }
        System.out.println("first largest number: "+ firstLargest);
        System.out.println("second largest number: "+ secondLargest);
        System.out.println("third largest number: "+ thirdLargest);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for(int i=0; i < length; i++){
            arr[i] = sc.nextInt();
        }

        largestNumbers(arr);

    }

}
