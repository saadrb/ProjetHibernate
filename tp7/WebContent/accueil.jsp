<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<H1>Bonjour <s:label name="nom" /> <s:label name="prenom" /></H1> 



<a href="consulteCommande.action">Lister toutes les commandes  </a>
<br>
<a href="consultePersonne.action">Lister toutes les personnes  </a>
<br>
<a href="AjouterUsers.action">Ajouter Client</a>

</body>
</html>