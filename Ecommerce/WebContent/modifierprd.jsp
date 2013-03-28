<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="stylee.css">
<title>Modifier un Produit</title>
</head>
<body>
<fieldset>
<legend>Modifier un Produit</legend>
<form action="AjouterProduit" method="Post">
<table>

<tr>
<td>Libelle*</td><td><input type="text" name="libelle" value="<%=request.getParameter("l")%>"
"></td>
</tr>

<tr>
<td>Description*</td><td><textarea rows="5" cols="20" value="<%=request.getParameter("d")%>" name="dspt" ></textarea></td>
</tr>


<tr>
<td>Prix*</td><td><input type="text" name="prix" value="<%=request.getParameter("p")%>"></td>
</tr>





<tr>
<td><input type="submit"  value="Modifier"></td>
<td><input type="reset"  value="Valider"></td>
</tr>
</table>
</form>
</fieldset>
</body>
</html>