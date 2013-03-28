package Forms;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import bean.Produit;



import dao.DAOException;
import dao.DAOFactory;
import dao.ProduitDao;
import Forms.FormValidationException;
import Forms.InscriptionForm;

public final class AjouterPrdForm {
	 private static final String CHAMP_LIB      = "libelle";
		private static final String CHAMP_DSPT      = "dspt";
		private static final String CHAMP_PRIX       = "prix" ;
		private static final String CHAMP_PH       = "photo";


	  

	    private static final String ALGO_CHIFFREMENT = "SHA-256";

    private String              resultat;
    private Map<String, String> erreurs          = new HashMap<String, String>();
    private ProduitDao      produitDao;

    public AjouterPrdForm( ProduitDao produitDao ) {
        this.produitDao = produitDao;
    }

    public Map<String, String> getErreurs() {
        return erreurs;
    }

    public String getResultat() {
        return resultat;
    }

    public Produit ajouterproduit( HttpServletRequest request ) {
   	 String lib = getValeurChamp( request, CHAMP_LIB );
   	 String dspt = getValeurChamp( request, CHAMP_DSPT);
        String prix = getValeurChamp( request, CHAMP_PRIX );
        String photo = getValeurChamp( request, CHAMP_PH );
        Double pr=Double.parseDouble(prix);
       
       
       

       Produit produit = new Produit();
       produit.setLibelle(lib);
       produit.setDescription(dspt);
       produit.setPrix(pr);
       produit.setPhoto(photo);
      
        
        
        try {

                produitDao.add( produit );
                resultat = "Succ�s de l'inscription.";
           
        } catch ( DAOException e ) {
            resultat = "echec de l'inscription : une erreur  est survenue, merci de r�essayer dans quelques instants.";
            e.printStackTrace();
        } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        return produit;
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
