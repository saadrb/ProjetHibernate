package pl;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import metier.CommandeManager;
import metier.PersonneManager;
import modele.Commande;
import modele.Personne;

public class GestionCommande extends ActionSupport implements ServletRequestAware {

	private Long identifiant;
	private String code;
	private String libelle;
	private String montant;
	private Personne p;
	private HttpServletRequest request;
	private Commande commande;

	public Long getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(Long identifiant) {
		this.identifiant = identifiant;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getMontant() {
		return montant;
	}

	public void setMontant(String montant) {
		this.montant = montant;
	}

	public Personne getP() {
		return p;
	}

	public void setP(Personne p) {
		this.p = p;
	}

	@Override
	public void setServletRequest(HttpServletRequest httpServletRequest) {
		this.request = httpServletRequest;
	}

	public String AjoutCom() {

		try {
			Map session = ActionContext.getContext().getSession();
			Long idPersonne = Long.parseLong(session.get("idPersonne").toString());
			Personne p = new Personne();
			Collection personnes = PersonneManager.getSelectUser(idPersonne);
			for (Iterator iter = personnes.iterator(); iter.hasNext();) {
				p = (Personne) iter.next();
			}
			boolean b=CommandeManager.AddCommande(getCode(), getLibelle(), getMontant(), p);
			if(b==false)
				return "error";
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "error";
	}

	public String listCom() {
		Map session = ActionContext.getContext().getSession();
		Long idPersonne = Long.parseLong(session.get("idPersonne").toString());
		Collection commandes = CommandeManager.getCommandePersonne(idPersonne);
		for (Iterator iter = commandes.iterator(); iter.hasNext();) {
			Commande commande = (Commande) iter.next();
			setCode(commande.getCode());
			setLibelle(commande.getLibelle());
			setMontant(commande.getMontant());
		}
		request.setAttribute("listeCommandes", commandes);
		return "success";
	}
	
	public String getCom() {
		String codeCom = request.getParameter("code");
		Collection commandes = CommandeManager.getCommande(codeCom);
		for (Iterator iter = commandes.iterator(); iter.hasNext();) {
			commande = (Commande) iter.next();
			setIdentifiant(commande.getIdentifiant());
			setCode(codeCom);
			setLibelle(commande.getLibelle());
			setMontant(commande.getMontant());
			setP(commande.getPersonne());
		}
		return "success";
	}

	public String updateCom() {

		try {
			Map session = ActionContext.getContext().getSession();
			Long idPersonne = Long.parseLong(session.get("idPersonne").toString());
			Personne p = new Personne();
			Collection personnes = PersonneManager.getSelectUser(idPersonne);
			for (Iterator iter = personnes.iterator(); iter.hasNext();) {
				p = (Personne) iter.next();
			}
			boolean b=CommandeManager.UpdateCommande(getIdentifiant(), getCode(), getLibelle(), getMontant(), p);
			if(b==false)
				return "error";
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "error";
	}
	public String SupprimerCom() {
		try {
			String id = request.getParameter("identifiant");
			CommandeManager.DeleteCommande(Long.parseLong(id));
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "error";
	}
	
}
