package bean;


public class Categorie {
	
	private String  codeCat ;
	private String  lib;
	
	
	public Categorie(String  codeCat,String lib){
		this.codeCat=codeCat;
		this.lib=lib;
	}
	public Categorie(){}


	public String getCodeCat() {
		return codeCat;
	}


	public void setCodeCat(String codeCat) {
		this.codeCat = codeCat;
	}


	public String getLib() {
		return lib;
	}


	public void setLib(String lib) {
		this.lib = lib;
	}

}
