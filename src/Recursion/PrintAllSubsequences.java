package Recursion;
import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsequences {

    public static void main(String[] args) {
        int [] arr = {3, 1, 2};

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        findSubsequences(arr, 0, current, result);

        System.out.println("Subsequences are :"+ " " + result);
    }

    public static void findSubsequences(int [] arr, int index, List<Integer> current, List<List<Integer>> result){

        if(index >= arr.length){
//            result.add(current); You're adding a reference to the current list. Since current is reused and modified (add/remove) during recursion (backtracking), all entries in result will point to the same object, and you'll end up with many identical lists at the end.
            result.add(new ArrayList<>(current));
            return;
        }

        current.add(arr[index]);
        findSubsequences(arr, index+1, current, result);

        current.remove(current.size() - 1);
        findSubsequences(arr, index + 1, current, result);
    }
}
