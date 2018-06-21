import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.sql.*;

public class ScoutServlet extends HttpServlet
{
	public void init() throws ServletException {
	}
	//protected or public?
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		// res.setContentType("application/x-www-form-urlencoded");
		// out.close();
		PreparedStatement stmt = null;

		String fName = req.getParameter("fName");
		String lName = req.getParameter("lName");
		// console.log(fn + " " + ln);
		String address = req.getParameter("address");
		String number = req.getParameter("number");
		String email = req.getParameter("email");
		String bday = req.getParameter("bday");
		String sex = req.getParameter("sex");
		String xp = req.getParameter("xp");
		String cpname = req.getParameter("cpname");
		String cpnum = req.getParameter("cpnum");
		String pw1 = req.getParameter("pw1");
		String pw2 = req.getParameter("pw2");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/AppProjDB?user=desi&password=AppProjDB&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true");
			stmt = conn.prepareStatement("INSERT INTO users (fName, lName, ad, phoneNumber, email, sex, bday, xp, cpname, cpnum, pw1, pw2) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");

			stmt.setString(1, fName);
			stmt.setString(2, lName);
			stmt.setString(3, address);
			stmt.setString(4, number);
			stmt.setString(5, email);
			stmt.setString(7, sex);
			stmt.setString(6, bday);
			stmt.setString(8, xp);
			stmt.setString(9, cpname);
			stmt.setString(10, cpnum);
			stmt.setString(11, pw1);
			stmt.setString(12, pw2);
			int x=stmt.executeUpdate();
		}

		catch(Exception e) {
			e.printStackTrace();
		}

		finally {
			try { if (stmt != null) stmt.close(); } catch (Exception e) {};
		}
	}

	public void destroy() {
	}
}
