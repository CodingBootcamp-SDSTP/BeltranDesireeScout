import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class ScoutServlet extends HttpServlet
{

	public void init() throws ServletException {
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("application/x-www-form-urlencoded");
		string n = req.getParameter("fName");
		console.log(n);
		out.close();
	}

	public void destroy() {
	}
}
