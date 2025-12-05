package BinarySearch;

/**
 Question

 You are given a sorted array of length n containing integers in the range [0, n-2].

 Every element is present exactly once,

 Only one element is present twice.

 Your task is to find the repeating element.
 Index : 0  1  2  3  4  5  6  7
 Array : 0  1  2  2  3  4  5  6

 Ans - 2
 **/

public class Q8FindRepeatingElementStartingFrom0SortedArr {

    public static int findDuplicate(int[] arr) {
        int lo = 0, hi = arr.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] == mid - 1) {
                if (arr[mid] == arr[mid - 1]) {
                    return arr[mid];
                }
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return -1; // no duplicate found
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 4, 5, 6};
        System.out.println(findDuplicate(arr));  // Output: 4
    }
}


/***
 Logic & Visualization

 We use Binary Search to solve this efficiently in O(log n) time and O(1) space.

 Key Observations

 In a perfectly valid sorted array without duplicates:

 arr[i] == i for all i.

 Example: [0,1,2,3,4,5,6].

 When a duplicate appears, this property breaks:

 Example: [0,1,2,2,3,4,5,6]

 At index 3, we expect arr[3] = 3, but arr[3] = 2.

 We use binary search on the index–value relationship.

 In an ideal array (without duplicates):

 arr[i] == i always.

 Example: [0,1,2,3,4,5,6].

 When a duplicate exists, from that point onwards:

 arr[i] < i (because one number shifted the alignment).

 Binary Search Logic

 Let mid = (lo + hi) / 2.

 Case 1:

  arr[mid] == mid - 1

 Means the duplicate is at or before mid.

 Because once a number is duplicated, all indices shift by +1.

 So move left.

 Before moving, check if arr[mid] == arr[mid-1] → If true, then arr[mid] is the duplicate.

 Case 2:

  arr[mid] == mid

 Means till this mid, everything is aligned correctly.

 The duplicate must be in the right half.

 So move right.

 Step-by-step Flow

 Compute mid.

 If arr[mid] == arr[mid-1] → return arr[mid].

 Else if arr[mid] == mid - 1 → move left (hi = mid - 1).

 Else → move right (lo = mid + 1).

 Time Complexity

 O(log n) (binary search)

 O(1) (no extra space)

  Shortcut Note

 If arr[mid] == mid → go right

 Else → go left

 But always check duplicate condition arr[mid] == arr[mid-1] first.

 * ***/
