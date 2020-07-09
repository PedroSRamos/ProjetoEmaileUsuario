package sistemasdeinformacao.db.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {

	public static EntityManager getEntityManager() {
		EntityManagerFactory emFactory = null;
		
		try {
			emFactory = Persistence.createEntityManagerFactory("usuario_email_PU");
		} catch(Throwable e) {
			throw new ExceptionInInitializerError(e);
		}
		
		return emFactory.createEntityManager();
	}
	
}
