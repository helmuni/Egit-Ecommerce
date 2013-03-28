package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Produit;

import dao.ProduitDaoImp;

/**
 * Servlet implementation class AfficherProduits
 */
@WebServlet("/AfficherProduits")
public class AfficherProduits extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String LIST_PROD = "ind.jsp";
	private ProduitDaoImp pr;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AfficherProduits() {
    	pr = new ProduitDaoImp();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
         request.setAttribute("Produit", pr.getAllProds());
         
    RequestDispatcher view = request.getRequestDispatcher("lister.jsp");
	ArrayList<Produit>listeProduit=new ArrayList<Produit>();
	listeProduit=pr.getAllProds();
	// ArrayList<Produit> listeProduitr= (ArrayList)request.getAttribute("listeProduit");
	 
	request.setAttribute("listeProduit1", listeProduit);

	//RequestDispatcher dis=request.getRequestDispatcher("/inf.jsp");
//	dis.forward(request, response);
	request.getRequestDispatcher("lister.jsp").forward(request, response);
}
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
