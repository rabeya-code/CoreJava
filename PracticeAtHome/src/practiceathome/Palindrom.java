package practiceathome;

import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a palindrom number :");
        System.out.println("=================");
        int num = input.nextInt();
        System.out.println("=================");
        int sum = 0;
        int temp = num;
        while (temp != 0) {
            int r = temp % 10;
            sum = sum * 10 + r;
            temp = temp / 10;
        }

        if (num == sum) {
            System.out.println(num + " It's a palindrom number .");
        } else {
            System.out.println(num + " It's not a palindrom number .");
        }
    }
}
