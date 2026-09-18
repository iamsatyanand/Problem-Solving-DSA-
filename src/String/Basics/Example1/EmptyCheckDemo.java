package String.Basics.Example1;

public class EmptyCheckDemo {

    public static void main(String[] args) {
        String str = "";
        boolean isEmpty = str.isEmpty();
        boolean isLengthZero = str.length() == 0;
        boolean isEqualEmpty = "".equals(str);

        String nullString = null;
        boolean isnullEmpty = "".equals(nullString); // false
        boolean iEmptyNull = nullString.length() == 0; // NullPointerException
        boolean iEmptyNull1 = nullString.isEmpty(); // NullPointerException

        String str1 = " ";
        boolean isEmptyString = str1.isEmpty(); // false
        boolean isBlankString = str1.isBlank(); // true
    }
}
