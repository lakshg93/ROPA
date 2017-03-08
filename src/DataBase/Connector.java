package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Connector {
    
    public static Connection connect(){
        String url = "jdbc:ucanaccess://E:\\Projects\\ROPA\\testDatabase.accdb";
        Connection conn2;
        try {
            conn2 = DriverManager.getConnection(url,"Admin","");
            return conn2;
        } catch (SQLException ex) {
            Logger.getLogger(Connector.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
}

