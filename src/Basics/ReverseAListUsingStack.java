package Basics;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class ReverseAListUsingStack {

    public static void reverseUsingStack(List<Integer> list) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (Integer num : list) {
            stack.push(num);   // same as addFirst
        }

        for (int i = 0; i < list.size(); i++) {
            list.set(i, stack.pop());
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        reverseUsingStack(list);
        System.out.println(list); // [5, 4, 3, 2, 1]
    }
}
