package dao;
import static dao.DAOUtilitaire.*;

import dao.ClientDao;
import bean.Client;
import bean.Produit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;




public class ClientDaoImp implements ClientDao {
	
	private DAOFactory daoFactory;
	
	ClientDaoImp( DAOFactory daoFactory ) {
        this.daoFactory = daoFactory;
    }
	

	private static final String SQL_INSERT = "INSERT INTO client (cin,login , pass,nom,prenom,email,tel,dateInscription) VALUES (?, ?, ?, ?, ?, ?, ?, NOW())";
	private static final String SQL_SELECT_PAR_LOG = "SELECT * FROM client WHERE login = ? and pass=? ";
	private static final String SQL_DELETE_PAR_NOM = "DELETE FROM client WHERE nom = ?";
	 
	/* Impl�mentation de la m�thode d�finie dans l'interface ClientDao */
	@Override
	public void creer( Client Client ) throws DAOException {
	    Connection connexion = null;
	    PreparedStatement preparedStatement = null;
	    ResultSet valeursAutoGenerees = null;
	    try {
	        /* R�cup�ration d'une connexion depuis la Factory */
	        connexion = daoFactory.getConnection();
	        preparedStatement = initialisationRequetePreparee( connexion, SQL_INSERT, true,Client.getCin(),Client.getLog(),Client.getPass(),Client.getNom(),Client.getPrenom(),Client.getEmail(),Client.getTel());
	        int statut = preparedStatement.executeUpdate();
	        /* Analyse du statut retourn� par la requ�te d'insertion */
	        if ( statut == 0 ) {
	            throw new DAOException( "�chec de la cr�ation de l'Client, aucune ligne ajout�e dans la table." );
	        }
	        /* R�cup�ration de l'id auto-g�n�r� par la requ�te d'insertion */
	        valeursAutoGenerees = preparedStatement.getGeneratedKeys();
	        if ( valeursAutoGenerees.next() ) {
	            /* Puis initialisation de la propri�t� id du bean Client avec sa valeur */
	            Client.setId( valeursAutoGenerees.getLong( 1 ) );
	        } else {
	            throw new DAOException( "�chec de la cr�ation de l'Client en base, aucun ID auto-g�n�r� retourn�." );
	        }
	    } catch ( SQLException e ) {
	        throw new DAOException( e );
	    } finally {
	        fermeturesSilencieuses( valeursAutoGenerees, preparedStatement, connexion );
	    }
	}
	
	/* Implémentation de la méthode définie dans l'interface ClientDao */
	@Override
	public void trouver(  Client Client ) throws DAOException {
	    Connection connexion = null;
	    PreparedStatement preparedStatement = null;
	    ResultSet resultSet = null;
	 
	    try {
	        /* Récupération d'une connexion depuis la Factory */
	        connexion = daoFactory.getConnection();
	        preparedStatement = initialisationRequetePreparee( connexion, SQL_SELECT_PAR_LOG, false, Client.getLog(),Client.getPass() );
	        resultSet = preparedStatement.executeQuery();
	        /* Parcours de la ligne de données de l'éventuel ResulSet retourné */
	        if ( resultSet.next() ) {
	            Client = map( resultSet );
	        }
	    } catch ( SQLException e ) {
	        throw new DAOException( e );
	    } finally {
	        fermeturesSilencieuses( resultSet, preparedStatement, connexion );
	    }
	 
	}
	private static final String SQL_SELECT_ALL = "SELECT * FROM Client";
	@Override
	public List<Client> findAll() throws Exception {
		// TODO Auto-generated method stub

	    Connection connexion = null;
	    PreparedStatement preparedStatement = null;
	    ResultSet resultSet = null;
	    List<Client> Client = null;
	 
	    try {
	        /* R�cup�ration d'une connexion depuis la Factory */
	        connexion = daoFactory.getConnection();
	        preparedStatement = initialisationRequetePreparee( connexion, SQL_SELECT_ALL, false);
	        resultSet = preparedStatement.executeQuery();
	        /* Parcours de la ligne de donn�es de l'�ventuel ResulSet retourn� */
	        if ( resultSet.next() ) {
	            Client.add(map( resultSet ));
	        }
	       return Client;
	    } catch ( SQLException e ) {
	        throw new DAOException( e );
	    } finally {
	        fermeturesSilencieuses( resultSet, preparedStatement, connexion );
	    }
	}
	
	
	 @Override
	    public void supprimer( String nom ) throws DAOException {
		 Connection connexion = null;
		    PreparedStatement preparedStatement = null;
		  
	 
	        try {
	            connexion = daoFactory.getConnection();
	            preparedStatement = initialisationRequetePreparee( connexion, SQL_DELETE_PAR_NOM, true, nom );
	            int statut = preparedStatement.executeUpdate();
	            if ( statut == 0 ) {
	                throw new DAOException( "Échec de la suppression du client, aucune ligne supprimée de la table." );
	            } else {
	            	nom=null;
	            }
	        } catch ( SQLException e ) {
	            throw new DAOException( e );
	        } finally {
	            fermeturesSilencieuses( preparedStatement, connexion );
	        }
	    }
	
	
	private static Client map( ResultSet resultSet ) throws SQLException {
		
	    Client Client = new Client();
	    Client.setId( resultSet.getLong( "id" ) );
	    Client.setCin(resultSet.getString( "cin" ));
	    Client.setLog(resultSet.getString( "login" ));
	    Client.setPass(resultSet.getString( "pass" ));
	    Client.setNom(resultSet.getString( "nom" ));
	    Client.setPrenom(resultSet.getString( "prenom" ));
	    Client.setTel(resultSet.getString( "tel" ));
	    Client.setEmail(resultSet.getString( "email" ));
	    Client.setDateInscription(resultSet.getDate( "dateInscription" ));
	 
	    
	    return Client;
	}
	
	
	
	private static Client map2( ResultSet resultSet ) throws SQLException {
		
	    Client Client = new Client();
	    Client.setCin(resultSet.getString( "cin" ));
	   Client.setNom(resultSet.getString( "nom" ));
	    Client.setPrenom(resultSet.getString( "prenom" ));
	    Client.setTel(resultSet.getString( "tel" ));
	    Client.setEmail(resultSet.getString( "email" ));
	    Client.setDateInscription(resultSet.getDate( "dateInscription" ));
	 
	    
	    return Client;
	}


	@Override
	public void update(String nom) throws Exception {
		// TODO Auto-generated method stub
		
		String SQL_UPDATE = "Update from Client set nom=\"toto\" where nom= \" "+nom+" \" ";
		Connection connexion = null;
	    PreparedStatement preparedStatement = null;
	    ResultSet resultSet = null;
	 
	    try {
	        /* Récupération d'une connexion depuis la Factory */
	        connexion = daoFactory.getConnection();
	        Statement st = connexion.createStatement();
	        st.executeUpdate(SQL_UPDATE);

	    } catch ( SQLException e ) {
	        throw new DAOException( e );
	    } finally {
	        fermeturesSilencieuses( resultSet, preparedStatement, connexion );
	    }
		
	}

	
	
	
	/*
	 * Simple méthode utilitaire permettant de faire la correspondance (le
	 * mapping) entre une ligne issue de la table des Clients (un
	 * ResultSet) et un bean Client.
	 */
	private static Client map1( ResultSet resultSet ) throws SQLException {
		  Client Client = new Client();
		    Client.setId( resultSet.getLong( "id" ) );
		    Client.setCin(resultSet.getString( "cin" ));
		  Client.setLog(resultSet.getString( "login" ));
		   Client.setPass(resultSet.getString( "pass" ));
		    Client.setNom(resultSet.getString( "nom" ));
		    Client.setPrenom(resultSet.getString( "prenom" ));
		    Client.setTel(resultSet.getString( "tel" ));
		    Client.setEmail(resultSet.getString( "email" ));
		    Client.setDateInscription(resultSet.getDate( "dateInscription" ));
	    return Client;
	}
	

	@Override
	public ArrayList<Client> getAll() {
		Client c;
		ArrayList<Client> listeClient=new ArrayList<Client>();
		String   req="SELECT cin, nom, prenom, email, tel , dateInscription   FROM client";		try
		{
			Connection con=daoFactory.getConnection();
			PreparedStatement ps = initialisationRequetePreparee( con, req, false);
			ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			
			c=map2(rs);
			listeClient.add(c);
		}
		return listeClient;
		}
		catch ( SQLException e ) {
	        throw new DAOException( e );
	    } finally {
	    }
		
	}

    
}