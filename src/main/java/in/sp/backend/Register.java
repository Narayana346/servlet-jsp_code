package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/regForm")
public class Register extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter out = resp.getWriter();

		String myname = req.getParameter("name1");
		String myemail = req.getParameter("email1");
		String mypass = req.getParameter("pass1");
		String mycity = req.getParameter("city1");
		String mygender = req.getParameter("gender1");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reg_db", "root", "root");

			String query = "insert into register values('" + myname + "','" + myemail + "','" + mypass + "','" + mycity+ "','" + mygender + "')";

			PreparedStatement ps = con.prepareStatement(query);

			int count = ps.executeUpdate();

			if (count > 0) {
				resp.setContentType("text/html");
				out.print("<div class='notice'>User Registered Successfully.</div>");
				RequestDispatcher rd = req.getRequestDispatcher("/register.jsp");
				rd.include(req, resp);
			} else {
				resp.setContentType("text/html");
				out.print("<div class='notice'>User Not Registered Due to Some Problem.</div>");
				RequestDispatcher rd = req.getRequestDispatcher("/register.jsp");
				rd.include(req, resp);
			}

		} catch (Exception e) {
			e.printStackTrace();

			resp.setContentType("text/html");
			out.print("<div class='notice'>User Not Registered Due to Some Problem.</div>");
			RequestDispatcher rd = req.getRequestDispatcher("/register.jsp");
			rd.include(req, resp);
		}
		String query = " ";
	}
}
