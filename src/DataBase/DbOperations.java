
package DataBase;

import beans.RopaMemberBean;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Laksh
 */
public class DbOperations {
    
    public static ArrayList<RopaMemberBean> getEntryFromDb() { //REturn type is ArrayList
        
        ArrayList<RopaMemberBean> list = new ArrayList<RopaMemberBean>();
        try{
        RopaMemberBean ropaMemberBean;                      //Creat a null object
        Connection con = Connector.connect();
        String selectQ = "select * from ropa_member";
        Statement statement = con.createStatement();
        statement.execute(selectQ);
        ResultSet rst = statement.executeQuery(selectQ);
        while(rst.next()){
                
                
                ropaMemberBean = new RopaMemberBean();        //Atributes has null values
                 
                ropaMemberBean.setId(rst.getInt("ID"));
                ropaMemberBean.setMembershipID(rst.getString("Membership_Number"));
                ropaMemberBean.setFullName(rst.getString("Full_Name"));
                ropaMemberBean.setMember(rst.getBoolean("Membership"));
                ropaMemberBean.setSeniorYear(rst.getString("Senior_Year"));
                ropaMemberBean.setAddress(rst.getString("Address"));
                ropaMemberBean.setMobile(rst.getString("Mobile"));
                ropaMemberBean.setResidence(rst.getString("Residence"));
                ropaMemberBean.setBirthDay(rst.getString("DateOfBirth"));
                ropaMemberBean.setWorkPlace(rst.getString("Work_Place"));
                ropaMemberBean.setJobTitle(rst.getString("Job_Title"));
                ropaMemberBean.setEmail(rst.getString("Email"));
                ropaMemberBean.setPosition(rst.getString("Position"));
                ropaMemberBean.setOther(rst.getString("Other"));
                ropaMemberBean.setNic(rst.getString("NIC"));
                
                list.add(ropaMemberBean);
                
            }
        con.close();
        }
        catch (Exception e){
            System.out.println("Exception");
        }
        return list;
    }
    public static void insertEntryToDb(RopaMemberBean ropaMemberBean) {
        try (Connection con = Connector.connect()) {
            String isMember;
            if (ropaMemberBean.isMember() == true){
                isMember = "1";
            }
            else {
                isMember= "0";
            }
            String dBColumns = "Membership_Number,Full_Name,Membership,Senior_Year,Address,Mobile,Residence,DateOfBirth,Work_Place,Job_Title,Email,Position,NIC";
            String ropaBeanValues = "('"+ropaMemberBean.getMembershipID()+"','"+ropaMemberBean.getFullName()+
                    "',"+isMember+",'"+ropaMemberBean.getSeniorYear()+"','"+ropaMemberBean.getAddress()+
                    "','"+ropaMemberBean.getMobile()+"','"+ropaMemberBean.getResidence()+
                    "','"+ropaMemberBean.getBirthDay()+"','"+ropaMemberBean.getWorkPlace()+"','"+ropaMemberBean.getJobTitle()+
                    "','"+ropaMemberBean.getEmail()+"','"+ropaMemberBean.getPosition()+"','"+ropaMemberBean.getNic()+"')";
            String insertQ = "INSERT INTO ropa_member ( "+dBColumns+" ) VALUES "+ropaBeanValues; //No point of inserting ID
            Statement s = con.createStatement();
            System.out.println(insertQ);
            s.execute(insertQ);
            con.close();
        }
        catch (Exception e){
            System.out.println("Exception");
        }
        
    }
    
    public static void updateEntryFromDb(RopaMemberBean ropaMemberBean) {
        try (Connection con = Connector.connect()) {
            String isMember;
            if (ropaMemberBean.isMember() == true){
                isMember = "1";
            }
            else {
                isMember= "0";
            }
            
            String ropaBeanValues = "Membership_Number="+ropaMemberBean.getMembershipID()+",Full_Name='"+ropaMemberBean.getFullName()+
                    "',Membership="+isMember+",Senior_Year="+ropaMemberBean.getSeniorYear()+",Address='"+ropaMemberBean.getAddress()+
                    "',Mobile='"+ropaMemberBean.getMobile()+"',Residence='"+ropaMemberBean.getResidence()+
                    "',DateOfBirth='"+ropaMemberBean.getBirthDay()+"',Work_Place='"+ropaMemberBean.getWorkPlace()+"',Job_Title='"+ropaMemberBean.getJobTitle()+
                    "',Email='"+ropaMemberBean.getEmail()+"',Position='"+ropaMemberBean.getPosition()+"',NIC='"+ropaMemberBean.getNic()+"'";
            String insertQ = "UPDATE ropa_member SET "+ropaBeanValues+" WHERE ID="+Integer.toString(ropaMemberBean.getId())+";"; //No point of inserting ID
            Statement s = con.createStatement();
            
            s.execute(insertQ);
            con.close();

        }
        catch (Exception e){
            System.out.println("Exception");
        }
        
        
    }
    
    public static void deleteEntryFromDb(String index) {
        try (Connection con = Connector.connect()) {
            String deleteQ = "DELETE FROM ropa_member WHERE ID = "+index+";";
            Statement statement = con.createStatement();
            statement.execute(deleteQ);
            con.close();

        }
        catch (Exception e){
            System.out.println("Exception");
        }
        
    }
    public static RopaMemberBean getSpecificEntry(String index) {
            RopaMemberBean bean = new RopaMemberBean();
            String selectEntry = "SELECT * FROM ropa_member WHERE ID="+index+";";
            //System.out.println(selectEntry);
            try (Connection con = Connector.connect()) {
            Statement statement = con.createStatement();
            ResultSet rst = statement.executeQuery(selectEntry);
            rst.next();
                bean.setId(rst.getInt("ID"));
                bean.setMembershipID(rst.getString("Membership_Number"));
                bean.setFullName(rst.getString("Full_Name"));
                bean.setMember(rst.getBoolean("Membership"));
                bean.setSeniorYear(rst.getString("Senior_Year"));
                bean.setAddress(rst.getString("Address"));
                bean.setMobile(rst.getString("Mobile"));
                bean.setResidence(rst.getString("Residence"));
                bean.setBirthDay(rst.getString("DateOfBirth"));
                bean.setWorkPlace(rst.getString("Work_Place"));
                bean.setJobTitle(rst.getString("Job_Title"));
                bean.setEmail(rst.getString("Email"));
                bean.setPosition(rst.getString("Position"));
                bean.setOther(rst.getString("Other"));
                bean.setNic(rst.getString("NIC"));
           
            con.close();
                //System.out.println(bean);

        }
            catch (Exception e){
            System.out.println("Exception");
        }
            return bean;
    }
    public static ArrayList<RopaMemberBean> getEntryFromDbForYear(String year) { //REturn type is ArrayList
        
        ArrayList<RopaMemberBean> list = new ArrayList<RopaMemberBean>();
        try{
        RopaMemberBean ropaMemberBean;                      //Creat a null object
        Connection con = Connector.connect();
        String selectQ = "select * from ropa_member WHERE Senior_Year ="+year ;
        String [] query = new String[5] ;
        query[0]= "select * from ropa_member WHERE Senior_Year ="+year +" AND Position=1";
        query[1]= "select * from ropa_member WHERE Senior_Year ="+year +" AND Position=2";
        query[2]= "select * from ropa_member WHERE Senior_Year ="+year +" AND Position=0";
        query[3]= "select * from ropa_member WHERE Senior_Year ="+year +" AND Position=3";
        
        Statement statement = con.createStatement();
        for(int k=0;k<4;k++){
        statement.execute(query[k]);
        ResultSet rst = statement.executeQuery(query[k]);
        while(rst.next()){
                //System.out.println(rst.getString(4)+" "+ rst.getString(3) );
                
                ropaMemberBean = new RopaMemberBean();        //Atributes has null values
                 
                ropaMemberBean.setId(rst.getInt("ID"));
                ropaMemberBean.setMembershipID(rst.getString("Membership_Number"));
                ropaMemberBean.setFullName(rst.getString("Full_Name"));
                ropaMemberBean.setMember(rst.getBoolean("Membership"));
                ropaMemberBean.setSeniorYear(rst.getString("Senior_Year"));
                ropaMemberBean.setAddress(rst.getString("Address"));
                ropaMemberBean.setMobile(rst.getString("Mobile"));
                ropaMemberBean.setResidence(rst.getString("Residence"));
                ropaMemberBean.setBirthDay(rst.getString("DateOfBirth"));
                ropaMemberBean.setWorkPlace(rst.getString("Work_Place"));
                ropaMemberBean.setJobTitle(rst.getString("Job_Title"));
                ropaMemberBean.setEmail(rst.getString("Email"));
                ropaMemberBean.setPosition(rst.getString("Position"));
                ropaMemberBean.setOther(rst.getString("Other"));
                ropaMemberBean.setNic(rst.getString("NIC"));
                
                switch (ropaMemberBean.getPosition()){
                        case "0": ropaMemberBean.setPositionName("Senior Prefect");
                                    break;
                        case "1": ropaMemberBean.setPositionName("Head Prefect");
                                    break;
                        case "2": ropaMemberBean.setPositionName("Deputy Head Prefect");
                                    break;
                        case "3": ropaMemberBean.setPositionName("Prefect");
                                    break;            
                    }
                
                list.add(ropaMemberBean);
                
            }
        }
        con.close();}
        catch (Exception e){
            System.out.println("Exception");
        }
        return list;
    }   
}
