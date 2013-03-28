package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import config.ConnectionManager;

import bean.Admin;
import bean.Client;
import bean.LoginBean;

public class Login2DAO
{
	
	
	
static Connection currentCon = null;
static ResultSet rs = null;
public static Admin login(Admin bean)
{
Statement stmt = null;
String username = bean.getLogin();
String password = bean.getPass();
String searchQuery ="select * from Admin where login='" + username + "' AND pass='" + password + "'";

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
String user = rs.getString("login");
System.out.println("Bienvenue " + user);
bean.setLogin(user);

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