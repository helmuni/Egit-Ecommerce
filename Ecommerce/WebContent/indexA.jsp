<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="ad.css" rel="stylesheet" type="text/css" media="screen" />
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="ad.css" />
<link rel="stylesheet" type="text/css" href="ad.css" />
</head>

<body class="login">

<!-- Container -->
<div id="container">

    
    <!-- Header -->
    <div id="header">
        <div id="branding">
        
<h1 id="site-name">Ecommerce administration</h1>

        </div>
        
        
    </div>
    <!-- END Header -->
    
    

    
        
    

    <!-- Content -->
    <div id="content" class="colM">
        
        
        




<div id="content-main">
<form action="TraitAdmin" method="get" id="login-form"><div style='display:none'><input type='hidden' name='csrfmiddlewaretoken' value='I5P2i3TPRj2l7WXXjXhymv2rWKh0c8xn' /></div>
  <div class="form-row">
    
    <label for="id_username" class="required">Nom d'utilisateur :</label> <input id="id_username" type="text" name="log" maxlength="30" />
  </div>
  <div class="form-row">
    
    <label for="id_password" class="required">Mot de passe :</label> <input type="password" name="pass" id="id_password" />
    <input type="hidden" name="this_is_the_login_form" value="1" />
    <input type="hidden" name="next" value="/" />
  </div>
  
  
  <div class="submit-row">
    <label>&nbsp;</label><input type="submit" value="Connexion" />
  </div>
</form>


</div>

        
        <br class="clear" />
    </div>
    <!-- END Content -->

    <div id="footer"></div>
</div>
<!-- END Container -->

</body>
</html>
