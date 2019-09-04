package mcaSem5;

import java.sql.*;

public class UpdateEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws SQLException{
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
			
			String sql = "update employee" +
					"set salary=1234";
//			String sql = "insert into employee " + 
//		    		" values (002, 'sudha', 'rao', 'accounts', 30000)";
			
			stmt.executeUpdate(sql);
			con.close();
			
		} catch (SQLException se) {
			// TODO: handle exception
			se.printStackTrace();
		}

	}

}
