package BinarySearch;

public class Q1BinarySearch {
        // Main method to test the search
    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 7, 9, 11, 13}; // Sorted array
        int target = 7;

        int result = search(nums, target);

        if (result != -1) {
            System.out.println("Element " + target + " found at index: " + result);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }

    public static int  search(int[] nums, int target) {
        int n = nums.length;
        int lo = 0 ;
        int hi= n-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return -1;

    }
}


// TC - O(log N)
// SC - O(1)
