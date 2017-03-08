
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Test {
    public static void main(String[] args) {
        try {
            // Load MS accces driver class
            
//            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            // C:\\databaseFileName.accdb" - location of your database 
            String url = "jdbc:ucanaccess://C:\\Users\\chathurangam\\Documents\\testDatabase.accdb";
            String url2 = "jdbc:ucanaccess://C:\\Users\\chathurangam\\Documents\\Database1.accdb";
//            String url2 = "JDBC:ODBC:Driver=Microsoft Access Driver (*.mdb, *.accdb); DBQ="+ "C:\\Users\\User\\Documents\\Database1.accdb";
            // specify url, username, pasword - make sure these are valid 
            String selectQ = "select * from ropa_member";
            String deleteQ = "delete from ropa_member where ID = 109";
            Connection conn2 = DriverManager.getConnection(url,"Admin","");
            Statement s = conn2.createStatement();
            ResultSet rst = s.executeQuery(deleteQ);
            
            
            while(rst.next()){
                System.out.println(rst.getString(3));
            }
            
//            Connection conn = DriverManager.getConnection(url, "Admin", "");
            System.out.println("Connection Succesfull");
            } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }
    
}