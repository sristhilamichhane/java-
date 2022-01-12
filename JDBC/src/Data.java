import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class Data {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hi","root","");
			PreparedStatement pst= con.prepareStatement("INSERT INTO `hii` (`name`, `email`) VALUES ('kristhi', 'krishtilamichhane@gmail.com')");
			pst.executeUpdate();
			Statement ps=con.createStatement();
			ResultSet rs= ps.executeQuery("SELECT * FROM `hii` ");
			
			while(rs.next())
			{
				System.out.println(rs.getString(1)+" "+rs.getString(2));
				
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
