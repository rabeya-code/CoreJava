
package objectjava;


public class StudentTest {
   public static void main(String[] agrs){
       Student student1 = new Student();
       student1.display();
       
       Student student2 = new Student(001,"Amina");
       student2.display();    
       
       Student student3 = new Student(002,"Sakib","Mirpur");
       student3.display();
   } 
}
