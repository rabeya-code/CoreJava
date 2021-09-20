
package Chapter30;


public class Test {
    public static void main(String[] args) {
      TaskClass t1 = new TaskClass();
      TaskClass2 t2 = new TaskClass2();
      
      Thread th = new Thread(t1);
      th.start();
      
      Thread th2 = new Thread(t2);
      th2.start(); 
      
    }
 
}
