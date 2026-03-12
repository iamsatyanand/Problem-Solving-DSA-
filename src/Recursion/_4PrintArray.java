package Recursion;

public class _4PrintArray {

    public static void printArr(int[] arr, int index){
        if(index >= arr.length) return;

        System.out.println(arr[index]);
        printArr(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {31,22,12,4,6,89};
        printArr(arr,0);
    }
}
