package pl;

import java.util.Collection;
import java.util.Iterator;

import metier.PersonneManager;
import modele.Personne;

import com.opensymphony.xwork2.ActionSupport;

public class AuthentificationVA extends ActionSupport {

	private String login;

	private String password;

	private String nom;

	private String prenom;


	public String execute() {
		
		Collection personnes = PersonneManager.getUsers(getLogin(), getPassword());
		for (Iterator iter = personnes.iterator(); iter.hasNext();) {
			Personne personne = (Personne) iter.next();
			System.out.println(personne.getNom());
			setNom(personne.getNom());
			setPrenom(personne.getPrenom());
			return "success";
		}
		return "error";
	}

	public String getProfil() {

		return "success";
	}
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

}
