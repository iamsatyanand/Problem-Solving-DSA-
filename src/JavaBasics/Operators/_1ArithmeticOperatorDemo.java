package JavaBasics.Operators;

public class _1ArithmeticOperatorDemo {
    public static void main(String[] args) {
        int num1 = 45;
        int num2 = 5;

        num2 = num1++ + 5; // postfix increment - first compute the expression with original value and then increment

        System.out.println("num1 :"+ num1 +", num2 : "+num2);

        int num3 = 45;
        int num4 = 5;
        num4 = ++num3 + 5; // prefix increment - first increment then evaluate the expression

        System.out.println("num3 :"+ num3 +", num4 : "+num4);

        int num5 = 9;
        num5 = num5++;

        System.out.println("num5 : "+ num5);

        int num6 = 9;
        num6 = ++num6;

        System.out.println("num6 : "+ num6);

        int num7 = 9;
        num7 = num7++ + num7;

        System.out.println("num7 :"+ num7);

        int num8 = 9;
        num8 = ++num8 + num8++;

        System.out.println("num8 :"+ num8);
    }
}
