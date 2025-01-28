/*

code for creating tables in database

*/
package Connection;
import java.sql.*;
import javax.swing.JOptionPane;

public class Tables {
    public static void main(String args[])
    {
        try
        {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            //st.executeUpdate("create table appuser (appuser_pk int auto_increment primary key , userRole varchar(50) , name varchar(80) , dob varchar(50) , mobileNumber varchar(50) , email varchar(80) , username varchar(80) unique , password varchar(50) , address varchar(100))");
            //st.executeUpdate("create table medicine (medicine_pk int auto_increment primary key , ID varchar(200) , name varchar(200) , company(200) , quantity bigint , price bigint)");
            //st.executeUpdate("create table bill(bill_pk int auto_increment primary key , billID varchar(200) , billDate varchar(50) , totalPaid bigint , generatedBy varchar(200) )");
            JOptionPane.showMessageDialog(null, "table created sucessfully");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
