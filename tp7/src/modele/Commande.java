package modele;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Commande {
	@Id
	@GeneratedValue
	private long identifiant;

	private String code;

	private String libelle;

	private String montant;

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

	public Commande(long identifiant, String code, String libelle, String montant) {
		super();
		this.identifiant = identifiant;
		this.code = code;
		this.libelle = libelle;
		this.montant = montant;
	}

	public Commande() {
		super();
	}

	
}
