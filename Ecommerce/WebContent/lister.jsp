<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.ArrayList" %> 
    <%@ page import="bean.Produit" %>  
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="style.css" rel="stylesheet" type="text/css" media="screen" />

<title>Insert title here</title>
</head>

 <body>
   
    			<% ArrayList<Produit> listeProduit=(ArrayList)request.getAttribute("listeProduit1"); %>
                <%
			for(int i=0;i<listeProduit.size();i++)
			   { 
				Produit p=(Produit)listeProduit.get(i); 
	   
			  
	%>
    	<div class="prod_box">

            <div class="center_prod_box">                            
                <div class="product_img"><a href="#"><img src="<%out.println("<br>"+p.getPhoto());  %>" alt="" width="149" height="113" border="0" title="" /></a></div>
                 <div class="product_title"><a href="#"><% out.println("<br>"+p.getLib());  %></a></div>                
				<div class="prod_price"><span class="price">1222</span></div>                     
            </div>
           			<%} %>
           
            <div class="prod_details_tab">
            <a href="#" class="prod_buy">Au panier</a></div>                     
        </div>
    
    	<div class="prod_box">

            <div class="center_prod_box">            
                 
                 <div class="product_img"><a href="#"><img src="images/stylo-espion-en-camera-cachee-audio-video-grande-resolution-1086547s0.jpg" alt="" width="117" height="117" border="0" title="" /></a></div>
               <div class="product_title"><a href="#">Stylo en camera cachee</a></div>
			   <div class="prod_price"><span class="price">600 Dhs</span></div>                       
            </div>
           
            <div class="prod_details_tab">
            <a href="#" class="prod_buy">Au panier</a>          
                      
            </div>                     
        </div>    
 

     	<div class="prod_box">

            <div class="center_prod_box">            
               
                    <div class="product_img"><a href="#"><img src="images/tv-samsung-led-1288330s0.jpg" alt="" width="117" height="117" border="0" title="" /></a></div>
                   <div class="product_title"><a href="#">TV samsung led</a></div>                 
                   <div class="prod_price"><span class="price">3800 Dhs</span></div>                     
            </div>
           
            <div class="prod_details_tab">
            <a href="#" class="prod_buy">Au panier</a></div>                     
        </div>
 
     	                   
      </div>
   </div>
    
    	

     	  
    
   
   </div>
				</body>
</html>