package String.Basics.Example1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JAVAJoinAndSplitBaeldung {
    // https://www.baeldung.com/java-join-and-split

    // https://www.baeldung.com/category/java/java-array

    // https://www.baeldung.com/tag/java-stream-basics

    // https://www.baeldung.com/category/java/java-collections

    // https://www.baeldung.com/java-join-and-split

    // https://www.baeldung.com/java-stream-to-list-collecting

    // https://www.baeldung.com/category/java/java-streams

    // https://www.baeldung.com/tag/java-collectors

    // https://www.baeldung.com/category/java-map/tag/java-collectors

    // https://www.baeldung.com/category/java/java-list

    // https://www.baeldung.com/category/java/java-streams


    public static void main(String[] args) {

        String input = "Interview preparation with Baeldung";

        // 1. Split into words
        String[] words = input.split(" ");

        // 2. Reverse the array in-place
        int left = 0, right = words.length - 1;
        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }

        // 3. Join them back together
        String result = String.join(" ", words);
        System.out.println(result);
        // Output: Baeldung with preparation Interview

//        **********************************

        String messyInput = "Java    is   highly    demanded  in 2026";

        // "\\s+" matches ONE or MORE consecutive whitespace characters (spaces, tabs)
        String[] words1 = messyInput.split("\\s+");

        String cleanOutput = String.join(",", words1);
        System.out.println(cleanOutput);
        // Output: Java,is,highly,demanded,in,2026


        // *********************************

        String input1 = "apple, ,  banana , orange, , grape";

        String result2 = Arrays.stream(input1.split(","))
                .map(String::trim)                         // Trim whitespace
                .filter(word -> !word.isEmpty())           // Filter out empty strings
                .map(String::toUpperCase)                  // Convert to Uppercase
                .collect(Collectors.joining("-"));         // Stream's version of Join

        System.out.println(result2);
        // Output: APPLE-BANANA-ORANGE-GRAPE
    }
}
