package dao;

import java.util.Collection;

import persistence.BaseDAO;

import modele.Personne;


public class PersonneDAO {

	public static void ajouterPersonne(Personne personne) throws Exception{
		BaseDAO.getInstance().ajouter(personne);
	}

	public static void modifierPersonne(Personne personne) {
		BaseDAO.getInstance().modifier(personne);
	}

	public static void SupprimerPersonne(Personne personne) {
		BaseDAO.getInstance().delete(personne);
	}

	public static Personne getPersonne(Long id) {
		Personne P=(Personne) BaseDAO.getInstance().getObject(Personne.class, id);
		return P;
	}

	public static Collection getListePersonne(String requette) {
		return BaseDAO.getInstance().getListObject(requette);
	}
}
