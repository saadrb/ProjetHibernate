package pl;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.validation.SkipValidation;

import metier.PersonneManager;
import modele.Personne;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class AuthentificationVA extends ActionSupport {

	private Long identifiant;
	Map session;

	public Long getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(Long identifiant) {
		this.identifiant = identifiant;
	}

	private String login;

	private String password;

	private String nom;

	private String prenom;

	private int profile;

	public int getProfile() {
		return profile;
	}

	public void setProfile(int profile) {
		this.profile = profile;
	}

	public String execute() {

		Collection personnes = PersonneManager.getUsers(getLogin(), getPassword());
		for (Iterator iter = personnes.iterator(); iter.hasNext();) {
			Personne personne = (Personne) iter.next();
			System.out.println(personne.getNom());
			setNom(personne.getNom());
			setPrenom(personne.getPrenom());
			setIdentifiant(personne.getIdentifiant());
			setLogin(personne.getLogin());
			setProfile(personne.getProfile());
			session = ActionContext.getContext().getSession();
			session.put("idPersonne", getIdentifiant());
			session.put("profilePersonne", getProfile());
			session.put("nomPersonne", getNom());
			session.put("prenomPersonne", getPrenom());
			session.put("loginPersonne", getLogin());
			return "success";
		}
		return "error";
	}
	@SkipValidation
	public String decon() {

		session = ActionContext.getContext().getSession();
		session.clear();
		return "success";
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
