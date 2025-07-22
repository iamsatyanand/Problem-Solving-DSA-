package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first array:");
        int n = sc.nextInt();
        System.out.println("Enter the size of second array:");
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] mergedArray = mergeSortedArrays(arr1, arr2);
        System.out.println("Merged sorted array:");
        System.out.println(Arrays.toString(mergedArray));
    }
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2){
        // Create a new array to hold the merged result
        int[] mergedArray = new int[arr1.length + arr2.length];

        // Pointers for arr1, arr2 and mergedArray
        int i = 0;
        int j = 0;
        int k = 0;
        // Traverse both arrays and merge them
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                mergedArray[k] = arr1[i];
                i++;
                k++;
            }
            else{
                mergedArray[k] = arr2[j];
                j++;
                k++;
            }
        }
        // If there are remaining elements in arr1, add them
        while(i<arr1.length){
            mergedArray[k]  = arr1[i];
            i++;
            k++;
        }

        // If there are remaining elements in arr2, add them
        while(j<arr2.length){
            mergedArray[k] = arr2[j];
            j++;
            k++;
        }
        return mergedArray;
    }
}
