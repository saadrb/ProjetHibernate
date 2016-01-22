<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib uri="/struts-tags" prefix="s"%>


<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Project Manager</title>
<style>
  .even {background-color:orange;}
  .odd {background-color:yellow;}
  </style>

</head>
<body >

	<jsp:include page="fragments/header.jsp"></jsp:include>

	<div class="container">

		<display:table name="listeCommandes" pagesize="5">

			<display:column property="identifiant"
				titleKey="commande.identifiant" />
			<display:column property="code" titleKey="commande.code" />
			<display:column property="libelle" titleKey="commande.Libelle" />
			<display:column property="montant" title="commande.montant" />
			<display:column url="/editCommande.action" paramId="code"
				paramProperty="code">Modifier</display:column>
			<display:column url="/supprimerCommande.action" paramId="identifiant"
				paramProperty="identifiant">Supprimer</display:column>

		</display:table>


		<a href="AjouterCom.action">Ajouter </a>
	</div>
</body>
</html>
