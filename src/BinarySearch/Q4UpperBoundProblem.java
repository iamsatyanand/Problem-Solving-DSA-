package BinarySearch;

import java.util.Scanner;

/***
 You are given an array of integers arranged in ascending order and a value x.
 Your task is to find the index of the first element in the array which is strictly greater than x.

 Examples

 Example 1:
 Input: arr = [1, 2, 2, 3, 3, 3, 5, 5], x = 3
 Output: 6
 Explanation: The first element strictly greater than 3 is 5, which is at index 6.

 Example 2:
 Input: arr = [1, 2, 2, 3, 3, 3, 5, 5], x = 4
 Output: 6
 Explanation: The first element strictly greater than 4 is 5, at index 6.

 Example 3:
 Input: arr = [1, 2, 2, 3, 3, 3, 5, 5], x = 5
 Output: 8 (or "not found" if we go out of bounds)
 Explanation: There is no element strictly greater than 5 in the array. If implementing in code, it typically returns the length of the array.
 */

public class Q4UpperBoundProblem {

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
        int high  = length - 1;
        int ans = length;
        while (low <= high){
            int mid = low + (high - low)/2;

            if(arr[mid] <= search_val){
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
