package mcaSem5;

import java.sql.*;

public class UpdateEmp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stmt = null;
		
		String url = "jdbc:mysql://localhost/student"; 
        String user = "root"; 
        String pass = "student"; 
		
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver()); 
			  
            con = DriverManager.getConnection(url,user,pass); 
            
            System.out.println("Connected to db succesfully");
            
			stmt = con.createStatement();
			
			String sql = "update employee set lastName = 'rachel' " +
					"where id = 002";
			
			stmt.executeUpdate(sql);
			
			
			con.close();
		    System.out.println("Connection Closed");
		    
		} catch (SQLException se){
			se.printStackTrace();
		}

	}

}
