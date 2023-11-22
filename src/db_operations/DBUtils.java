package db_operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtils {
      static Connection con;
      static Statement stmt;
      
      
     static {
    	 try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sshopping_management", "root","rohit@123");
			stmt=con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
    	 
     }
     public static void executequery(String query) {
    	 try {
			stmt.execute(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     }
     public static ResultSet executeQueryGetQuery(String query) {
    	 ResultSet resultset=null;
    	 
    	 try {
			resultset=stmt.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultset;
		
    	 
     }
}
