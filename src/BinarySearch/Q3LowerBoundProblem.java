package BinarySearch;

import java.util.Scanner;

/**
 Problem Statement (Lower Bound Problem)

 You are given an array of integers arranged in ascending order and a value x.
 Your task is to find the index of the first element in the array which is greater than or equal to x.

 Examples

 Example 1:
 Input: arr = [1, 2, 2, 3, 3, 3, 5, 5], x = 3
 Output: 3
 Explanation: The first occurrence of an element ≥ 3 is at index 3 (0-based indexing).

 Example 2:
 Input: arr = [1, 2, 2, 3, 3, 3, 5, 5], x = 4
 Output: 6
 Explanation: The first element ≥ 4 is 5, which is at index 6.

 Example 3:
 Input: arr = [1, 2, 2, 3, 3, 3, 5, 5], x = 5
 Output: 6
 Explanation: The first element ≥ 5 is at index 6.
 * */

public class Q3LowerBoundProblem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = scan.nextInt();
        }
        int search_val = scan.nextInt();
        int index_val = search(arr, length, search_val);
        System.out.println(index_val);
    }

    public static int search(int[] arr, int length, int search_val){
        int low = 0;
        int high = length - 1;
        int ans = length;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] < search_val){
                low = mid + 1;
            }
            else{
                ans = mid;
                high = mid - 1;
            }
        }
        return ans;
    }
}
