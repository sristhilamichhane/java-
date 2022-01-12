import java.sql.*;
public class Database {

	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub

try
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sono","root","");
	System.out.println("XAMP MYSQL CONNECTED");
	Statement stmt=  con.createStatement();
	ResultSet rs= stmt.executeQuery("SELECT * FROM `firstone`");
	String query="INSERT INTO `firstone` (`id`, `username`, `password`) VALUES (NULL, 'Sristhi', 'hfeiwhefiu');";
	
	
	while(rs.next())
	{
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		con.close();
	}
	
}
catch(Exception e)
{
System.out.println(e.getMessage());	
}
	}

}
/*import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
class main {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = null;
            conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
            System.out.print("Database is connected !");
            conn.close();
        }
        catch(Exception e) {
            System.out.print("Do not connect to DB - Error:"+e);
        }*/

