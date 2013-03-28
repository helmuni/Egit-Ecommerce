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
<title>Pixel shop </title>
<link rel="stylesheet" type="text/css" href="style.css" />


</head>
<body>
<div id="main_container">

	<div id="header">

       <div class="top_right">
  <div class="big_banner">      <noscript>
            </noscript>
           <form method="post" action="">
             <fieldset>
               <input type="text" name="search" id="search-text" value="Recherche" />
               <input type="submit" id="search-submit" value=""/>
             </fieldset>
           </form>
         </div>
        
      </div>
    
  
      <div id="logo"><a href="index.html"><img src="imagetest/logo.png" alt="" title="" border="0" width="132" height="107" /></a></div>
   
                    

  </div>
    
   <div id="main_content"> 
   
     <div id="menu_tab">
       <ul class="menu">
                         <li><a href="index.jsp" class="nav"> Accueil </a></li>
                         <li><a href="preflex.jsp" class="nav">  Produits</a></li>
                         <li></li>
                         <li><a href="#" class="nav">Mon panier</a></li>
                         <li><a href="#" class="nav">Mon compte</a></li>
                         <li></li>
                         <li><a href="#" class="nav">S'inscrire</a></li>
                         <li> <a href="#" class="nav"> Contactez-nous</a></li>
					   <div id="search"></div>
                       
       </ul>
     </div>
            
        
    
   <div class="left_content">
    <div class="title_box">Categories</div>
    
      <ul class="left_menu">
        <li class="odd"><a href="#">Reflex</a></li>
        <li class="odd"><a href="#">Compact</a></li>
        <li class="odd"><a href="#">Objectifs</a></li>
         <li class="odd"><a href="#">Accessoires</a></li>
         <li class="odd"><a href="#">Netoyage</a></li>
         
      </ul>
     
     
     <div class="banner_adds">
     
    
     </div>    
        
    
   </div>


 <div class="center_title_bar">
    
            
               
     <div align="center">Reflex:</div>
   
   
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
   
                   
                            <img src="<%	out.println(p.getPhoto());  %>" alt="product image">
                        </td>
                        <td class="white">
<%    out.println(p.getLibelle());  %>                            <br>
                            <span class="smallText"><%    out.println(p.getDescription());  %></span>
                        </td>
                        <td class="white"><%    out.println(p.getPrix()+ "DH");  %></td>
                        <td class="white">
                            <form action="#" method="post">
                                <input type="submit" value="ajouter">
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



 <div class="right_content">
   <div class="border_box"><div class="title_box">Mon compte</div>  
 <p align="left">
 <form action="#" method="post">
           <label for="1">Pseudo:</label>
           <input id="1" type="text" name="pseudo" class="newsletter_input"/><br/>
           <label for="2">Mot de passe:</label>
           <input id="2"  type="password" name="passwd" class="newsletter_input"/>
           <input type="submit" value="Se connecter"/>
           </form>
        
</div>  
     

     
 
   		<div class="shopping_cart">
        	<div class="title_box">Panier</div>
            
            <div class="cart_details">
            3 articles<br />
            <span class="border_cart"></span>
           
            </div>
            
            <div class="cart_icon"><a href="#" title=""><img src="images/shoppingcart.png" alt="" title="" width="35" height="35" border="0" /></a></div>
        
        </div>
	  <div class="border_box">
	    <div class="product_img"></div>
</div>  
     
     
     
    <div class="title_box">Partager le service sur:</div>
    
        <ul class="left_menu">
<li class="cart_icon"><a href="http://facebook.com/"> <img align="center" src="images/facebook.png" width="27" height="27"/></li>
 
<li class="cart_icon"><a href="http://twitter.com/"> <img align="center" src="images/twitter.png" width="27" height="27"/></li>
 </ul>
       
<div class="banner_adds"></div>        
     
   </div>  


            
   </div>
   
   
   
   <div class="footer">
   

        <div class="left_footer"></div>
        
        <div class="center_footer"><br />
          <br />
        <img src="images/payment.gif" alt="" title="" />
        </div>
        
        <div class="right_footer">
        <a href="index.html">Accueil</a>
        
        <a href="contact.html">contactez nous</a>
        </div>   
   
   </div>                 


</div>
</body>
</html>