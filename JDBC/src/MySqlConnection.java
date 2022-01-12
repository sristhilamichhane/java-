/*import java.sql.*;
public class MySqlConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sono","root","root");
			Statement stmt=  con.createStatement();
			ResultSet rs= stmt.executeQuery("SELECT * FROM `firstone` WHERE 1");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
				con.close();
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}*/
