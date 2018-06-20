import java.sql.*;

public class Main
{
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/AppProjDB");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}