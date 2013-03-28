package servlet;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Login2DAO;

import bean.Admin;



/**
 * Servlet implementation class TraitAdmin
 */
public class TraitAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public TraitAdmin() {
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
			Admin adm = new Admin();
			adm.setLogin(request.getParameter("log"));
			adm.setPass(request.getParameter("pass"));
			adm = Login2DAO.login(adm);
			if(adm.isValid())
			{
				HttpSession session = request.getSession(true);
				session.setAttribute("currentSessionUser",adm);
				response.sendRedirect("indexA2.jsp");
			}else
				
			
			
			
			
			
				response.sendRedirect("LoginFailed2.jsp");
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