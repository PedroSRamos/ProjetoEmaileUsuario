package sistemasdeinformacao.db.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import sistemasdeinformacao.db.entity.Usuario;
import sistemasdeinformacao.db.entity.Email;
import sistemasdeinformacao.db.utils.HibernateUtil;

public class UsuarioDAO {

	private EntityManager em;
	
	public UsuarioDAO() {
		this.em = HibernateUtil.getEntityManager();
	}
	
	public void create(Usuario usuario) {
		em.getTransaction().begin();
		em.persist(usuario);
		em.getTransaction().commit();
	}
	
	public Usuario getByEndereco(String endereco) {
		Usuario u = em.find(Usuario.class, endereco);
		
		if(u == null) {
			System.out.println("Usuario com o endereco " + endereco + " não encontrado");
		}
		return u;
	}
	
	public List<Email> getAllEmails(String endereco){
		Usuario u = em.find(Usuario.class, endereco);
		Query q = em.createQuery("FROM Email where :endereco = enderecoOrigem OR :endereco = enderecoDestino", Email.class);
		q.setParameter("endereco", u);
		List<Email> emails = (List<Email>) q.getResultList();
		return emails;
	}
	
	public void update(Usuario usuario) {
		em.getTransaction().begin();
		em.merge(usuario);
		em.getTransaction().commit();
	}
	
	public void delete(Usuario usuario) {
		em.getTransaction().begin();
		em.remove(usuario);
		em.getTransaction().commit();
	}
}
