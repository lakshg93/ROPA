package ropa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class test {
    public static void main(String[] args) {
        try {
            // Load MS accces driver class
            
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            // C:\\databaseFileName.accdb" - location of your database 
            String url = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=" + "D:\\ROPA_DB.mdb";
            String url2 = "JDBC:ODBC:Driver=Microsoft Access Driver (*.mdb, *.accdb); DBQ="+ "D:\\ROPA_DB.mdb";
            // specify url, username, pasword - make sure these are valid 
            
            Connection conn2=DriverManager.getConnection(url,"Admin","");
            Statement s = conn2.createStatement();
            
            Connection conn = DriverManager.getConnection(url, "Admin", "");
            //System.out.println("Connection Succesfull");
            } catch (ClassNotFoundException | SQLException e) {
           // System.err.println("Got an exception! ");
           // System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }
    
}