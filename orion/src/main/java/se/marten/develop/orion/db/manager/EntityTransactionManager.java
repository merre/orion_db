package se.marten.develop.orion.db.manager;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


public class EntityTransactionManager {

	private EntityManager em;
	public EntityTransactionManager(){
		em = EntityManagerUtil.getEntityManagerFactory().createEntityManager();
	}
	
	public void commit(Object dbObject){
		if(em != null){
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			em.persist(dbObject);
			transaction.commit();
			em.close();
		}
	}
}

