package com.productmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaceConnector {

    static Connection connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306?pms47", "root", "123456");
            return conn;
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);

        } catch (SQLException ex) {
            Logger.getLogger(DatabaceConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }
}
