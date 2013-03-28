package servlet;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.LoginDAO;

import bean.Client;
import bean.LoginBean;



/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{ 
			
			System.out.println("In the Login Servlet");
			Client user = new Client();
			user.setLog(request.getParameter("log"));
			user.setPass(request.getParameter("pass"));
			user = LoginDAO.login(user);
			if(user.isValid())
			{
				HttpSession session = request.getSession(true);
				session.setAttribute("currentSessionUser",user);
				response.sendRedirect("indexU.jsp");
			}else
				
			
			
			
			
			
				response.sendRedirect("LoginFailed.jsp");
		} catch (Throwable exc)
		{
			System.out.println(exc);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}