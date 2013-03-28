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

public final class InscriptionForm {
	 private static final String CHAMP_CIN      = "cin";
		private static final String CHAMP_EMAIL      = "email";
		private static final String CHAMP_LOGIN       = "log";
	    private static final String CHAMP_PASS       = "pass";
	    private static final String CHAMP_PRE       = "pre";
	    private static final String CHAMP_NOM        = "nom";
	    private static final String CHAMP_TEL      = "tel";

	    private static final String ALGO_CHIFFREMENT = "SHA-256";

    private String              resultat;
    private Map<String, String> erreurs          = new HashMap<String, String>();
    private ClientDao      clientDao;

    public InscriptionForm( ClientDao clientDao ) {
        this.clientDao = clientDao;
    }

    public Map<String, String> getErreurs() {
        return erreurs;
    }

    public String getResultat() {
        return resultat;
    }

    public Client inscrireClient( HttpServletRequest request ) {
   	 String cin = getValeurChamp( request, CHAMP_CIN );
   	 String log = getValeurChamp( request, CHAMP_LOGIN );
        String pass = getValeurChamp( request, CHAMP_PASS );
        String nom = getValeurChamp( request, CHAMP_NOM );
        String prenom = getValeurChamp( request, CHAMP_PRE );
       String email = getValeurChamp( request, CHAMP_EMAIL );
       String tel = getValeurChamp( request, CHAMP_TEL );
       
       

       Client client = new Client();
       client.setCin(cin);
       client.setNom(nom);
       client.setPrenom(prenom);
       client.setEmail(email);
       client.setLog(log);
       client.setPass(pass);
       client.setTel(tel);
        
        
        try {

                clientDao.creer( client );
                resultat = "Succ�s de l'inscription.";
           
        } catch ( DAOException e ) {
            resultat = "echec de l'inscription : une erreur  est survenue, merci de r�essayer dans quelques instants.";
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
