package repository;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
    public static Connection getConnection(){
        Connection con = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","dangkhoa1997");
        }catch (Exception e){
            e.printStackTrace();
        }
        return con;
    }
}
