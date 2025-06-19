package Recursion;

public class ReverseOfAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverseArray(arr, 0, arr.length - 1);
        for(int item : arr){
            System.out.print(item+" ");
        }
        System.out.println();
    }

    public static void reverseArray(int[] arr, int start, int end){


        // Base case: if start index is greater than or equal to end index, return
        if(start >= end){
            return;
        }
        // Swapping the elements at start and end indices
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverseArray(arr, start + 1, end - 1);
    }
}
