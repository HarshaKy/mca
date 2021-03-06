package mcaSem5;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionInfo
 */
//@WebServlet("/SessionInfo")
public class SessionInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("deprecation")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		try {
			 response.setContentType("text/html; charset=UTF-8");
		     PrintWriter out = response.getWriter();
		     
		     out.println("<!DOCTYPE html>");
		     out.println("<html><head>");
		     out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
		     out.println("<title>Session Details</title></head>");
		     out.println("<body><h1>Session Details</h1>");
		     
		     HttpSession session = request.getSession(false);
		     String un = (String)session.getAttribute("userName");
		     String p = (String)session.getAttribute("password");
		     
		     out.println("Hello " + un);
		     out.println("Your Password is " + p);
		     
		     Integer accessCount;
		     synchronized(session) {
		    	 accessCount = (Integer)session.getAttribute("accessCount");
		         if (accessCount == null) {
		            accessCount = 0;   // autobox int to Integer
		         } else {
		            accessCount = new Integer(accessCount + 1);
		         }
		         session.setAttribute("accessCount", accessCount);
		      }
		      
		      out.println("<h2>You have accessed this site " + accessCount + " times in this session.</h2>");
		         out.println("<p>(Session ID is " + session.getId() + ")</p>");
		 
		         out.println("<p>(Session creation time is " +
		               new Date(session.getCreationTime()) + ")</p>");
		         out.println("<p>(Session last accessed time is " +
		               new Date(session.getLastAccessedTime()) + ")</p>");
		         out.println("<p>(Session max inactive interval  is " +
		               session.getMaxInactiveInterval() + " seconds)</p>");
		     
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
	}

}
