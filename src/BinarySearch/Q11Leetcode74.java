package BinarySearch;
//https://leetcode.com/problems/search-a-2d-matrix/description/
public class Q11Leetcode74 {

    /**
     * Approach 1: Brute Force
     * Time Complexity: O(m * n)
     * Space Complexity: O(1)
     */
    public static boolean searchMatrixBruteForce(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int m = matrix.length;    // number of rows
        int n = matrix[0].length; // number of columns

        // Iterate through every element of the matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }

        return false;
    }

    // -------------------------------------------------------------------

    /**
     * Approach 2: Optimization - Binary Search on Every Row
     * Time Complexity: O(m * log(n))
     * Space Complexity: O(1)
     */
    public static boolean searchMatrixBinarySearchPerkRow(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        // Iterate through each row and apply binary search
        for (int[] row : matrix) {
            if (binarySearch(row, target)) {
                return true;
            }
        }

        return false;
    }

    // Helper function for standard Binary Search on a 1D array
    private static boolean binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    // -------------------------------------------------------------------

    /**
     * Approach 3: Most Optimal - Single Binary Search (as shown in image_bf6970.png)
     * Treats the 2D matrix as a single sorted 1D array of size m*n.
     * The mapping from 1D index (mid) to 2D coordinates (row, col) is:
     * row = mid / n
     * col = mid % n
     *
     * Time Complexity: O(log(m * n))
     * Space Complexity: O(1)
     */
    public static boolean searchMatrixOptimal(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int m = matrix.length;      // no of rows
        int n = matrix[0].length;   // no of cols

        // The search space is [0, m*n - 1]
        int lo = 0;
        int hi = m * n - 1;

        while (lo <= hi) {
            // Standard way to calculate mid to prevent overflow
            int mid = lo + (hi - lo) / 2;

            // Map the 1D index 'mid' to its 2D coordinates
            int row = mid / n;
            int col = mid % n;

            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                // Target is in the right half (higher indices)
                lo = mid + 1;
            } else {
                // Target is in the left half (lower indices)
                hi = mid - 1;
            }
        }

        return false;
    }

    /**
     * Main method for demonstration.
     */
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target1 = 16; // Target present
        int target2 = 13; // Target not present

        System.out.println("--- Search Target: " + target1 + " (Expected: true) ---");

        // Function Call 1: Brute Force
        boolean result1_bf = searchMatrixBruteForce(matrix, target1);
        System.out.println("Brute Force Result: " + result1_bf);

        // Function Call 2: Binary Search Per Row
        boolean result1_bspr = searchMatrixBinarySearchPerkRow(matrix, target1);
        System.out.println("BS Per Row Result: " + result1_bspr);

        // Function Call 3: Optimal Single Binary Search
        boolean result1_optimal = searchMatrixOptimal(matrix, target1);
        System.out.println("Optimal Result: " + result1_optimal);

        System.out.println("\n--- Search Target: " + target2 + " (Expected: false) ---");

        // Function Call 4: Brute Force (Target not present)
        boolean result2_bf = searchMatrixBruteForce(matrix, target2);
        System.out.println("Brute Force Result: " + result2_bf);

        // Function Call 5: Binary Search Per Row (Target not present)
        boolean result2_bspr = searchMatrixBinarySearchPerkRow(matrix, target2);
        System.out.println("BS Per Row Result: " + result2_bspr);

        // Function Call 6: Optimal Single Binary Search (Target not present)
        boolean result2_optimal = searchMatrixOptimal(matrix, target2);
        System.out.println("Optimal Result: " + result2_optimal);
    }
}

