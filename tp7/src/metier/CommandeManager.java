package metier;

import java.util.Collection;

import dao.CommandeDAO;
import modele.Commande;
import modele.Personne;

public class CommandeManager {

	public static Collection getCommande(String code) {

		String requette = "from Commande where code='" + code + "'";

		Collection commandes = CommandeDAO.getListeCommande(requette);

		return commandes;
	}
	
	public static Collection getCommandePersonne(Long id) {

		String requette = "from Commande where Personne_ID='" + id + "'";

		Collection commandes = CommandeDAO.getListeCommande(requette);

		return commandes;
	}

	public static boolean AddCommande(String code, String libelle, String montan, Personne p) throws Exception {
		Double montant = Double.parseDouble(montan);
		if (montant < 20000)
			if (montant >= 15000) {
				montant = montant * 0.85;
				Commande commande = new Commande(code, libelle, montant.toString(),p);
				CommandeDAO.ajouterCommande(commande);
				return true;
			} else {
				Commande commande = new Commande(code, libelle, montant.toString(),p);
				CommandeDAO.ajouterCommande(commande);
				return true;
			}
		else
			return false;
	}

	public static boolean UpdateCommande(Long id, String code, String libelle, String montan, Personne p) throws Exception {
		Commande commande = new Commande();
		commande=CommandeDAO.getCommande(id);
		commande.setCode(code);
		commande.setLibelle(libelle);
		commande.setPersonne(p);
		Double montant = Double.parseDouble(montan);
		if (montant < 20000)
			if (montant >= 15000) {
				montant = montant * 0.85;
				commande.setMontant(montant.toString());
				CommandeDAO.modifierCommande(commande);
				return true;
			}
			else{
				commande.setMontant(montant.toString());
				CommandeDAO.modifierCommande(commande);
				return true;
			}
		else
			return false;
	}

	public static void DeleteCommande(Long id) throws Exception {

		Commande commande = new Commande();
		commande=CommandeDAO.getCommande(id);
		commande.setIdentifiant(id);
		CommandeDAO.SupprimerCommande(commande);
	}

}
