
package Qustion;
import java.util.Scanner;

public class qus7 {
 int length;
 int breadth;
 
 qus7(int l,int b){
     length = l;
     breadth = b;
 }
 
 public int getArea(){
     return length*breadth ;
 }
 
 
 
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       
       System.out.println("Enter length : ");
       int l = input.nextInt();
       System.out.println("Enter breadth : ");
       int b = input.nextInt();   
       
       qus7 a = new qus7(l,b);
       System.out.println("Area : "+a.getArea());
       
    }
 
}
