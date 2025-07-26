package String.StringBuilder;

public class StringVsStringBuilder {

    public static void main(String[] args) {
        int n = 10;
//
        long starttime = System.currentTimeMillis();
//        String s = "";
//        for (int i = 0; i < n; i++) {
//            s += i;
//        }
//
//

        /**
         In Java, String objects are immutable and stored in the heap memory.
         Concatenating strings in a loop (e.g., s += i;) creates a new String object in the heap each time.
         The reference variable s is stored on the stack and always points to the latest String object.
         Stack memory usage remains almost unchanged; only the reference is updated.
         Heap memory usage increases significantly due to many temporary String objects.
         This approach is inefficient and can lead to high memory consumption and slow performance.
         Using StringBuilder is recommended for efficient string concatenation, as it avoids creating multiple intermediate objects.

         Time Complexity:
         The loop runs n times.
         Each s += i; creates a new String by copying the old string and appending the new value.
         On the (k)-th iteration, the string length is about the sum of all previous appended values, so total time is (O(n^2)).
         Space Complexity:
         Each new String is stored in the heap until garbage collected.
         At peak, the largest string is of length proportional to the sum of all appended values, so space is (O(n^2)) (since the final string contains all digits from 0 to (n-1)).

         * **/


        // USING STRING BUILDER

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(i);
        }


        long endTime = System.currentTimeMillis();

        long duration = endTime - starttime;

        System.out.println(duration);

    }
}
