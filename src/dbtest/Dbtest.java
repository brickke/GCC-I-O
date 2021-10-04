/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbtest;

/**
 *
 * @author Anne Marie
 */

import java.sql.*;
import javax.swing.*;
public class Dbtest {
    
     Connection conn=null;

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
   }
     
       public static Connection db_primary(){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn =DriverManager.getConnection(" jdbc:mysql://127.0.0.1:3303/?user=root");
            //JOptionPane.showMessageDialog(null, "Connection to database is successful");
      
            return conn;
           
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }
    
}
