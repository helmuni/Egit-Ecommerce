package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import config.ConnectionManager;

import bean.Client;
import bean.LoginBean;

public class LoginDAO
{
	
	
	
static Connection currentCon = null;
static ResultSet rs = null;
public static Client login(Client bean)
{
Statement stmt = null;
String username = bean.getLog();
String password = bean.getPass();
String searchQuery ="select * from client where login='" + username + "' AND pass='" + password + "'";

try
{
//connecting to the DB
currentCon = ConnectionManager.getConnection();
stmt=currentCon.createStatement();
rs = stmt.executeQuery(searchQuery);
boolean userExists = rs.next();

if (!userExists)
{
System.out.println("Username/Password entered is Incorrect or User doesnot Exists.");
bean.setValid(false);
}
else if (userExists)
{
String firstName = rs.getString("prenom");
String lastName = rs.getString("nom");
System.out.println("Bienvenue " + firstName);
bean.setNom(firstName);
bean.setPrenom(lastName);
bean.setValid(true);
}

}
catch (Exception ex)
{
System.out.println("Log In failed: An Exception has occurred! " + ex);
}
return bean;
}
}