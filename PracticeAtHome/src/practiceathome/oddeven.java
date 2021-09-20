
package practiceathome;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class oddeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input five integer number : ");
        List odd = new ArrayList();
        for(int i = 0; i<5; i++){
            int values = input.nextInt();
            if(values % 2 != 0){
                odd.add(values);
            }
        }
        System.out.println("======================");
        System.out.println("Odd number,s are = "+odd);
    }
}
