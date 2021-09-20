package objectjava;

public class Teacher {
String name;
String gender ;
int age;


Teacher(){
    System.out.println("===== no value =====");
}

Teacher(String n,String g){
    name = n ;
    gender = g ;
    
}
Teacher(String n,String g,int a){
    name = n ;
    gender = g ;
    age = a ;
}


    void display(){
        System.out.println("Name : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("Age : "+age);
        System.out.println("\n\n ");
    }


}
