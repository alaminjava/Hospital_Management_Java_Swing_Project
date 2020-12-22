package Hospital_Management.Doctor;
import Hospital_Management.Admin.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbconnection {
    public Connection dbconnection() {
        Connection con = null;
        try {
            String s = "jdbc:mysql://localhost:3306/hospital_management?useSSL=false";
            con = DriverManager.getConnection(s,"root","apcl123456");
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            return con;
        }
    }
}
