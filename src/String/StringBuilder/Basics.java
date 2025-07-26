package String.StringBuilder;

public class Basics {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);

        // get at index
        char ch = sb.charAt(2);
        System.out.println(ch);

        // insert in between
        sb.insert(3, 'F');
        System.out.println(sb);

        // mutability , change the same string
        sb.setCharAt(3, 'S');
        System.out.println(sb);

        // delete character at index
        sb.deleteCharAt(2);
        System.out.println(sb);

        sb.append('J');
        System.out.println(sb);

        sb.append(45);
        System.out.println(sb);

    }
}
