package BinarySearch;

/***
 Problem

 Sorted array of length n .

 Every element appears once, except one element that appears twice.

 Find the repeating element.
 
 Index: 0  1  2  3  4  5  6
 Array: 3  4  5  5  6  7  8

 Ans- 5

 * **/

public class Q9FindRepeatingElementGenericSortedStartingFromAnywhere {

    public static int findDuplicate(int[] arr) {
        int lo = 0, hi = arr.length - 1;
        int base = arr[0];  // starting number (could be 0, 3, 10, etc.)

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            // 1. Check duplicate directly
            if (mid > 0 && arr[mid] == arr[mid - 1]) {
                return arr[mid];
            }

            // 2. Calculate expected value at mid
            int expected = base + mid;

            // 3. Decide which side to go
            if (arr[mid] == expected) {
                // Everything is fine till mid → go right
                lo = mid + 1;
            } else {
                // Misalignment → duplicate is on left side
                hi = mid - 1;
            }
        }
        return -1; // Should not happen if input is valid
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 1, 2, 2, 3, 4, 5, 6};
        System.out.println("Duplicate in arr1: " + findDuplicate(arr1)); // 2

        int[] arr2 = {3, 4, 5, 5, 6, 7, 8};
        System.out.println("Duplicate in arr2: " + findDuplicate(arr2)); // 5

        int[] arr3 = {10, 11, 12, 12, 13, 14};
        System.out.println("Duplicate in arr3: " + findDuplicate(arr3)); // 12
    }
}

/***
 Starts from another number (say 3)

 Array:

 Index : 0  1  2  3  4  5  6
 Array : 3  4  5  5  6  7  8


 👉 Now, Expected value at index i = arr[0] + i = 3 + i.

 Check positions:

 At i=0 → arr[0] = 3, expected = 3 ✅

 At i=1 → arr[1] = 4, expected = 4 ✅

 At i=2 → arr[2] = 5, expected = 5 ✅

 At i=3 → arr[3] = 5, expected = 6 ❌

 From here onward, every value is less than expected by 1.

 So same principle holds:

 Before duplicate: arr[i] == arr[0] + i.

 After duplicate: arr[i] < arr[0] + i.

 ✅ Insight

 If array starts at 0: expected = i.

 If array starts at k: expected = k + i.

 In both cases, the moment duplicate appears, the shift happens, and binary search can detect it.
 * ***/
