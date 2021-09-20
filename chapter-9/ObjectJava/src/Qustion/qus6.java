
package Qustion;


public class qus6 {
   int length;
   int breadth;
   
   public qus6(int l,int b){
       length = l ;
       breadth = b ;
   }
   
   public int getArea(){
       return length * breadth ;
   }
   
   public int getPerimeter(){
       return 2*(length+breadth);
   }
   
   
   void display(){
       System.out.println("Area : "+getArea());
       System.out.println("Perimeter : "+getPerimeter());
   }
   
   
   public static void main(String[] args){
       qus6 a = new qus6(4,5);
       a.display();
       qus6 b = new qus6(5,8);
       b.display();
   }
}
