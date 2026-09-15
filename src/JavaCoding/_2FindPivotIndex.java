package JavaCoding;

import java.util.Arrays;

/*
    https://leetcode.com/problems/find-pivot-index/description/
* */
public class _2FindPivotIndex {

    public static int pivotIndex(int[] arr){
        int totalSum = 0;
        int leftSum = 0;
        for(int i : arr){
            totalSum += i;
        }

        for(int i=0; i < arr.length; i++){
            int rightSum = totalSum - leftSum - arr[i]; // totalSum = leftSum + rightSum + arr[i]
            if(leftSum == rightSum){
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
//        int[] arr = {1,2,3,6,5,6};
        int[] arr = {1,7,3,6,5,6};
        System.out.println("Pivot Index :"+ pivotIndex(arr));
    }

}

/*
    Find the total sum of the array.
    Iterate through the array while maintaining a leftSum starting at 0.At each index i,
    the right sum is totalSum - leftSum - nums[i].
    If leftSum == rightSum, return i as your pivot index.Otherwise,
    add nums[i] to leftSum and proceed
 */
