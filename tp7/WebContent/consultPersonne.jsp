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
			<display:column property="nom" title="nom"  />
			<display:column property="prenom" title="prenom"  />
			<display:column property="login" title="login" />
			<display:column property="password" title="password" />
			<display:column url="/editPersonne.action" paramId="identifiant" paramProperty="identifiant">Modifier</display:column>
			<display:column url="/supprimerPersonne.action" paramId="identifiant" paramProperty="identifiant">Supprimer</display:column>
			
		</display:table>

<!-- 
<table>
	<tr>
		<td>Modification</td>
		<td>Suppression</td>
		<td>Codes</td>
		<td>Nom</td>
		<td>Montant</td>
	</tr>
	<s:iterator value="listeCommandes" status="stat">
		<tr>
			<td><s:url id="modifUrl" action="editModifierCommande">
				<s:param name="code" value="code" />
				<s:param name="libelle"  value="libelle"/>
				<s:param name="montant" value="montant" />
			</s:url> <s:a href="%{modifUrl}">Modifier</s:a></td>
			<td><s:url id="supprimUrl" action="supprimerCommande">
				<s:param name="code" value="code" />				
			</s:url> <s:a href="%{supprimUrl}">Supprimer</s:a></td>
			<td><s:property value="code" /></td>
			<td><s:property value="libelle" /></td>
			<td><s:property value="montant" /></td>
		</tr>
	</s:iterator>
</table>

 -->

<a href="AjouterUsers.action">Ajouter </a>

</body>
</html>
