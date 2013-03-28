package dao;

import java.util.List;
import java.util.ArrayList;
import bean.Produit;

import bean.Client;

public interface ClientDao {
 
    void creer( Client Client ) throws Exception;
    void trouver(Client Client ) throws DAOException;
    void update(String nom) throws Exception;
	List<Client> findAll() throws Exception;
		public abstract ArrayList<Client> getAll();
	
	
	void supprimer(String nom) throws DAOException;
	
    
}
