<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Project Manager</title>


<link rel="stylesheet" href="resources/css/style.css">

</head>

<body>

	<div class="wrapper">
		<div class="container">
			<h1>Bienvenu</h1>
			<s:actionerror />

			<s:form action="connection">
				<s:textfield key="personne.login" name="login" />
				<s:password key="personne.password" name="password" />
				<s:submit key="submit" />
			</s:form>
		</div>

		<ul class="bg-bubbles">
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
		</ul>
	</div>
	<script
		src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

	<script src="resources/js/index.js"></script>
</body>
</html>