
package Qustion;

import java.util.Scanner;
public class qus8 {
    int num1,num2,num3;
    
    qus8(int num1,int num2,int num3){
        this.num1 = num1 ;
        this.num2 = num2 ;
        this.num3 = num3 ;
    }
    
    public int getAverage(){
        return (num1+num2+num3)/3;
    }
    
    
    
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       
       System.out.println("Enter 1st num : ");
       int num1 = input.nextInt();
       System.out.println("Enter 2nd num : ");
       int num2 = input.nextInt();
       System.out.println("Enter 3rd num : ");
       int num3 = input.nextInt();
       
       qus8 a = new qus8(num1,num2,num3);
       
       System.out.println("Average : "+a.getAverage());
    }
}
