package dao;

import static dao.DAOUtilitaire.fermeturesSilencieuses;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dao.DAOException;
import bean.Produit;

public class ProduitDaoImp implements ProduitDao{
	private DAOFactory df;
	Connection connexion = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    
    private static final String SQL_INSERT="insert into produit (intitile_produit , quantite_produit , prix_produit , date_ajout_produit , image_produit) values(?,?,?,NOW(),?)";

    
    public ProduitDaoImp(DAOFactory df){
    	this.df=df;
    	}
    
    public static PreparedStatement initialisationRequetePreparee( Connection connexion, String sql, boolean returnGeneratedKeys, Object... objets ) throws SQLException {
        PreparedStatement preparedStatement = connexion.prepareStatement( sql, returnGeneratedKeys ? Statement.RETURN_GENERATED_KEYS : Statement.NO_GENERATED_KEYS );
        for ( int i = 0; i < objets.length; i++ ) {
            preparedStatement.setObject( i + 1, objets[i] );
        }
        return preparedStatement;
    }
    public Produit map(ResultSet rs) throws SQLException
    {
    	Produit p=new Produit();
    	p.setIdProduit(rs.getInt(1));
    	p.setLibelle(rs.getString(2));
    	p.setDescription(rs.getString(3));
    	p.setPrix(rs.getDouble(4));
    	p.setdProduit(rs.getDate(5));
    	p.setPhoto(rs.getString(6));
    	
    	return p;
    }

    
	@Override
	public void add(Produit p) {
		 Connection connexion = null;
		    PreparedStatement preparedStatement = null;
		    ResultSet valeursAutoGenerees = null;

		try
		{
		connexion=df.getConnection();
		preparedStatement = initialisationRequetePreparee( connexion, SQL_INSERT, true,p.getLibelle(),p.getDescription(),p.getPrix(),p.getPhoto());
	/*	int rs=preparedStatement.executeUpdate();
		
		}catch ( SQLException e ) {
	        throw new DAOException( e );
	    } finally {
	        fermeturesSilencieuses(  preparedStatement, connexion );
	    }*/
	     int statut = preparedStatement.executeUpdate();
	        /* Analyse du statut retournï¿½ par la requï¿½te d'insertion */
	        if ( statut == 0 ) {
	            throw new DAOException( "ï¿½chec de la crï¿½ation de l'Client, aucune ligne ajoutï¿½e dans la table." );
	        }
	        /* Rï¿½cupï¿½ration de l'id auto-gï¿½nï¿½rï¿½ par la requï¿½te d'insertion */
	        valeursAutoGenerees = preparedStatement.getGeneratedKeys();
	        if ( valeursAutoGenerees.next() ) {
	            /* Puis initialisation de la propriï¿½tï¿½ id du bean Client avec sa valeur */
	            p.setId( valeursAutoGenerees.getLong( 1 ) );
	        } else {
	            throw new DAOException( "ï¿½chec de la crï¿½ation de l'Client en base, aucun ID auto-gï¿½nï¿½rï¿½ retournï¿½." );
	        }
	    } catch ( SQLException e ) {
	        throw new DAOException( e );
	    } finally {
	        fermeturesSilencieuses( valeursAutoGenerees, preparedStatement, connexion );
	    }
		
		
		
	}

	@Override
	public ArrayList<Produit> getAll() {
		Produit p;
		ArrayList<Produit> listeProduit=new ArrayList<Produit>();
		String   req="SELECT id_produit, intitile_produit, quantite_produit, prix_produit, date_ajout_produit, image_produit FROM produit";		try
		{
		connexion=df.getConnection();
		preparedStatement = initialisationRequetePreparee( connexion, req, false);
		resultSet = preparedStatement.executeQuery();
		while(resultSet.next())
		{
			
			p=map(resultSet);
			listeProduit.add(p);
		}
		return listeProduit;
		}
		catch ( SQLException e ) {
	        throw new DAOException( e );
	    } finally {
	        fermeturesSilencieuses( resultSet, preparedStatement, connexion );
	    }
		
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifier(int id) {
		// TODO Auto-generated method stub
		
	}
	
	/* Fermeture silencieuse du resultset */
	public static void fermetureSilencieuse( ResultSet resultSet ) {
	    if ( resultSet != null ) {
	        try {
	            resultSet.close();
	        } catch ( SQLException e ) {
	            System.out.println( "Échec de la fermeture du ResultSet : " + e.getMessage() );
	        }
	    }
	}
	 
	/* Fermeture silencieuse du statement */
	public static void fermetureSilencieuse( Statement statement ) {
	    if ( statement != null ) {
	        try {
	            statement.close();
	        } catch ( SQLException e ) {
	            System.out.println( "Échec de la fermeture du Statement : " + e.getMessage() );
	        }
	    }
	}
	 
	/* Fermeture silencieuse de la connexion */
	public static void fermetureSilencieuse( Connection connexion ) {
	    if ( connexion != null ) {
	        try {
	            connexion.close();
	        } catch ( SQLException e ) {
	            System.out.println( "Échec de la fermeture de la connexion : " + e.getMessage() );
	        }
	    }
	}
	 
	/* Fermetures silencieuses du statement et de la connexion */
	public static void fermeturesSilencieuses( Statement statement, Connection connexion ) {
	    fermetureSilencieuse( statement );
	    fermetureSilencieuse( connexion );
	}
	/* Fermetures silencieuses du resultset, du statement et de la connexion */
	public static void fermeturesSilencieuses( ResultSet resultSet, PreparedStatement preparedStatement, Connection connexion ) {
	    fermetureSilencieuse( resultSet );
	    fermetureSilencieuse(  preparedStatement );
	    fermetureSilencieuse( connexion );
	}
	

}
