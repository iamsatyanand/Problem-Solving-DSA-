package TwoPointer;

    /*
    Problem Statement:
    Given an array of integers arr and a positive integer k,
    find the maximum sum of any contiguous (consecutive) subarray of size exactly k.
    Input: arr = [-1, 2, 3, 3, 4, 5, -1], k = 4
    Output: 15
    [3, 3, 4, 5] -> Sum = 15 (Maximum)
    */

public class BruteForceApproach {

    public static void main(String[] args) {
        int[] arr = {-1, 2, 3, 3, 4, 5, -1};
        int k = 4;
        int result = maximumSum(arr, k);
        System.out.println(result); // Outputs: 15
    }

    public static int maximumSum(int[] arr, int k){
        // Edge case handling
        if (arr == null || arr.length < k || k <= 0) {
            return 0;
        }

        int maxSum = Integer.MIN_VALUE;

        // Outer loop establishes the start point of each window
        for (int i = 0; i <= arr.length - k; i++) {
            int sum = 0;

            // Inner loop calculates the sum of exactly k elements
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }

            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}
