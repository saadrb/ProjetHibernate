<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib uri="/struts-tags" prefix="s"%>


<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Project Manager</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<link rel="stylesheet" href="/resources/css/home.css" type="text/css" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

</head>
<body >

	<jsp:include page="fragments/header.jsp"></jsp:include>

	<div class="container">


		<display:table name="listePersonnes" pagesize="5">

			<display:column property="identifiant"
				titleKey="personne.identifiant" />
			<display:column property="nom" titleKey="personne.nom" />
			<display:column property="prenom" titleKey="personne.prenom" />
			<display:column property="login" titleKey="personne.login" />
			<display:column property="password" titleKey="personne.password" />
			<display:column url="/editPersonne.action" paramId="identifiant"
				paramProperty="identifiant">Modifier</display:column>
			<display:column url="/supprimerPersonne.action" paramId="identifiant"
				paramProperty="identifiant">Supprimer</display:column>

		</display:table>



		<a href="AjouterUsers.action">Ajouter </a>
	</div>
</body>
</html>
