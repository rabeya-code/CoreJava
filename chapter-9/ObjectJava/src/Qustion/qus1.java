
package Qustion;

import java.util.Scanner;


public class qus1 {
    double length ,breadth;
    
    public void setDim(double len, double bre){
        length = len ;
        breadth = bre ;
    }
    
    public double getArea(){
        return length * breadth ;
    }
    
    
    
    
     public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       
       System.out.println("Enter length :");
       double len = input.nextDouble();
      
       
       System.out.println("Enter breadth :");
       double bre = input.nextDouble();
       
       qus1 area = new qus1();
       area.setDim(len, bre);
       
       System.out.println(area.getArea());
   }
}
