<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    	
    	<%@ page import="java.util.ArrayList" %> 
 <%@ page import="bean.Produit" %> 

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252" />
<title>Ecommerce </title>


</head>
<body>


                
                
               
   
   
   	<div class="center_title_bar">
   	  <div align="center">les  produits:</div>
   	</div>
    <% ArrayList<Produit> listeProduit= ( ArrayList)request.getAttribute("listeProduit");%>
    <% for(int i=0;i<listeProduit.size();i++)
   { 
    	
	Produit p=(Produit)listeProduit.get(i); 
	out.println("<div>");
	out.println("<hr>");
	out.println("<div>");
	out.println(p.getPhoto());
	//out.println("<img src=Images/images/photo3.jpg>");
	//out.println("<img src=Images/images/"+p.getPhoto()+">");
	out.println("</div>");
	out.println("<div>");
	out.println("<br>ID:"+p.getIdProduit()); 
    out.println("<br>Produit :"+p.getLibelle()); 
    out.println("<br>Prix :"+p.getPrix()+ "DH"); 
    out.println("<br>Description :"+p.getDescription()); 
    out.println("<br><br><center><a href=PrepareModifierProduit?id="+p.getIdProduit()+"><img src=Images/Icones/modifier.png></a>  <a href=SupprimerProduit?id="+p.getIdProduit()+"><img src=Images/Icones/supprimer.png></a></center> ");
    out.println("</div>");
    out.println("</div><br>"); 
   }

	%>
    

     	  

       
<div class="banner_adds"></div>        
     
   </div>  


            
   </div>
   
   
   
 

</div>
</body>
</html>