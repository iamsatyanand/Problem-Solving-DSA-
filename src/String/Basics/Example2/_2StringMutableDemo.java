package String.Basics.Example2;

import java.io.CharArrayWriter;

public class _2StringMutableDemo {
    public static void main(String[] args) {

        // Approach 1
        StringBuilder sb = new StringBuilder();
        sb.append("World!"); // World
        sb.insert(0, "Hello "); // Hello World
        sb.deleteCharAt(4); // Hell World
        sb.insert(4, 'o'); // Hello World
        sb.setLength(5); // Hello
        sb.reverse(); // olleH
        String str = sb.toString();
        System.out.println(str);

        // Approach 2
        StringBuffer sbuffer = new StringBuffer();
        sbuffer.append("World!"); // World
        sbuffer.insert(0, "Hello "); // Hello World
        sbuffer.deleteCharAt(4); // Hell World
        sbuffer.insert(4, 'o'); // Hello World
        sbuffer.setLength(5); // Hello
        sbuffer.reverse(); // olleH
        String str1 = sbuffer.toString();
        System.out.println(str1);

        CharArrayWriter cw = new CharArrayWriter();
        cw.append("Hey ");
        cw.append("Java Lover");
        String str3 = cw.toString();
        System.out.println(str3);
    }
}
