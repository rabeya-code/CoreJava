
package productmanagement;

import Service.ReadWriteImplement;


public class ProductManagement {

    
    public static void main(String[] args) {
       Product p = new Product(101,"Laptop",500,"HP",52500);
       ReadWriteImplement r = new ReadWriteImplement();
       r.write(p);
       
       Product x = r.read();
       
        System.out.println(x.getPrice());
    }
    
}
