package pl;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import metier.PersonneManager;
import modele.Personne;

public class ConsultePersonne extends ActionSupport implements ServletRequestAware {

	private Long identifiant;
	private String login;
	private String prenom;
	private String nom;
	private String password;
	private HttpServletRequest request;
	private int profile;
	private Personne p;

	public int getProfile() {
		return profile;
	}

	public void setProfile(int profile) {
		this.profile = profile;
	}

	public Long getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(Long identifiant) {
		this.identifiant = identifiant;
	}

	public String listUser() {

		Collection personnes = PersonneManager.getUser();
		for (Iterator iter = personnes.iterator(); iter.hasNext();) {
			Personne personne = (Personne) iter.next();
			setNom(personne.getNom());
			setPrenom(personne.getPrenom());
			setLogin(personne.getLogin());
			setPassword(personne.getPassword());
			setProfile(personne.getProfile());
		}
		request.setAttribute("listePersonnes", personnes);
		return "success";
	}

	public String getUser() {
		String id = request.getParameter("identifiant");
		Collection personnes = PersonneManager.getSelectUser(Long.parseLong(id));
		for (Iterator iter = personnes.iterator(); iter.hasNext();) {
			p = (Personne) iter.next();
			setIdentifiant(Long.parseLong(id));
			setNom(p.getNom());
			setPrenom(p.getPrenom());
			setLogin(p.getLogin());
			setPassword(p.getPassword());
			// String s;
			// if(p.getProfile()==1)
			// s="Utilisateur";
			// else
			// s="Administrateur";
			// setProfile(p.getProfile());
		}
		return "success";
	}

	public String ModifierUser() {

		try {
			PersonneManager.UpdateUsers(getIdentifiant(), getPrenom(), getNom(), getLogin(), getPassword(),
					getProfile());
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "error";
	}

	public String SupprimerUser() {
		try {
			String id = request.getParameter("identifiant");
			System.out.println(Long.parseLong(id));
			PersonneManager.DeleteUsers(Long.parseLong(id));
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "error";
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
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

	@Override
	public void setServletRequest(HttpServletRequest httpServletRequest) {
		this.request = httpServletRequest;
	}

}
