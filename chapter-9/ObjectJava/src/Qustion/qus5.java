
package Qustion;


public class qus5 {
  int a,b,c;

    qus5(int a, int b, int c){
       this.a = a;
       this.b = b;
       this.c = c;
    }
    
    
    public double getArea(){
        double s = (a+b+c)/2.0;
        return Math.pow((s*(s-a)*(s-b)*(s-c)),.5);
    }
    
    
    public double getPerimeter(){
        return (a+b+c);
    }
    
  void display(){
        System.out.println("Triangle Are is : "+ getArea());
        System.out.println("Triangle Perimeter is : "+ getPerimeter());
        
    }

  
    
    
   public static void main(String[] args){
        qus5 obj = new qus5(3,4,5);
        
        obj.display();
      
      
     
    }
    
}
