package String.Basics.Example1;

import java.util.Arrays;

public class StringSplitDemo {

    public static void main(String[] args) {

        String fruits = "apple,orange,banana,grape";
        String[] fruitArray = fruits.split(",");

        for(String fruit : fruitArray){
            System.out.println(fruit);
        }

        System.out.println(Arrays.toString(fruitArray));
    }
}
