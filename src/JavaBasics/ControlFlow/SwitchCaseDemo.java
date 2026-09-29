package JavaBasics.ControlFlow;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        String fruitName = "banana";

        switch (fruitName){
            case "mango":
                System.out.println("mango it is");
                break;
            case "banana":
                System.out.println("banana it is");
                break;
            case "apple":
                System.out.println("apple it is");
                break;
            case "grapes":
                System.out.println("grapes it is");
                break;

        }


        switch (fruitName){
            case "mango":
            case "banana":
                System.out.println("$ 10 charged");
                break;
            case "apple":
                System.out.println("$ 20 charged");
                break;
        }
    }
}
