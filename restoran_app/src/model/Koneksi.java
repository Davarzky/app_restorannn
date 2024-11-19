/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Client
 */
public class Koneksi {
    static Connection conn;
    
    public static Connection ConnectDB(){
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restoran_app","root","");
            return conn;
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Koneksi gagall");
        }
         return null;
    }
   
}
