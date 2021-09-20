
package inheritance;


public class Application {
   public static void main(String[] args){
       Animal cat = new Cat();
       Animal dog = new dog();
       Animal cow = new Cow();
       print(dog);
       print(cat);
       print(cow);
   } 
   private static void print(Animal obj){
       if(obj instanceof Cat){
           Cat cat = (Cat)obj;
           cat.pew();
       }else if (obj instanceof dog){
           dog dog = (dog)obj;
           dog.pew();
       }else if (obj instanceof Cow){
            Cow cow = (Cow)obj;
            cow.pew();
            
      }
   }
}
