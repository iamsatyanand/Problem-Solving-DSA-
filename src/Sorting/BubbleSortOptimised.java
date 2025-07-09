package Sorting;

import java.util.Arrays;

public class BubbleSortOptimised {
    public static void main(String[] args) {
        int[] arr = {3,4,2,1,8,6};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void bubble(int[] arr){
        boolean swapped;
        for(int i=0; i<= arr.length - 1; i++){
            swapped = false;
            for(int j=1; j<= arr.length - i -1; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }
    }
}
