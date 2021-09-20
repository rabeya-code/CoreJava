
package com.productmanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ProductDaoImp implements ProductDao{

    @Override
    public boolean store(Product product) {
        Connection conn = DatabaceConnector .connect();
       if(conn!=null){
            try {
                String sql = "INSERT INTO products values(?,?,?,?,?)";
                PreparedStatement pst = conn.prepareStatement(sql);
                
                pst.setInt(1, 101);
                pst.setString(2, "Laptop");
                pst.setDouble(3, 56000.00);
                pst.setInt(4, 10);
                pst.setString(5, "HP");
                
                int result = pst.executeUpdate();
                if(result>0){
                    System.out.println("Product inserted successfully");
                }else{
                    System.out.println("Product inserted failed");
                }
                
            } catch (SQLException ex) {
                System.out.println(ex);
            }
           
       }else{
           System.out.println("Connecton faild! Please try again");
       }
        
       return false;
    }

   



   
    
    
}
