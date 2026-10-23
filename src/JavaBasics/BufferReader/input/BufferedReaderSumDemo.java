package JavaBasics.BufferReader.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderSumDemo {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter 1st number :");
        int num1 = Integer.parseInt(br.readLine());

        System.out.println("Enter 2nd number :");
        int num2 = Integer.parseInt(br.readLine());

        int sum = num1 + num2;
        System.out.println("Sum is : "+sum);

    }
}
