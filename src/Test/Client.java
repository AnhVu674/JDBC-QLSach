package Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import Databate.JBDCUtil;

public class Client {
public static void main(String[] args) {
	try {
		Connection connection = new JBDCUtil.getConnection();
		Statement st = connection.createStatement();
		String sql = "INSERT INTO persons(last_name, first_name, gender, dob, incom)"+"	VALUES (\"Tran\", \"Thi\", \"C\",\"2002-09-02\",10000000)";
		int check = st.executeUpdate(sql);
		System.out.println("So dong thay doi"+check);
		if(check>0) {
			System.out.println("Tao thanh cong");
			
		} else {
			System.out.println("Tao ko thanh cong");
		}
		JBDCUtil.closeConnection(connection);
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
}
