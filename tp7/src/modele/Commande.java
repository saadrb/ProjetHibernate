package modele;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Commande {
	@Id
	@GeneratedValue
	@Column(name = "Commande_ID")
	private long identifiant;

	private String code;

	private String libelle;

	private String montant;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Personne_ID", nullable = false)
	private Personne personne;

	public long getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(long identifiant) {
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

	public Commande(String code, String libelle, String montant, Personne personne) {
		super();
		this.code = code;
		this.libelle = libelle;
		this.montant = montant;
		this.personne=personne;
	}

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	public Commande() {
		super();
	}

	
}
