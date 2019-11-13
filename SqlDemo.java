package seleniumCodes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
 
		Class.forName("com.mysql.jdbc.Driver");
		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/demosnssms","root","Barani@123");
		Statement state = connect.createStatement();
		ResultSet users = state.executeQuery("SELECT * FROM playerprofile");
			System.out.println(users.next());
		
	while(users.next()) {
		String playersname = users.getString("centuries");
	System.out.println(playersname);
	}			
		}
		
		
		
	
	}


