package mcaSem5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginDetails
 */
@WebServlet("/LoginDetails")
public class LoginDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		 response.setContentType("text/html; charset=UTF-8");
	     PrintWriter out = response.getWriter();
	     
	     out.println("<!DOCTYPE html>");
	     out.println("<html><head>");
	     out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
	     out.println("<title>login details</title></head>");
	     out.println("<body><h1>login details</h1>");
	     
	     String usrname =  request.getParameter("uname");
	     String password = request.getParameter("pwd");
	     
	     out.println("<h2>Welcome "+ usrname +"</h2>");
	     out.println("<h2>Your password is "+ password +"</h2></body></html>");
	     
	     HttpSession session = request.getSession();
	     
	     session.setAttribute("userName", usrname);
	     session.setAttribute("password", password);
	     
	     out.println("<a href='servlet2'> Visit this link to get session info </a>");
	}

}
