package bean;


import java.sql.Date;

public class Commande {
	
	private String  codeCmd ;
    private Date dateCmd;
  
	public Commande(String  code, Date date){
		this.codeCmd=code;
		this.dateCmd=date;
	}

	public String getCodeCmd() {
		return codeCmd;
	}

	public void setCodeCmd(String codeCmd) {
		this.codeCmd = codeCmd;
	}

	public Date getDateCmd() {
		return dateCmd;
	}

	public void setDateCmd(Date dateCmd) {
		this.dateCmd = dateCmd;
	}
	
}
