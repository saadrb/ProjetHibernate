package metier;

import java.util.Collection;

import dao.CommandeDAO;
import dao.PersonneDAO;
import modele.Commande;
import modele.Personne;

public class CommandeManager {
	
	
	public static Collection   getCommande(String code){
		
		String requette = "from Commande where code='" + code +  "'";

		Collection commandes = CommandeDAO.getListeCommande(requette);
		
		return commandes;
	}
	public static void   AddCommande(String prenom, String nom,String login, String password) throws Exception{
		
		Commande commande=new Commande();
		CommandeDAO.ajouterCommande(commande);
	}
	public static void   UpdateCommande(Long id,String code, String libelle, String montant) throws Exception{
		
		Commande commande=new Commande();
		PersonneDAO.getPersonne(id);
		commande.setCode(code);
		commande.setLibelle(libelle);
		commande.setMontant(montant);
		CommandeDAO.modifierCommande(commande);
	}
	public static void   DeleteCommande(Long id) throws Exception{
	
		Commande commande=new Commande();
		PersonneDAO.getPersonne(id);
		CommandeDAO.SupprimerCommande(commande);
	}

}
