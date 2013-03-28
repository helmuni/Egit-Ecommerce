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
                         <li><a href="indexU.jsp" class="nav"> Accueil </a></li>
                         <li><a href="lpr" class="nav">  Produits</a></li>
                         <li></li>
                         <li><a href="#" class="nav">Mon panier</a></li>
                         
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
     <div align="center">Promotion du mois:</div>
   </div>
	  <div class="offre">
        <div class="offre_title">
          <div align="center">offre speciale </div>
        </div>
                
        <div class="offre_img">
          <div align="center"><img src="" /></div>
                  
        </div>
               
        </div>
                
                
               
   
   
   	<div class="center_title_bar">
   	  <div align="center">Derniers produits:</div>
   	</div>
    
    	<div class="prod_box">

            <div class="center_prod_box">            
                 <div class="product_title"><a href="#"> xxxx</a></div>
                 <div class="product_img"><a href="#"><img src="imagetest/1.jpg" alt="" width="149" height="113" border="0" title="" /></a></div>
                 <div class="prod_price"><span class="price">prix</span></div>                     
          </div>
           
            <div class="prod_details_tab">
            <a href="#" class="prod_buy">Ajouter</a></div>                     
      </div>
    
    	<div class="prod_box">

            <div class="center_prod_box">            
                 <div class="product_title"><a href="#">cdee1</a></div>
                 <div class="product_img"><a href="#"><img src="imagetest/2.jpeg" alt="" width="117" height="117" border="0" title="" /></a></div>
                <div class="prod_price"><span class="price">prix</span></div>                       
            </div>
           
            <div class="prod_details_tab">
            <a href="#" class="prod_buy">Ajouter</a>          
                      
            </div>                     
        </div>    
 

     	<div class="prod_box">

            <div class="center_prod_box">            
                 <div class="product_title"><a href="#">cdee2</a></div>
                 <div class="product_img"><a href="#"><img src="imagetest/3.jpeg" alt="" width="117" height="117" border="0" title="" /></a></div>
                  <div class="prod_price"><span class="price">prix</span></div>                     
            </div>
           
            <div class="prod_details_tab">
            <a href="#" class="prod_buy">Ajouter</a></div>                     
        </div>
 
     	<div class="prod_box">

            <div class="center_prod_box">            
                 <div class="product_title"><a href="#">cdee3</a></div>
                 <div class="product_img"><a href="#"><img src="imagetest/4.jpg" alt="" width="124" height="90" border="0" title="" /></a></div>
                  <div class="prod_price"><span class="price">prix</span></div>                     
            </div>
           
            <div class="prod_details_tab">
            <a href="#" class="prod_buy">Ajouter</a></div>                     
        </div>
    
    	<div class="prod_box">

            <div class="center_prod_box">            
                 <div class="product_title">cdee4</div>
                 <div class="product_img"><a href="#"><img src="imagetest/5.jpg" alt="" width="100" height="90" border="0" title="" /></a></div>
                  <div class="prod_price"><span class="price">prix</span></div>                       
            </div>
           
            <div class="prod_details_tab">
            <a href="#" class="prod_buy">Ajouter</a></div>                     
        </div>    
 

   	  <div class="prod_box">

            <div class="center_prod_box">            
                 <div class="product_title"><a href="#">cdee5</a></div>
                 <div class="product_img"><a href="#"><a href="details.html">
                 <a href="details.html"></a><a href="#"><img src="imagetest/6.jpg" alt="" width="88" height="88" border="0" title="" /></a></div>
                 <div class="prod_price"><span class="price">prix</span></div>                         
          </div>
           
            <div class="prod_details_tab">
            <a href="#" class="prod_buy">Ajouter</a></div>                     
      </div>
   </div>
    
    	

     	  
    
   
   </div>



 <div class="right_content">
   <div class="border_box"><div class="title_box">Mon compte</div>
  
 <p align="left">
  <form action="Logout.jsp">
<input type="submit" value="déconnexion">  
        
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