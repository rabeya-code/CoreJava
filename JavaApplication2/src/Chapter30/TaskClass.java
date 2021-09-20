
package Chapter30;


public class TaskClass implements Runnable {

    @Override
    public void run() {
       
        for (int i = 0; i < 3; i++) {
            System.out.println("Good morning..."+i); 
        }
    }
   
}
