package pl;

import com.opensymphony.xwork2.ActionSupport;

import metier.PersonneManager;

public class AjouterPersonne extends ActionSupport{

	private Long identifiant;
	private String login;
	private String prenom;
	private String nom;
	private String password;
	private String profile;
	
	public Long getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(Long identifiant) {
		this.identifiant = identifiant;
	}
	
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String AjouterUser(){
		
		try {
			String s=getProfile();
			int i;
			if(s.equals("Administrateur"))
				i=0;
			else
				i=1;
			PersonneManager.AddUsers(getPrenom(), getNom(), getLogin(), getPassword(), i);
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
}
