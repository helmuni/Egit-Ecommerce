package dao;
import static dao.DAOUtilitaire.*;

import dao.AdminDao;
import bean.Admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;




public class AdminDaoImp implements AdminDao {
	
	private DAOFactory daoFactory;
	
	AdminDaoImp( DAOFactory daoFactory ) {
        this.daoFactory = daoFactory;
    }
	

	private static final String SQL_SELECT_PAR_LOG = "SELECT * FROM admin WHERE login = ? and pass=? ";
	 
	
	/* Implémentation de la méthode définie dans l'interface AdminDao */
	@Override
	public void trouver(  Admin Admin ) throws DAOException {
	    Connection connexion = null;
	    PreparedStatement preparedStatement = null;
	    ResultSet resultSet = null;
	 
	    try {
	        /* Récupération d'une connexion depuis la Factory */
	        connexion = daoFactory.getConnection();
	        preparedStatement = initialisationRequetePreparee( connexion, SQL_SELECT_PAR_LOG, false, Admin.getLogin(),Admin.getPass() );
	        resultSet = preparedStatement.executeQuery();
	        /* Parcours de la ligne de données de l'éventuel ResulSet retourné */
	        if ( resultSet.next() ) {
	            Admin = map( resultSet );
	        }
	    } catch ( SQLException e ) {
	        throw new DAOException( e );    

	    } finally {
	        fermeturesSilencieuses( resultSet, preparedStatement, connexion );
	    }
	 
	}
	private static final String SQL_SELECT_ALL = "SELECT * FROM Admin";
	@Override
	public List<Admin> findAll() throws Exception {
		// TODO Auto-generated method stub

	    Connection connexion = null;
	    PreparedStatement preparedStatement = null;
	    ResultSet resultSet = null;
	    List<Admin> Admin = null;
	 
	    try {
	        /* R�cup�ration d'une connexion depuis la Factory */
	        connexion = daoFactory.getConnection();
	        preparedStatement = initialisationRequetePreparee( connexion, SQL_SELECT_ALL, false);
	        resultSet = preparedStatement.executeQuery();
	        /* Parcours de la ligne de donn�es de l'�ventuel ResulSet retourn� */
	        if ( resultSet.next() ) {
	            Admin.add(map( resultSet ));
	        }
	       return Admin;
	    } catch ( SQLException e ) {
	        throw new DAOException( e );
	    } finally {
	        fermeturesSilencieuses( resultSet, preparedStatement, connexion );
	    }
	}
	
	
	
	
	private static Admin map( ResultSet resultSet ) throws SQLException {
		
	    Admin Admin = new Admin();
	   
	    Admin.setLogin(resultSet.getString( "login" ));
	    Admin.setPass(resultSet.getString( "pass" ));
	    
	    return Admin;
	}


	

	
	
	
	/*
	 * Simple méthode utilitaire permettant de faire la correspondance (le
	 * mapping) entre une ligne issue de la table des Admins (un
	 * ResultSet) et un bean Admin.
	 */
	private static Admin map1( ResultSet resultSet ) throws SQLException {
		  Admin Admin = new Admin();
		    
		    Admin.setLogin(resultSet.getString( "login" ));
		    Admin.setPass(resultSet.getString( "pass" ));
	    return Admin;
	}


	
	

    
}