<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.DriverManager"%>

    	
    	<%@ page import="java.util.ArrayList" %> 
 <%@ page import="bean.Client" %> 

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
    <%  out.println("la liste des clients"); ArrayList<Client> listeClient= ( ArrayList)request.getAttribute("listeClient");%>
    <% for(int i=0;i<listeClient.size();i++)
   { 	Client p=(Client)listeClient.get(i); 
 %>
    <tr>
                       
                        <td class="white">
<%    out.println(p.getCin());  %>                            <br>
                            <span class="smallText"><%    out.println(p.getNom());   out.println(p.getPrenom());  %></span>
                        </td>
                        <td class="white"><%    out.println(p.getEmail());  %></td>
                                                <td class="white"><%    out.println(p.getTel()+ "DH");  %></td>
                                                <td class="white"><%    out.println(p.getDateInscription()+ "DH");  %></td>
                        
                        <td class="white">
                            <form action="modifiercl.jsp" method="post">
                            <input type="hidden" name="l" value="<%    out.println(p.getCin());  %> "> 
                             <input type="hidden" name="d" value="<%    out.println(p.getNom());  %> "> 
                             <input type="hidden" name="p" value="<%    out.println(p.getPrenom());  %> "> 
                             
                             
                            
                            
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