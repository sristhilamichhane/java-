package signupform;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

import javax.swing.*;


public class DB {
	Connection con= null;
	java.sql.PreparedStatement pst;
	 public static Connection dbconnect()
	 {
		 try
		 {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/signupform","root","");
			 
			 return conn;
		 }
		 catch(Exception e)
		 {
			 return null;
		 }
	 }

	

}
