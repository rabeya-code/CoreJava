package productmanagement2;

import static java.lang.Character.UnicodeBlock.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ProductManagement2 {

    public static void main(String[] args) {
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pms47", "root", "123456");
            
            String sql = "insert into product values(?,?,?,?,?)";
            
          PreparedStatement pst  = conn.prepareStatement(sql);
          
          pst.setInt(1, 2);
          pst.setString(2, "Laptop");
          pst.setDouble(3, 55000.00);
          pst.setInt(4, 10);
          pst.setString(5, "Dell");
          pst.execute();
          
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductManagement2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
