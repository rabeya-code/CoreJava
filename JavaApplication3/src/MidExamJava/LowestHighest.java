package MidExamJava;

import java.util.Scanner;

public class LowestHighest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input five number :");
       
            int[] nums = {2,5,7,9};
    

        int max = nums[0];
        for(int i = 0; i<nums.length; i++){
            if (nums[i] > max) {
                max =i;
            }
        }

        System.out.println(" max mun is :" + max);

        int min = nums[0];
        for (int i = 0; i<nums.length; i++) {
            if (nums[i] > min) {
                min = nums[i];
            }
        }

        System.out.println(" max mun is :" + min);
    }
}
