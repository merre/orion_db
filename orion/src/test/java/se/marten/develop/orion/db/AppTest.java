package se.marten.develop.orion.db;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NamedQuery;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public static void main( String[ ] args ) {
    	   
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "hsqldb-ds" );
//        
        EntityManager entitymanager = emfactory.createEntityManager( );
//        entitymanager.getTransaction( ).begin( );
//
//        User u = new User("adam","adamsuser","hejhej");
//        
//        entitymanager.persist(u);
//        entitymanager.flush();
//        entitymanager.getTransaction( ).commit( );
//        entitymanager.close( );
//        emfactory.close( );
        
        TypedQuery<User> query =
        		entitymanager.createNamedQuery("User.findByName", User.class).setParameter("name", "adam");
        	  List<User> users = query.getResultList();
        	  User u = users.get(0);
        	  System.out.println(u.getUsername());
     }
}
