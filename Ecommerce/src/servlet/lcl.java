package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClientDao;
import dao.DAOFactory;

import bean.Client;


@WebServlet("/Servletlcl")
public class lcl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DAOFactory df;
    ClientDao dc;
       
   
    public lcl() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
	     ArrayList<Client> listeClient=new ArrayList<Client>();
	 
	       df=DAOFactory.getInstance();
	       dc=df.getClientDao();
	       listeClient= dc.getAll();
	            request.setAttribute("listeClient", listeClient);
	            
	            RequestDispatcher dis=request.getRequestDispatcher("ListeClient.jsp");
	                             dis.forward(request, response);
	        
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request,response);
	}

}
