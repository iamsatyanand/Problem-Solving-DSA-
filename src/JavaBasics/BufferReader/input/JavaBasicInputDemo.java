package JavaBasics.BufferReader.input;

import java.io.IOException;

public class JavaBasicInputDemo {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter a value...");

        int num = System.in.read(); // it only evaluates single character even if we pass multi digit or multiple character
        // also it returns ASCII value

        System.out.println("value is: "+num);
    }
}
