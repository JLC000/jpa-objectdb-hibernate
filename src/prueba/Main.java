package prueba;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

	public static void main(String args[]) {
		EntityManagerFactory emf = Persistence
				//.createEntityManagerFactory("jpa-objectdb");
				.createEntityManagerFactory("jpa-derby");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();

			Persona p = new Persona();
			p.setNombre("Enrique");
//			
			Telefono t = new Telefono("234234");
			p.addTelefono(t);
//			
			em.persist(t);
			em.persist(p);
			
//			Persona p = em.getReference(Persona.class, 2L);
			
//			Telefono t2 = new Telefono("4444");
//			//em.persist(t2);
//			p.addTelefono(t2);
			
//			Telefono t = em.find(Telefono.class, 0);
//			em.remove(t);
			
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			throw new RuntimeException(e);
		} finally {
			if (em != null && em.isOpen())
				em.close();
			if (emf != null)
				emf.close();
		}
	}
}
