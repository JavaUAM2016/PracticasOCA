/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import mx.edu.uam.practica4.controles.ControlRemoto;
import mx.edu.uam.practica4.controles.ControlTelevision;
import mx.edu.uam.practica4.electroDomesticos.Electrodomestico;
import mx.edu.uam.practica4.electroDomesticos.Television;
import mx.edu.uam.practica4.familia.Familiar;
import mx.edu.uam.practica4.familia.Padre;
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
    
    Television tele;
    
    public AppMainTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("before class");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("after class");
    }
    
    @Before
    public void setUp() {
        System.out.println("before");
         tele = new Television(50, 2, 10, 30);
       tele.setMarca("Sony");
       ControlRemoto controlTV = new ControlTelevision();
       ControlRemoto [] controles = {controlTV};
       Familiar papa = new Padre();
       System.out.println("**********************Televisiòn***********************");
       System.out.println(tele);
       papa.setControles(controles);
       controlTV = papa.getControles()[0];
       controlTV.enciende(tele);
       ((ControlTelevision)controlTV).cambiaCanal((Television)tele, 5);
    }
    
    @After
    public void tearDown() {
        System.out.println("after");
    }

    @Test
    public void hello1(){
        System.out.println("hello 1");
    }
    
    @Test
    public void hello2(){
        System.out.println("hello 2");
    }
    @Test
    public void testApp(){
        assertSame(5, tele.getCanalActual());
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
