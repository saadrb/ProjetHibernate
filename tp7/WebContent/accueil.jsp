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
		<H1>
			Bonjour Mr:
			<s:label name="#session.nomPersonne" />
			<s:label name="#session.prenomPersonne" />
			<br>
			Vous vous etes connecté sous le login de :
			<s:label name="#session.loginPersonne" />
			<br><br>
			Et votre role est un :
			<s:if test="%{#session.profilePersonne == 0}">
				<s:label value="Administrateur" />
			</s:if>
			<s:else>
				<s:label value="Simple utilisateur" />
			</s:else>
		</H1>


	</div>
</body>
</html>