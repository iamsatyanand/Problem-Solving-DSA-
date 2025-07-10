package Sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {93, 12, 45, 67, 89, 2, 54, 76, 33, 100, 5, 88, 0, 34, 21, 1, 99, 38, 77, 50};
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortArray(int[] arr) {
        for(int i=0; i < arr.length; i++){
            int maxValueIndex = 0;
            for(int j = 0; j <= arr.length - i - 1; j++){
                if(arr[j] > arr[maxValueIndex]){
                    maxValueIndex = j;
                }
            }
            int temp = arr[arr.length - i - 1];
            arr[arr.length - i - 1] =  arr[maxValueIndex];
            arr[maxValueIndex] = temp;
        }
    }


}
