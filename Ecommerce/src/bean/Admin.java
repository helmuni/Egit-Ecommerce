package bean;



public class Admin {
	
	private String  login ;
	private String  pass ;
	public boolean valid;

	
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
	
	
}
