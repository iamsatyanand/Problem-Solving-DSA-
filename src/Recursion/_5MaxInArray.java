package Recursion;

public class _5MaxInArray {

    public static int maxVal(int[] arr, int index){
        if(index == arr.length - 1) return arr[index];

        return Math.max(arr[index], maxVal(arr, index + 1));
    }

    public static void main(String[] args) {
        int[] arr = {3, 8, 49, 86, 31};
        int val = maxVal(arr, 0);
        System.out.println(val);
    }
}
