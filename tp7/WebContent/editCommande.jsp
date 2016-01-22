<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
<body style="background:url('resources/282.jpg') no-repeat;">

	<jsp:include page="fragments/header.jsp"></jsp:include>

	<div class="container">

		<s:actionerror />

		<h2>Modifier Commande</h2>
		<b> <s:form action="ModifCom">
				<s:textfield key="commande.identifiant" name="identifiant" />
				<s:textfield key="commande.code" name="code" />
				<s:textfield key="commande.libelle" name="libelle" />
				<s:textfield key="commande.montant" name="montant" />
				<s:submit key="submit" />
			</s:form>
		</b>
	</div>
</body>
</html>