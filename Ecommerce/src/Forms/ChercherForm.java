package Forms;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;


import bean.Client;
import dao.ClientDao;
import dao.DAOException;
import dao.DAOFactory;
import Forms.FormValidationException;
import Forms.InscriptionForm;

public final class ChercherForm {

		private static final String CHAMP_LOGIN       = "log";
	    private static final String CHAMP_PASS       = "pass";
	  

	    private static final String ALGO_CHIFFREMENT = "SHA-256";

    private String              resultat;
    private Map<String, String> erreurs          = new HashMap<String, String>();
    private ClientDao      clientDao;

    public ChercherForm( ClientDao clientDao ) {
        this.clientDao = clientDao;
    }

    public Map<String, String> getErreurs() {
        return erreurs;
    }

    public String getResultat() {
        return resultat;
    }

    public Client ChercherClient( HttpServletRequest request ) {
   	 String log = getValeurChamp( request, CHAMP_LOGIN );
        String pass = getValeurChamp( request, CHAMP_PASS );
      
       

       Client client = new Client();
      
       client.setLog(log);
       client.setPass(pass);
        
        
        try {

                clientDao.trouver( client );
                resultat = "Succ�s de la recherche.";
           
        } catch ( DAOException e ) {
            resultat = "echec de la recherche.";
            e.printStackTrace();
        } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        return client;
    }



    /*
     * Méthode utilitaire qui retourne null si un champ est vide, et son contenu
     * sinon.
     */
    private static String getValeurChamp( HttpServletRequest request, String nomChamp ) {
        String valeur = request.getParameter( nomChamp );
        if ( valeur == null || valeur.trim().length() == 0 ) {
            return null;
        } else {
            return valeur;
        }
    }
	


}
