
package Chapter17;

import java.io.File;


public class CreateFolder {
    public static void main(String[] args) {
        File dir = new File("Person");
        dir.mkdir();
        String dirlocation = dir.getAbsolutePath();
        System.out.println(dirlocation);
        System.out.println(dir.getName());
        
        if(dir.delete()){
            System.out.println(dir.getName()+"Folder has been deleted");
        }
    }
 
}
