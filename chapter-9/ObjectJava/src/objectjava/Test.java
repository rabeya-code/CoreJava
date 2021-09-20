
package objectjava;


public class Test {
   public static void main(String[] args){
   
       Teacher teacher1 = new Teacher("Anisul islam","Male");
       teacher1.display();
   
       
       Teacher teacher2 = new Teacher();
       teacher2.display();
       
       
       Teacher teacher3 = new Teacher("Hasan","Male",25);
       teacher3.display();
   } 
}
