
package Qustion;


public class qus4 {
    int a,b,c;
    public double getArea(){
        double s = (a+b+c)/2.0;
        return Math.pow((s*(s-a)*(s-b)*(s-c)),0.5);
        
    }
    public double getPerimeter(){
        return(a+b+c);
    }
    
    public static void main(String[] args){
        qus4 obj = new qus4();
        obj.a = 2;
        obj.b = 5;
        obj.c = 6;
        
        System.out.println(obj.getArea());
        System.out.println(obj.getPerimeter());
    }
}
