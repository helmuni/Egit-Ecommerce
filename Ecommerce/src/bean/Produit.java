package bean;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Produit implements Serializable{
	private long Id;	

public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

private  String libelle,description,photo,etatProduit;
private  double prix;
private int categorie,idProduit;
private Date dProduit=null;

public Produit(){}

public String getLibelle() {
	return libelle;
}

public void setLibelle(String libelle) {
	this.libelle = libelle;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public String getPhoto() {
	return photo;
}

public void setPhoto(String photo) {
	this.photo = photo;
}

public String getEtatProduit() {
	return etatProduit;
}

public void setEtatProduit(String etatProduit) {
	this.etatProduit = etatProduit;
}

public double getPrix() {
	return prix;
}

public void setPrix(double prix) {
	this.prix = prix;
}

public int getCategorie() {
	return categorie;
}

public void setCategorie(int categorie) {
	this.categorie = categorie;
}

public int getIdProduit() {
	return idProduit;
}

public void setIdProduit(int idProduit) {
	this.idProduit = idProduit;
}

public Date getdProduit() {
	return dProduit;
}

public void setdProduit(Date dProduit) {
	this.dProduit = dProduit;
}


}
