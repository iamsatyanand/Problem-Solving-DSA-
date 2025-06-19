package Recursion;

public class ReverseOfAnArray1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        reverseArray(arr, 0);
        for(int item : arr){
            System.out.print(item + " ");
        }
    }

    private static void reverseArray(int[] arr, int i) {
        if(i >= arr.length - i -1) return;

        // Swapping the elements at index i and arr.length - i - 1
        int temp = arr[i];
        arr[i] = arr[arr.length - i - 1];
        arr[arr.length - i - 1] = temp;

        reverseArray(arr, i + 1);
    }
}
