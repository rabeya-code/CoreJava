
package GetMathod;


public class Demo {
     private int id ;
     private String name;
     
     
     public Demo(int i, String n){
         id = i ;
         name = n ;
     }
     public int getId(){
         return id ;
     }
     
     public String getName(){
         return name ;
     }
     
     public void setId(int id){
         this.id = id ;
     }
     
     public void setName(String name){
         this.name = name ;
     }
     
     void display(){
         System.out.println("Id : "+id);
         System.out.println("Name : "+name);
       
        
     }
}
