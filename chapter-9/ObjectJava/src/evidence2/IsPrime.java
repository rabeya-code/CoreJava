package evidence2;

import java.util.Scanner;

public class IsPrime {

    public static void main(String[] agrs) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a positive Integer : ");
        int num = input.nextInt();

        int count = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println(num + " it's prime number.");
        } else {
            System.out.println(num + " it's not prime number.");
        }
    }
}
