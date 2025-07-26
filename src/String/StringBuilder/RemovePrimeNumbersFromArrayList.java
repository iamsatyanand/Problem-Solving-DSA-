package String.StringBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemovePrimeNumbersFromArrayList {

    public static boolean isPrime(int value){
        for(int div = 2; div * div <= value; div++){
            if(value % div == 0){
                return false;
            }
        }
        return true;
    }

    public static void removePrimeFromList(List<Integer> list){
        for(int i = list.size() - 1; i >= 0; i--){
            if(isPrime(list.get(i))){
                list.remove(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfArraylist = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < sizeOfArraylist; i++) {
            list.add(sc.nextInt());
        }
        removePrimeFromList(list);
        System.out.println(list);
    }
}
