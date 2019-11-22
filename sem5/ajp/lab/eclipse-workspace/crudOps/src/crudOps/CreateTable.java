package crudOps;
import java.sql.*;

public class CreateTable {

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
		final String jdbc_driver = "com.mysql.cj.jdbc.Driver";
		final String dbUrl = "jdbc:mysql://localhost/harsha";
		
		final String user = "root";
		final String pwd = "root";
		
		Connection con = null;
		Statement stm = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection(dbUrl, user, pwd);
			System.out.println("Connected database successfully...");
			
			stm = con.createStatement();
		      
		    String sql = "CREATE TABLE user " +
		                   "(id INTEGER not NULL, " +
		                   " name VARCHAR(255), " + 
		                   " password VARCHAR(255), " + 
		                   " email VARCHAR(255), " + 
		                   " country VARCHAR(255)," +
		    				" PRIMARY KEY ( id ))";
		    stm.executeUpdate(sql);
		    System.out.println("Created table successfully...");

		} catch(SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
