package BkashApp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter bkash code (247) :");
        int code = input.nextInt();
        int bcode = 247;
        if (code != bcode) {
            System.out.println("Invalid code.");
        }
        if (code == bcode) {
            System.out.println("1.Send Money");
            System.out.println("2.Mobile Recharge");
            System.out.println("3.Cash Out");
            System.out.println("4.My bkash");

            System.out.println("Enter your number for next step :");
            int num1 = input.nextInt();

            int totalBalance = 10000;
            int bkashpin = 22113;

            int cashOutAmont = 0;
            int rechargeAmount = 0;
            int sendMoney = 0;
            int bpin = 0;

            if (num1 == 1) {
                System.out.println("Enter send amount: ");
                sendMoney = input.nextInt();
                System.out.println("Enter Mobile number : ");
                int sendNum = input.nextInt();
                System.out.println("Enter your bkash pin :");
                bpin = input.nextInt();
                if (bpin == bkashpin) {
                    System.out.println("Work successfully....");
                    System.out.println("Total balance : " + totalBalance);
                } else {
                    System.out.println("Invalid pin ");
                }
            }

            if (num1 == 2) {
                System.out.println("Enter recharge amount: ");
                rechargeAmount = input.nextInt();
                System.out.println("Enter recharge number : ");
                int rechargeNumber = input.nextInt();
                System.out.println("Enter your bkash pin :");
                bpin = input.nextInt();
                if (bpin == bkashpin) {
                    System.out.println("Work successfully....");
                    System.out.println("Total balance : " + totalBalance);
                } else {
                    System.out.println("Invalid pin ");
                }
            }

            if (num1 == 3) {
                System.out.println("Enter CashOut amount: ");
                cashOutAmont = input.nextInt();
                System.out.println("Enter mobile number : ");
                int cashOutNumber = input.nextInt();
                System.out.println("Enter your bkash pin :");
                bpin = input.nextInt();
                if (bpin == bkashpin) {
                    System.out.println("Work successfully....");
                    System.out.println("Total balance : " + totalBalance);
                } else {
                    System.out.println("Invalid pin ");
                }
            }

            if (num1 == 4) {
                System.out.println("1.Check balance.");
                System.out.println("2.Help line.");

                int num2 = input.nextInt();
                if (num2 == 1) {
                    System.out.println("Enter your bkash pin :");
                    bpin = input.nextInt();

                    if (bpin == bkashpin) {
                        totalBalance = totalBalance - (sendMoney + rechargeAmount + cashOutAmont);
                        System.out.println("Total balance : " + totalBalance);
                    } else {
                        System.out.println("Invalid pin ");
                    }
                }

            }

            if (bpin == bkashpin) {
                totalBalance = totalBalance - (sendMoney + rechargeAmount + cashOutAmont);
                System.out.println("Total balance : "+totalBalance);
            }

        }//1st for loop ses;

    }//main method ses
}
