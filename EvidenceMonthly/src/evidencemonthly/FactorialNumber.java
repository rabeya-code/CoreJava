package evidencemonthly;

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number for factorial value :");

        int num = input.nextInt();
        int fac = 1;

        if (num != 0) {
            for (int i = 1; i <= num; i++) {
                fac = fac * i;
            }
            System.out.println("=============================");
            System.out.println(num + " factorial value is :" + fac);
        }
    }

}
