<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib uri="/struts-tags" prefix="s"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- <link rel="stylesheet" href="/WEB-INF/template/displaytag.css"
	type="text/css"></link>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> -->
<title>Insert title here</title>
</head>
<body>

    
		<display:table name="listePersonnes" pagesize="5" >
	
			<display:column property="identifiant" titleKey="personne.identifiant" />
			<display:column property="nom" titleKey="personne.nom"  />
			<display:column property="prenom" titleKey="personne.prenom"  />
			<display:column property="login" titleKey="personne.login" />
			<display:column property="password" titleKey="personne.password" />
			<display:column url="/editPersonne.action" paramId="identifiant" paramProperty="identifiant">Modifier</display:column>
			<display:column url="/supprimerPersonne.action" paramId="identifiant" paramProperty="identifiant">Supprimer</display:column>
			
		</display:table>



<a href="AjouterUsers.action">Ajouter </a>

</body>
</html>
