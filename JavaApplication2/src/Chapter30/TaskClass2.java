
package Chapter30;


public class TaskClass2 implements Runnable {

    @Override
    public void run() {
       
        for (int i = 0; i < 4; i++) {
            System.out.println("Have a good day....."+i); 
        }
    }
    
}
