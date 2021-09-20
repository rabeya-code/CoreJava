package evidencemonthly;

import java.util.Scanner;

public class NagetiveIntegerForSumation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Positive integer(negative integer for sumation)");

        int num = input.nextInt();
        int sum = 0;

        while (num != 0) {
            if (num == -1) {
                num = 0;
            }
            sum += num;
            num = input.nextInt();
            if (num < 0) {
                break;
            }
        }
        System.out.println("sum is : " + sum);
    }

}
