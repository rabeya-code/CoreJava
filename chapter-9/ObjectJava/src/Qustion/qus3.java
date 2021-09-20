
package Qustion;


public class qus3 {
  String name;
  int roll;
  String phone;
  String address;
  
 void display(){
     System.out.println("Name : "+name +"   Roll : "+roll+"   Phone : "+phone+"    address : "+address);
 } 

public static void main(String[] args){
    qus3 st1 = new qus3();
    st1.name = "Sam ";
    st1.roll = 001;
    st1.phone ="01719805052 ";
    st1.address = "dhaka";
    st1.display();
    
    qus3 st2 = new qus3();
    st2.name = "John ";
    st2.roll = 002;
    st2.phone ="01719805052 ";
    st2.address = "Khulna";
    st2.display();
}  
}
