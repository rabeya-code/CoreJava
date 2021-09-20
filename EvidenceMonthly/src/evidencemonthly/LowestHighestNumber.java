package evidencemonthly;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

public class LowestHighestNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List num = new ArrayList();
        System.out.println("Enter four number for lowest and highest value : ");
       

        for (int i = 0; i < 4; i++) {
            int values = input.nextInt();
            num.add(values);
       
        }
       
        System.out.println("Highest value is : "+(Collections.max(num)));
        System.out.println("Lowest value is : "+(Collections.min(num)));
    }

}
