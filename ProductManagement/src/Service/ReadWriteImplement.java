package Service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import productmanagement.Product;

public class ReadWriteImplement implements ReadWrite {

    @Override
    public void write(Product p) {
        try {
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("object.txt"));
            output.writeObject(p);
            output.close();

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException ex) {
            System.out.println(ex);
        }

    }
@Override
   public Product read(){
          Product p = new Product();
        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("object.txt"));
            p =(Product)input.readObject();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
           
        }
           return p;
    }
    }
