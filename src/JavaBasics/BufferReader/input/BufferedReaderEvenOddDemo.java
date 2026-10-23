package JavaBasics.BufferReader.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEvenOddDemo {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter a value...");
        int num = Integer.parseInt(br.readLine());
        if(num % 2 == 0){
            System.out.println(num + " 123is even");
        }
        else{
            System.out.println(num + " is odd");
        }
    }
}
