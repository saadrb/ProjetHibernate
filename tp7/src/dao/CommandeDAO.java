package dao;

import java.util.Collection;

import modele.Commande;
import persistence.BaseDAO;

public class CommandeDAO {
	public static void ajouterCommande(Commande commande) throws Exception{
		BaseDAO.getInstance().ajouter(commande);
	}

	public static void modifierCommande(Commande commande) {
		BaseDAO.getInstance().modifier(commande);
	}

	public static void SupprimerCommande(Commande commande) {
		BaseDAO.getInstance().delete(commande);
	}

	public static void getCommande(Long id) {
		BaseDAO.getInstance().getObject(Commande.class, id);
	}

	public static Collection getListeCommande(String requette) {
		return BaseDAO.getInstance().getListObject(requette);
	}
}
