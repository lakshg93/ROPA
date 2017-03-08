
import DataBase.Connector;
import beans.RopaMemberBean;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laksh
 */
public class MainReturn {
    
    public ArrayList<RopaMemberBean> getEntry() throws SQLException{
    
        ArrayList<RopaMemberBean> list = new ArrayList<>();
        Connector connector = new Connector();
        Connection conn;
        try {
            conn = connector.connect();
            
            String selectQ = "select * from ropa_member";
            
            Statement s = conn.createStatement();
            ResultSet rst = s.executeQuery(selectQ);
            
            list.clear();
            RopaMemberBean ropamember;
        
            while(rst.next()){
                ropamember = new RopaMemberBean();
                //System.out.println(rst.getString(1) + "  " + rst.getString(3));
                ropamember.setId(rst.getInt("ID"));
                ropamember.setMembershipID(rst.getString("Membership_Number"));
                ropamember.setFullName(rst.getString("Full_Name"));
                ropamember.setMember(rst.getBoolean("Membership"));
                ropamember.setSeniorYear(rst.getString("Senior_Year"));
                ropamember.setAddress(rst.getString("Address"));
                ropamember.setMobile(rst.getString("Mobile"));
                ropamember.setResidence(rst.getString("Residenace_Tel"));
                ropamember.setBirthDay(rst.getString("DateOfBirth"));
                ropamember.setWorkPlace(rst.getString("Work_Place"));
                ropamember.setJobTitle(rst.getString("Job_Title"));
                ropamember.setEmail(rst.getString("Email"));
                ropamember.setPosition(rst.getString("Position"));
                ropamember.setOther(rst.getString("Other"));
                ropamember.setNic(rst.getString("NIC"));
//                System.out.println(ropamember.getFullName());
                list.add(ropamember);
                
            }
            
            
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainReturn.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally{
            
            
        }
        return list;
        
    }
    
    public void insertEntry(RopaMemberBean ropamember){
        
        Connector connector = new Connector();
        Connection conn;
        
        try {
            conn = connector.connect();
            Statement s = conn.createStatement();
            String insertQ = "INSERT INTO ropa_member (Full_Name,Membership_Number,Membership,Senior_Year,Address,Mobile,Residence_Tel,DateOfBirth,Work_Place,Job_Title,Email,Position,Other,NIC) VALUES ("+
             ropamember.getFullName()+","+ ropamember.getMembershipID()+","+ropamember.isMember()+","+ropamember.getSeniorYear()+","+ropamember.getAddress()+
                    ","+ropamember.getMobile()+","+ropamember.getResidence()+","+ropamember.getBirthDay()+","+ropamember.getWorkPlace()+","+ropamember.getJobTitle()
                    +","+ropamember.getEmail()+","+ropamember.getPosition()+","+ropamember.getOther()+","+ ropamember.getNic()+")";
            
            s.execute(insertQ);
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainReturn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateEntry(RopaMemberBean ropamember){
        Connector connector = new Connector();
        Connection conn;
        
        try {
            conn = connector.connect();
            Statement s = conn.createStatement();
            String updateQ = "UPDATE ropa_member Full_Name="+ropamember.getFullName()+",Membership_Number="+ropamember.getMembershipID()+",Membership="+ropamember.isMember()+"Senior_Year="+ropamember.getSeniorYear()+",Address="+ropamember.getAddress()+",Mobile="+ropamember.getMobile()+",Residence_Tel="+ropamember.getResidence()+",DateOfBirth="+ropamember.getBirthDay()+","
                    + "Work_Place="+ropamember.getWorkPlace()+",Job_Title="+ropamember.getJobTitle()+",Email="+ropamember.getEmail()+",Position="+ropamember.getPosition()+",Other="+ropamember.getOther()+",NIC="+ropamember.getNic()+")"; 
            
            s.execute(updateQ);
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainReturn.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void deleteEntry(RopaMemberBean ropamember){
        
        Connector connector = new Connector();
        Connection conn;
         try {
            conn = connector.connect();
            Statement s = conn.createStatement();
            String deleteQ = "DELETE FROM ropa_member WHERE ropa_member.ID = "+ ropamember.getId();
            s.execute(deleteQ);
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainReturn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
}
