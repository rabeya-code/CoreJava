package practiceathome;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class maxMin {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List num = new ArrayList();
       
     
        System.out.println("Enter five number for max min :");
        for (int i = 0; i < 5; i++) {
            int values = input.nextInt();
            num.add(values);
            
        }
        System.out.println("=====================");
        System.out.println("Maximum number is "+Collections.max(num));
        System.out.println("Minimum number is "+Collections.min(num));
       

    }

}
