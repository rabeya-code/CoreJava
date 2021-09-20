
package Chapter17;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ExampleIOException {
    public static void main(String[] args){
    
        try{
            PrintWriter out = new PrintWriter("temp.nclc");
            out.println("Handling java ");
            out.flush();
            FileReader in = new FileReader("temp.nclc");
            //char c = (char) in.read();
            //System.out.println(c);
            int ch = 0;
            while((ch = in.read()) != -1){
                System.out.print((char)ch);
            }
            
        }catch(FileNotFoundException e){
            System.out.println(e.getLocalizedMessage());
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
