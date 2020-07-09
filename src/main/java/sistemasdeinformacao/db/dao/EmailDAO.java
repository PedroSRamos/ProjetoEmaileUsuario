package sistemasdeinformacao.db.dao;

import javax.persistence.EntityManager;

import sistemasdeinformacao.db.entity.Email;
import sistemasdeinformacao.db.utils.HibernateUtil;

public class EmailDAO {
	
	private static EntityManager em;
	
	public EmailDAO() {
		em = HibernateUtil.getEntityManager();
	}
	
	public void create(Email email) {
		em.getTransaction().begin();
		em.persist(email);
		em.getTransaction().commit();
	}
	
	public Email getById(Integer Id) {
		return em.find(Email.class, Id);
	}
	
	public void update(Email email) {
		em.getTransaction().begin();
		em.merge(email);
		em.getTransaction().commit();
	}
	
	public void delete(Email email) {
		em.getTransaction().begin();
		em.remove(email);
		em.getTransaction().commit();
	}
}
