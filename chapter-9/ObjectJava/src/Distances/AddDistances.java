
package Distances;
import java.util.Scanner;

public class AddDistances {
   int inch;
   int feet ;
   AddDistances(int a ,int b){
       inch = a ;
       feet = b ;
   }
   
   void display(){
       System.out.println("Inche : "+inch);
       System.out.println("Feet : "+feet);
   }
   
   
   void add(AddDistances first,AddDistances second){
    
    inch = first.inch + second.inch;
    feet = first.feet + second.feet + inch/12;
    inch = inch % 12;
    
   }
   
   
   
   public static void main(String[] args){
     Scanner input = new Scanner(System.in); 
     System.out.println("Enter your first distance");
     int a = input.nextInt();
     int b = input.nextInt();
     
     AddDistances first = new AddDistances(a, b);
     
     System.out.println("Enter your second distance");
          a = input.nextInt();
          b = input.nextInt(); 
     AddDistances second = new AddDistances(a, b);
     
     System.out.println("Distance 1");
     first.display();
     
     System.out.println("Distance 2");
     second.display();
     
     AddDistances result = new AddDistances(0,0);
     result.add(first, second);
     System.out.println("The result is : ");
     result.display();
             
   }
}
