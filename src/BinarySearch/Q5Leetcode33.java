package BinarySearch;
//https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class Q5Leetcode33 {

    public int search(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while(low <= high){

            int mid = low + (high - low)/2;
            System.out.println(mid);

            if(nums[mid] == target){
                System.out.println(mid);
                return mid;
            }

            if(nums[low] <= nums[mid] ){
                // upper curve
                if(nums[low] <= target && target < nums[mid]){
                    // discard right
                    high = mid - 1;
                }
                else{
                    // discard left

                    low = mid + 1;
                    System.out.println("low : "+ low);
                }
            }
            else{
                // lower curve
                if(nums[mid] < target && target <= nums[high]){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                    System.out.println("high : "+ high);
                }
            }

        }

        return -1;

    }

}


/***?
 Rotated Sorted Array → Upper Curve & Lower Curve

 When an ascending array is rotated, it looks like two sorted “curves” joined together:

 Upper Curve → The left part (before rotation point).

 Lower Curve → The right part (after rotation point).

 Example:
 Original sorted = [0,1,2,4,5,6,7]
 Rotated at pivot = 3 → [4,5,6,7,0,1,2]

 Upper curve = [4,5,6,7]

 Lower curve = [0,1,2]

 🔹 Binary Search Strategy

 At each step, we check mid and decide:

 If nums[mid] == target → return mid ✅

 Determine which curve mid lies in

 If nums[mid] >= nums[lo] (Condition for upper curve) → mid is in the upper curve (left half sorted).

 Else ( i.e. If nums[mid] < nums[lo]  it is in lower curve) → mid is in the lower curve (right half sorted).

 Now check if the target lies in that sorted region:

 Upper curve (left part sorted):

 If target lies between [nums[lo], nums[mid]) → keep left, discard right (hi = mid - 1).

 Else → keep right (lo = mid + 1).

 Lower curve (right part sorted):

 If target lies between (nums[mid], nums[hi]] → keep right (lo = mid + 1).

 Else → keep left (hi = mid - 1).

 i.e all element greater than arr[lo] is in upper curve
 and all element less than arr[lo] is in lower curve

 if we are at upper curve
    if target doesnot lies between arr of low to mid
        then discard left part which is of upper curve
        go for right part

 if mid is there in lower curve i.e. If nums[mid] < nums[lo]
  compare that target lies between arr of mid to high or not
 if yes then discard left half
    here also check arr of mid < arr of lo
        if yes
 */
