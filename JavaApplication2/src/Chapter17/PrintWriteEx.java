
package Chapter17;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriteEx {
   public static void main(String[] args){
       try{
           PrintWriter out = new PrintWriter("temp.nclc");
           out.println("Hello I/O ");
           out.flush();
           FileReader in = new FileReader("temp.nclc");
          // char c = (char) in.read();
           //System.out.println (c);
                   
           int ct1 = 0;
           while((ct1 = in.read()) != -1){
               System.out.print((char)ct1);
           }
       }catch(FileNotFoundException e){
           System.out.println(e.getLocalizedMessage());
       }catch (IOException e){
           System.out.println(e.getMessage());
       }
   } 

    private PrintWriteEx(String tempnclc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
