package Exception;

import java.util.Scanner;

public class Quitient {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two number : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        try {
            int result = quotient(num1, num2);
            System.out.println("Result : " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Sum : " + (num1 + num2));
        System.out.println("Multi : " + (num1 * num2));
    }

    public static int quotient(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divided by zero ");
        }
        return a / b;
    }
}
