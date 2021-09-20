package practiceathome;

import java.util.Scanner;

public class sumation {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number (zero for sumation)");
        int num = input.nextInt();
        int sum = 0;
        while (num != 0) {
            if (num == -1) {
               num = 0;
            }
            sum+=num;
            System.out.println(" sum = "+sum+" | enter a number for add");
            num = input.nextInt();
            if(num<0)break;
        }
        System.out.println("======================");
        System.out.println(" sum is "+sum);
       
    }

}
