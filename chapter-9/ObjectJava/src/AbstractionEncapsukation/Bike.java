
package AbstractionEncapsukation;


public abstract class Bike {
    public void start(String msg){
        System.out.println(msg);
    }
    
    public void stop(String msg){
        System.out.println(msg);
    }
    
    public abstract void run();
    
    public Bike(){
    }
}
