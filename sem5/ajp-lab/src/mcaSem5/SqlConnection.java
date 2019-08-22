package mcaSem5;

import java.sql.*;

public class SqlConnection {

	/**
	 * @param args
	 * @return 
	 */

		
		public static void createConnection() {
			String url = "jdbc:mysql://localhost/student"; 
	        String user = "root"; 
	        String pass = "student"; 
	         
	        Connection con=null; 
	        try
	        { 
	            DriverManager.registerDriver(new com.mysql.jdbc.Driver()); 
	  
	            //Reference to connection interface 
	            con = DriverManager.getConnection(url,user,pass); 
	            
	            System.out.println("Connected to db succesfully");
	            
//	            con.close();
	        } 
	        catch(Exception ex) 
	        { 
	            System.err.println(ex); 
	        } 
		}
		

	}

