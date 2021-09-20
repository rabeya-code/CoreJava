package Chapter17;

import java.util.Formatter;
import java.util.Scanner;

public class WriteFile {

    public static void main(String[] args) {
        String id;
        String name;

        try {
            Formatter formatter = new Formatter("E:/download/Desktop/JavaWorkspace/JavaWorkstation/JavaApplication2/Person/Student.txt");
            Scanner input = new Scanner(System.in);
            System.out.println("How many students : ");
            int num = input.nextInt();

            for (int i = 1; i <= num; i++) {
                System.out.println("Enter Student id and name: ");
                id = input.next();
                name = input.next();
                formatter.format("%s %s\r\n", id, name);
            }
            formatter.close();

        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }

}
