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

<s:actionerror />

<h2>Modifier Personne</h2>
	<b> <s:form action="ModifUser">
			<s:textfield key="personne.identifiant" name="identifiant" />
			<s:textfield key="personne.login" name="login" />
			<s:textfield key="personne.nom" name="nom"  />
			<s:textfield key="personne.prenom" name="prenom" />
			<s:password key="personne.password" name="password" />
			<s:textfield key="personne.profile" name="profile" />
			<s:submit key="submit" />
		</s:form>
	</b>
</body>
</html>
