package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintSubsequencesWhoseSumIsK {

    public static void main(String[] args) {
        int[] arr = {1, 2 , 1};
        int k = 2;

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        findSubsequences(arr, 0, k, 0, current, result);

        System.out.println(result);
    }

    public static void findSubsequences(int[] arr, int index, int k, int sum, List<Integer> current, List<List<Integer>> result)
    {
        if(index >= arr.length){
            if(k == sum){
                result.add(new ArrayList<>(current));
            }
            return;
        }

        current.add(arr[index]);
        sum += arr[index];
        findSubsequences(arr, index + 1, k, sum, current, result);

        current.remove(current.size() - 1);
        sum -= arr[index];
        findSubsequences(arr, index + 1, k, sum, current, result);

    }


}
