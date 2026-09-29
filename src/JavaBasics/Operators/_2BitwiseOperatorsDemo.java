package JavaBasics.Operators;

public class _2BitwiseOperatorsDemo {
    public static void main(String[] args) {
        int x = 9;
        int y = ~x;
        System.out.println(y); // -10

        int x1 = 10;
        int y1 = 6;
        int z1 = x1 & y1;
        System.out.println(z1); // 2

        int z2 = x1 | y1;
        System.out.println(z2); //14

        int z3 = x1 ^ y1;
        System.out.println(z3); //12

        int z4 = x1 << y1;
        System.out.println(z4); // x1 * 2^y1 = 10 * 2 power 6 = 10 * 64 = 640

        int z5 = 12 << 4;
        System.out.println(z5); // 12 * 2^4 = 192

        int x2 = 50;
        int x3 = -50;

        int z6 = x2 >> 3;
        System.out.println(z6); // 6

        int z7 = x3 >> 3;
        System.out.println(z7); // -7

        int z8 = x1 >>> 2;
        System.out.println(z8); //2


    }
}
