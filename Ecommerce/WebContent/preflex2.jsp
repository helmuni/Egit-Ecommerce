<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.DriverManager"%>

    	
    	<%@ page import="java.util.ArrayList" %> 
 <%@ page import="bean.Produit" %> 

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252" />
<title> </title>
<link rel="stylesheet" type="text/css" href="style.css" />


</head>
<body>

    
  
   
   </div>
   <div class="center_content">
   <div id="categoryRightColumn">
      <table id="productTable">
    <% ArrayList<Produit> listeProduit= ( ArrayList)request.getAttribute("listeProduit");%>
    <% for(int i=0;i<listeProduit.size();i++)
   { 	Produit p=(Produit)listeProduit.get(i); 
 %>
    <tr>
                       
                        <td class="white">
<%    out.println(p.getLibelle());  %>                            <br>
                            <span class="smallText"><%    out.println(p.getDescription());  %></span>
                        </td>
                        <td class="white"><%    out.println(p.getPrix()+ "DH");  %></td>
                        <td class="white">
                            <form action="modifierprd.jsp" method="post">
                            <input type="hidden" name="l" value="<%    out.println(p.getLibelle());  %> "> 
                             <input type="hidden" name="d" value="<%    out.println(p.getDescription());  %> "> 
                             <input type="hidden" name="p" value="<%    out.println(p.getPrix());  %> "> 
                             
                             
                            
                            
                                <input type="submit" value="modifier">
                            </form>
                        </td>
                    </tr>
    	
	<% 
	
   }

	%>
               

             

                </table>
            </div> 
     </div>  
  
    
    	

     	  
    
   
   </div>



</div>  
     
     
  
</body>
</html>