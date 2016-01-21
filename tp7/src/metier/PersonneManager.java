package metier;

import java.util.Collection;

import dao.PersonneDAO;
import modele.Personne;

public class PersonneManager {

	public static Collection getUsers(String login, String password) {

		String requette = "from Personne where login='" + login + "' and  password='" + password + "'";

		Collection personnes = PersonneDAO.getListePersonne(requette);

		return personnes;
	}
	
	public static Collection getUser() {

		String requette = "from Personne order by nom";

		Collection personnes = PersonneDAO.getListePersonne(requette);

		return personnes;
	}
	
	public static Collection getSelectUser(Long id) {
		String requette = "from Personne where identifiant='" + id + "'";

		Collection personnes = PersonneDAO.getListePersonne(requette);

		return personnes;
	}

	public static void AddUsers(String prenom, String nom, String login, String password, int profile) throws Exception {

		Personne personne = new Personne(login, nom, password, prenom, profile);
		PersonneDAO.ajouterPersonne(personne);
	}

	public static void  UpdateUsers(Long id,String prenom, String nom,String login, String password, int profile) throws Exception{
		
		Personne p=new Personne();
		PersonneDAO.getPersonne(id);
		p.setIdentifiant(id);
		p.setLogin(login);
		p.setNom(nom);
		p.setPrenom(prenom);
		p.setPassword(password);
		p.setProfile(profile);
		PersonneDAO.modifierPersonne(p);
	}

	public static void   DeleteUsers(Long id) throws Exception{
	
		Personne personne=new Personne();
		PersonneDAO.getPersonne(id);
		personne.setIdentifiant(id);
		PersonneDAO.SupprimerPersonne(personne);
	}

}
