
package schoolinformation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DatabaseConnector {
  public static Connection connect(){
  
      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          String url = "jdbc:mysql://localhost:3306/pms47";
          Connection conn = DriverManager.getConnection(url,"root", "123456");
         return conn;
          
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(DatabaseConnector.class.getName()).log(Level.SEVERE, null, ex);
      } catch (SQLException ex) {
          Logger.getLogger(DatabaseConnector.class.getName()).log(Level.SEVERE, null, ex);
      }
      
      return null;
  }  

    
}
