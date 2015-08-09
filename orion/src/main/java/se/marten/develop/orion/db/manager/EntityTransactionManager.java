package se.marten.develop.orion.db.manager;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import se.marten.develop.orion.db.User;


public class EntityTransactionManager {

	private EntityManager em;
	public EntityTransactionManager(){
		em = EntityManagerUtil.getEntityManagerFactory().createEntityManager();
	}
	
	public <T> Object getObjectById(long id, String namedQuery, Class<T> clazz){
        TypedQuery<T> query =
        		em.createNamedQuery(namedQuery, clazz).setParameter("id", id);
        	  return query.getSingleResult();
	}
	
	//TODO gather objects into one commit?
	
//	  em.getTransaction().begin();
//	  for (int i = 1; i <= 1000000; i++) {
//	      Point point = new Point(i, i);
//	      em.persist(point);
//	      if ((i % 10000) == 0) {
//	          em.flush();
//	          em.clear();
//	      }
//	  }
//	  em.getTransaction().commit();

	public void commit(Object dbObject){
		if(em != null){
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			em.persist(dbObject);
			em.flush();
			transaction.commit();
			em.close();
		}
	}
}

