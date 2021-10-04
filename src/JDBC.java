/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anne Marie
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {
  public static void main(String[] args) throws SQLException{
      
      String url = "jdbc:mysql://0.tcp.ngrok.io:16554 /db_primary";
      String uname = "root";
      String password = "root@123pass";
      String query = "select * from grade1";
  
     try {
         Class.forName("com.mysql.cj.jdbc.Driver");
          
      }catch (ClassNotFoundException e){
          //TODO Auto-genereared catch block
         e.printStackTrace();
       
      }
      try{
      
          Connection con = DriverManager.getConnection(url, uname, password);
          Statement statement = con.createStatement();
          ResultSet result = statement.executeQuery(query);
          
         while(result.next()){
           String db_primaryData = "";
           for (int i = 1; i < 5; i++){
              db_primaryData += result.getString(i) + ":";
           
          }
          System.out.println(db_primaryData);
          System.out.println("Hello Guys!");
          System.out.println("Welcome Geeks to GitHub!");
          
        }
              
                  
          
      }
            catch(SQLException e){
            e.printStackTrace();
      
            }
  }
}

  
  
  
    

