
package Chapter17;

import java.io.File;
import java.util.Scanner;


public class FileRead {
    public static void main(String[] args) {
        
        try{
            File file = new File("E:/download/Desktop/JavaWorkspace/JavaWorkstation/JavaApplication2/Person/Student.txt");
            Scanner input =new Scanner(file);
            while(input.hasNext()){
            String id = input.next();
            String name = input.next();
            System.out.println("Id: "+id+" name: "+name);
        }
         input.close();
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
            
}
