package mx.edu.uam.practica4.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author invited
 */
public class AppMainTest {
    
    public AppMainTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Before class");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("After class");
    }
    
    @Before
    public void setUp() {
        System.out.println("before");
    }
    
    @After
    public void tearDown() {
        System.out.println("after");
    }

    @Test
    public void hello() {
        System.out.println("Prueba unitaria :  test hello");
    }
    
    @Test
    public void hello2() {
        System.out.println("Prueba unitaria 2:  test hello2");
    }
}
