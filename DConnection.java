package busReserv;

import java.sql.*;


public class DConnection {
	private static final String url ="Enter Url here";
	private static final String userName = " Enter User name here ";
	private static final String password= "Enter password here";
	
	public static Connection getConnection()throws SQLException{
		return DriverManager.getConnection(url,userName,password);
	}
}
