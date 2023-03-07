package Databate;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JBDCUtil {
public static Connection getConnection() {
	Connection c = null;
	try {
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		String url = "jdbc:mySQL:\\localhost:3306\sinhvien";
		String user = "root";
		String password = "123456789";
		c = DriverManager.getConnection(url, user, password);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return c;
	
}
public static void closeConnection(Connection c) {
	if(c!=null) {
		try {
			c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
}
