
package Chapter19;

import java.util.ArrayList;
import java.util.List;


public class <Student> extends sTest{
  public static void main(String[] args){
      List <Student> list = new ArrayList<Student>();
      list.add(new Student(1,"Amina","Mohammadpur"));
      list.add(new Student(2,"Hasan","Dhaka"));
      list.add(new Student(3,"Nayem","Savar"));
      list.add(new Student(4,"Kholil","Technikal"));
      
      
      for(Student element : list){
      System.out.print(element.getId()+" ");
      System.out.print(element.getName()+" ");
      System.out.print(element.getAddress()+" ");
      System.out.println();
      }
  } 
 
}
