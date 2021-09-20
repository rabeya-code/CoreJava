
package AbstractionEncapsukation;


public class ApplicationTest {
    public static void main(String[] args){
      Honda honda= new Honda();
      honda.run();
      honda.stop("stopped.");
      
      Bike bike = new Bajaj();
      bike.run();
      bike.stop("stopped.");
    }
}
