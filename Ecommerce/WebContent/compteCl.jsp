<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252" />
<title>Ecommerce </title>
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
                         <li><a href="lpr" class="nav">  Produits</a></li>
                         <li></li>
                         <li><a href="#" class="nav">Mon panier</a></li>
                         
                         <li><a href="compteCl.jsp" class="nav">S'inscrire</a></li>
                         <li> <a href="#" class="nav"> Contactez-nous</a></li>
					   <div id="search"></div>
                       
       </ul>
     </div>
            
        
    
   <div class="left_content">
    <div class="title_box">Categories</div>
    
      <ul class="left_menu">
         <li class="odd"><a href="#">Accessoires</a></li>
         <li class="odd"><a href="#">Netoyage</a></li>
         
      </ul>
     
     
     <div class="banner_adds">
     
    
     </div>    
        
    
   </div>



   <div class="center_content">
   <div class="center_title_bar">
     <div align="center">La création d'un compte:</div>
   </div>
	 <table width="100%" border="0">
  <tbody><tr>
      <h2>  <p align="center" > </p></h2>
        
        <form action= "Inscription" method="post">
        <table border="0" align="center">
          <tr>
            <td width="142"><label>Login : </label></td>
            <td width="120"><input type="text" name="log" size="20"/></td>
          </tr>
		  
          <tr>
	<td><label>Password : </label></td>         <td><input type="password" name="pass" size="20"/></td>
	
</tr>
<tr>
	<td><label>Cin : </label></td>       
	<td><input type="text" name="cin" size="20" maxlenght="2"/></td>
	
</tr>
<tr>
	<td><label>Nom : </label></td>       
	<td><input type="text" name="nom" size="20" maxlenght="2"/></td>
	
</tr>
  <tr>
	<td><label>Prénom  : </label></td>         <td><input type="text" name="pre" size="20"/></td>
	
</tr>
<tr>
	<td><label>Tél : </label></td>         <td><input type="text" name="tel" size="30"/></td>
	
</tr>
<tr>
	<td><label>l'email : </label></td>         <td><input type="text" name="email" size="30"/></td>
	
</tr>
 



<tr>
	
	
	<td></td><td><center>	<input type="submit" value="Valider" style="width:80px; height:25px"/></center></td>
</tr>

</table>
                  
        </div>
               
        </div>
                
                
               
   



 <div class="right_content">
   <div class="border_box"><div class="title_box">Mon compte</div>  
 <p align="left">
 <form action="chercher" method="post">
           <label for="1">Pseudo:</label>
           <input id="1" type="text" name="userName" class="newsletter_input"/><br/>
           <label for="2">Mot de passe:</label>
           <input id="2"  type="password" name="password" class="newsletter_input"/>
           <input type="submit" value="Se connecter"/>
           </form>
        
</div>  
     

     
 
   		<div class="shopping_cart">
        	<div class="title_box">Panier</div>
            
            <div class="cart_details">
            3 articles<br />
            <span class="border_cart"></span>
            Total: <span class="price">460 dh</span>
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
   
   
   
              


</div>
</body>
</html>