package ex1;

import java.sql.*;


public class ENTRY 
{
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException 
    {
        Driver drv =(Driver)Class.forName("com.mysql.jdbc.Driver").newInstance();
        DriverManager.registerDriver(drv);
        StringBuilder strb = new StringBuilder();
       // strb.append()
        String url ="jdbc:mysql://localhost:3306/test?root&";
        System.out.println( url );
        Connection conn = DriverManager.getConnection(url);
        System.out.println( conn );
    }
}
