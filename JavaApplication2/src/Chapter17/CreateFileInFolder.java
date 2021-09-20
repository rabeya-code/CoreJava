package Chapter17;

import java.io.File;

public class CreateFileInFolder {

    public static void main(String[] args) {
        File dir = new File("Person");
        dir.mkdir();
        String path = dir.getAbsolutePath();
        File file1 = new File(path + "/Student.txt");
        File file2 = new File(path + "/Teacher.txt");

        try {
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("File are created .");

        } catch (Exception e) {
            System.out.println("Exception : " + e);
        }
        if (file1.exists()) {
            System.out.println("File1 is exists .");
        }
        //delete file from folder.......
       /* file2.delete();
       if (file2.exists()) {
           System.out.println("File2 is exists");
       } else {
          System.out.println("File2 is not exists");
      }*/
    }

}
