package se.marten.develop.orion.db.manager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtil
{
   public static EntityManagerFactory getEntityManagerFactory()
   {
      EntityManagerFactory emf = Persistence.createEntityManagerFactory("hsqldb-ds");
      return emf;
   }
}