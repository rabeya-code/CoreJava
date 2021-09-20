
package productmanagement2;

public class Product2 {
   private int id;
   private String name;
   private double price;
   private int quantity;
   private String remarks;

    public Product2() {
    }

    public Product2(int id, String name, double price, int quantity, String remarks) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.remarks = remarks;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
   
}
