package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Produit;

import Forms.AjouterPrdForm;

import dao.DAOFactory;
import dao.ProduitDao;



/**
 * Servlet implementation class Inscription
 */
@WebServlet("/AjouterProduit")
public class AjouterProduit extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 public static final String CONF_DAO_FACTORY = "daofactory";
	    public static final String ATT_USER         = "produit";
	    public static final String ATT_FORM         = "form";
	    public static final String VUE              = "/indexA2.jsp";
	    
	    private ProduitDao     prdDao;
	 
	    public void init() throws ServletException {
	        /* R�cup�ration d'une instance de notre DAO Utilisateur */
	        this.prdDao = ( (DAOFactory) getServletContext().getAttribute( CONF_DAO_FACTORY ) ).getProduitDao();


	    }
  
   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 /* Affichage de la page d'inscription */
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* Pr�paration de l'objet formulaire */
        AjouterPrdForm form = new AjouterPrdForm( prdDao );
 
        /* Traitement de la requ�te et r�cup�ration du bean en r�sultant */
        Produit produit = form.ajouterproduit(request);
 
        /* Stockage du formulaire et du bean dans l'objet request */
        request.setAttribute( ATT_FORM, form );
        request.setAttribute( ATT_USER, produit );
 
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
	}

	

}
