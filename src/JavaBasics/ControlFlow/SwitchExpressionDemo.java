package JavaBasics.ControlFlow;

public class SwitchExpressionDemo {
    public static void main(String[] args) {

        String fruitName = "apple";

        String fruit = switch(fruitName) {
            case "banana", "apple" -> "$ 10 charged";
            case "grape" -> "$ 20 charged";
            default -> "Invalid fruit";
        };

        System.out.println(fruit);

        String day = "friday";

        int numLetters = switch(day) {
            case "monday", "friday", "sunday" -> {
                System.out.println(6);
                yield 6;
            }
            case "tuesday" -> {
                System.out.println(7);
                yield 7;
            }
            case "thursday", "saturday" ->{
                System.out.println(8);
                yield 8;
            }
            case "wednesday" -> {
                System.out.println(9);
                yield 9;
            }
            default -> {
                System.out.println("Invalid day");
                yield 0;
            }
        };

        System.out.println(numLetters);
    }
}
