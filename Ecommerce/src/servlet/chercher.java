package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import bean.Client;
import dao.ClientDao;
import dao.DAOException;
import dao.DAOFactory;
import Forms.ChercherForm;
import Forms.FormValidationException;
import Forms.InscriptionForm;
import Forms.InscriptionForm.*;

/**
 * Servlet implementation class Inscription
 */
@WebServlet("/chercher")
public class chercher extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 public static final String CONF_DAO_FACTORY = "daofactory";
	    public static final String ATT_USER         = "client";
	    public static final String ATT_FORM         = "form";
	    public static final String VUE              = "/index.jsp";
	    
	    private ClientDao     clDao;
	 
	    public void init() throws ServletException {
	        /* R�cup�ration d'une instance de notre DAO Utilisateur */
	        this.clDao = ( (DAOFactory) getServletContext().getAttribute( CONF_DAO_FACTORY ) ).getClientDao();
	    }
  
   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 /* Affichage de la page d'inscription */
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* Pr�paration de l'objet formulaire */
        ChercherForm form = new ChercherForm( clDao );
 
        /* Traitement de la requ�te et r�cup�ration du bean en r�sultant */
        Client client = form.ChercherClient( request );
 
        /* Stockage du formulaire et du bean dans l'objet request */
        request.setAttribute( ATT_FORM, form );
        request.setAttribute( ATT_USER, client );
 
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
	}

	

}
