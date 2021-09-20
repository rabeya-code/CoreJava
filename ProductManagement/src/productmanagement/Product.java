package productmanagement;

import java.io.Serializable;



public class Product implements Serializable{

    int id;
    String name;
    int quntity;
    String details;
    double price;
 
    public Product() {
    }
    
    
     public Product(int id, String name, int quntity, String details, double price) {
        this.id = id;
        this.name = name;
        this.quntity = quntity;
        this.details = details;
        this.price = price;
    }
     
     
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuntity() {
        return quntity;
    }

    public void setQuntity(int quntity) {
        this.quntity = quntity;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


   

   

}
