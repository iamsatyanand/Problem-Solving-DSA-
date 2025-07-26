//package Sorting;
//
//import java.util.Scanner;
//
//// Merge Sort is a divide-and-conquer algorithm
//// that sorts an array by recursively dividing it into halves,
//// sorting each half, and then merging the sorted halves back together.
//// It has a time complexity of O(n log n) and is stable,
//// meaning it preserves the order of equal elements.
//// It is often used for large datasets and linked lists.
//// It is not an in-place sorting algorithm,
//// as it requires additional space for the temporary arrays used during merging.
////example how it works:
//// 1. Split the array into halves until each half has one element.
//// 2. Merge the halves back together in sorted order.
////
//public class MergeSort {
//
//    public static void main(String[] args) {
//        // Taking input from user
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the size of the array:");
//        int n = scan.nextInt();
//        System.out.println("Enter the elements of the array:");
//        // Create an array of size n
//        int[] arr = new int[n];
//        for(int i=0; i<n; i++){
//            arr[i]  = scan.nextInt();
//        }
//        // Call the mergeSort function to sort the array
//        int low = 0;
//        int high = n -1;
//        int [] sortedArray = mergeSort(arr, low, high);
//    }
//
//    public static int[] mergeSort(int[] arr, int low, int high){
//        // base case: if the array has one or zero elements, it is already sorted
//        if(low >= high){
//            int[] newArray = new int[1];
//            newArray[0] = arr[low]; // or arr[high], since low == high
//            return newArray;
//        }
//        // Recursive case: split the array into halves and sort each half
//        int mid = low + (high - low) / 2;
//
//        // Recursively sort the left half
//        int[] leftArray = mergeSort(arr, low, mid);
//
//        // Recursively sort the right half
//        int[] rightArray = mergeSort(arr, mid+1, high);
//
//        // Merge the two sorted halves
//        int[] mergedArray = mergeSortedArray(leftArray, rightArray);
//        return mergedArray;
//    }
//
////    public static
//
//}
