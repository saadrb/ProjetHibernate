package persistence;

import java.util.Collection;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;



public class BaseDAO {

	private static BaseDAO dao;

	private SessionFactory sessionFactory;

	private BaseDAO() {
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		this.sessionFactory = sessionFactory;

	}

	public Session openSession() {
		return getInstance().getSessionFactory().openSession();
	}

	public void closeSessionaFactory() {
		getInstance().getSessionFactory().close();
	}

	public static synchronized BaseDAO getInstance() {
		if (dao == null) {
			dao = new BaseDAO();
			return dao;
		} else
			return dao;
	}

	public void ajouter(Object objet) throws Exception{

		Session session = openSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.save(objet);
			tx.commit();
			session.close();
			
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();			
			throw new Exception("Erreur technique, veuillez consulter l'administrateur ");
		}

	}

	public void modifier(Object objet) {

		Session session = openSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.update(objet);
			tx.commit();
			session.close();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		}
	}

	public void delete(Object objet) {

		Session session = openSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.delete(objet);
			tx.commit();
			session.close();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		}
	}

	public Object getObject(Class clazz, Long id) {

		Session session = openSession();
		return session.load(clazz, id);

	}

	public Collection getListObject(String requette) {

		Session session = openSession();
		Query query = session.createQuery(requette);
		//query.setString("paramcode", "code1");
		List liste = query.list();
		System.out.println("dao size ==>" + liste.size());
		return liste;

	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
