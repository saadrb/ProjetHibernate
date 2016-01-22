<%@ taglib uri="/struts-tags" prefix="s"%>
<nav class="navbar navbar-default">
	<div class="container-fluid">

		<div class="navbar-header">
			<a class="navbar-brand" href="#">Hibernate Project</a>
		</div>

		<ul class="nav navbar-nav">

			<li><a href="accueil.action">Accueil</a></li>
			<s:if test="%{#session.profilePersonne == 0}">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-expanded="false">Gestion
						Utilisateurs <span class="caret"></span>
				</a>

					<ul class="dropdown-menu" role="menu">
						<li><a href="consultePersonne.action">Afficher les
								utilisateurs</a></li>
						<li><a href="AjouterUsers.action">Ajouter un nouveau
								utilisateurs</a></li>
					</ul></li>

			</s:if>
			<s:else>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-expanded="false">Gestion
						Commandes <span class="caret"></span>
				</a>

					<ul class="dropdown-menu" role="menu">
						<li><a href="consulteCommande.action">Consulter mes
								commandes</a></li>
						<li><a href="AjouterComs.action">Ajouter une nouvelles
								commandes</a></li>
					</ul></li>
			</s:else>
			<li><a href="deco.action">Se déconnecter</a></li>





		</ul>

	</div>
</nav>