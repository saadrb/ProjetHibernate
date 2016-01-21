<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib uri="/struts-tags" prefix="s"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="/WEB-INF/template/displaytag.css"
	type="text/css"></link>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

    
		<display:table name="listeCommandes" pagesize="5" >
	
			<display:column property="identifiant" titleKey="commande.identifiant" />
			<display:column property="code" titleKey="commande.code"  />
			<display:column property="libelle" titleKey="commande.Libelle"  />
			<display:column property="montant" title="commande.montant" />
			<display:column url="/editCommande.action" paramId="code" paramProperty="code">Modifier</display:column>
			<display:column url="/supprimerCommande.action" paramId="identifiant" paramProperty="identifiant">Supprimer</display:column>
			
		</display:table>


<a href="AjouterCom.action">Ajouter </a>

</body>
</html>
