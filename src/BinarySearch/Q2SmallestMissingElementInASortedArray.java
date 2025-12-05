package BinarySearch;

import java.util.Scanner;

/**
 * Given a sorted array of non-negative distinct integers, find the smallest missing non-negative element in it.
 *
 * The image also provides three examples to illustrate the problem.
 *
 * Input: nums[] = [0, 1, 2, 6, 9, 11, 15]
 * Output: The smallest missing element is 3.
 *
 * Input: nums[] = [1, 2, 3, 4, 6, 9, 11, 15]
 * Output: The smallest missing element is 0.
 *
 * Input: nums[] = [0, 1, 2, 3, 4, 5, 6]
 * Output: The smallest missing element is 7.
 * **/

public class Q2SmallestMissingElementInASortedArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int arr[] = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

//        int missingNumber = findMissingElementBruteForce(arr);
        int missingNumber = findMissingElementOptimised(arr);
        if(missingNumber != -1){
            System.out.println("Missing number is : "+missingNumber);
        }
        else{
            System.out.println("No number is missing");
        }
    }

    public  static int findMissingElementBruteForce(int arr[]){
        int expectedNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != expectedNumber){
                return i;
            }
            expectedNumber += 1;
        }
        return -1;
    }

    public static int findMissingElementOptimised(int arr[]){
        int answer = arr.length; // if everything is present as per the condition
        // and our low and high gets exhausted then this will be beneficial
        int low = 0;
        int high = arr.length - 1;

        while(low <= high){

            int mid = (low + high) / 2;

            if(arr[0] != 0){
                answer = 0;
            }
            if(arr[mid] > mid){
                answer = mid;
                high = mid - 1;
            } else if (arr[mid] == mid) {
                low = mid + 1;
            }
        }
        return answer;
    }
}
