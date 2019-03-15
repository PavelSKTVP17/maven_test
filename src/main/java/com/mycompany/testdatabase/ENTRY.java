package com.mycompany.testdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ENTRY 
{
    public static void main(String[] args) 
    {
        String url ="jdbc:mysql://localhost:3306/test";
        String username ="root";
        String password ="";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement statm = conn.createStatement();
            ResultSet ress = statm.executeQuery("SELECT * FROM tasks"); 
            while( ress.next() )   { System.out.println( ress.getString(2) ); }
            
 
            ress.close();
            statm.close();
            conn.close();
        }
        catch( SQLException e)
        {
            e.printStackTrace();
        }
        catch( ClassNotFoundException e)
        {
             e.printStackTrace();
        }
    }
}
