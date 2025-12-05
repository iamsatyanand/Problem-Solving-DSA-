package BinarySearch;
// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
public class Q5Leetcode81 {

    class Solution {
        public boolean search(int[] nums, int target) {

            int low = 0;
            int high = nums.length - 1;

            while(low <= high){
                int mid = low + (high - low)/2;

                if(nums[mid] == target){
                    return true;
                }

                if(nums[low] == nums[mid] && nums[mid] == nums[high]){
                    low += 1;
                    high -= 1;
                    continue;
                }

                if(nums[mid] >=  nums[low]){
                    // upper curve

                    if(target >= nums[low] && target < nums[mid]){
                        high = mid - 1;
                    }
                    else{
                        low = mid + 1;
                    }

                }
                else{
                    // lower curve

                    if(target > nums[mid] && target <= nums[high]){
                        low = mid + 1;
                    }
                    else{
                        high = mid - 1;
                    }
                }
            }

            return false;

        }
    }
}
