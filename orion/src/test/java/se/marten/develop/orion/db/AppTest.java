package se.marten.develop.orion.db;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
        
        EntityManager entitymanager = emfactory.createEntityManager( );
        entitymanager.getTransaction( ).begin( );

        User u = new User("adam","adamsuser","hejhej");
        
        entitymanager.persist(u);
        entitymanager.flush();
        entitymanager.getTransaction( ).commit( );
        entitymanager.close( );
        emfactory.close( );
     }
}
