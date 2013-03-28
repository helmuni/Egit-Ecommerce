package bean;

import java.util.Date;


public class Client {
	private long Id;	
	private String  log ;
	private String  pass ;
	private String  cin ;
	private String  prenom;
	public boolean valid;
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	private String  nom;
	private String  tel;
	private String  email;
	 private Date dateInscription;

	
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
		
	public String getLog() {
		return log;
	}
	public void setLog(String log) {
		this.log = log;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

	public Date getDateInscription() {
		return dateInscription;
	}
	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}


	
}
