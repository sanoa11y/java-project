package com.StudentLogin;
import java.sql.*;
public class LoginJdbc {
public boolean insert(User user) throws ClassNotFoundException, SQLException {
	boolean result=false;
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oralce:thin:@localhost:1521:xe";
	String username="SYSTEM";
	String password="SYS";
	String query= "Insert to Login(USERNAME,PASSWORD) values(?,?)";
	Class.forName(driver);
	Connection con=DriverManager.getConnection(url,username,password);
	PreparedStatement ps=con.prepareStatement(query);
	ps.setString(1, user.getUserName());
	ps.setString(1, user.getPassword());
ResultSet rs=ps.executeQuery();
	result=rs.next();
	return result;
	
}
}
