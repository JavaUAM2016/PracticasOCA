/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica4.test;

import mx.edu.uam.practica4.controles.ControlBlueRay;
import mx.edu.uam.practica4.controles.ControlRemoto;
import mx.edu.uam.practica4.controles.ControlTV;
import mx.edu.uam.practica4.electroDomesticos.BlueRay;
import mx.edu.uam.practica4.electroDomesticos.ElectroDomestico;
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
    
    private Television tv;
    private ControlRemoto controlTV;
    private ElectroDomestico blueRay;
    private ControlRemoto controlBlue;
    private ControlRemoto[] controles;
    private Familiar papa;
    
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
    
    @After
    public void tearDown() {
        System.out.println("After");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    
    @Before
    public void setUp() {
        tv = new Television();
        controlTV = new ControlTV();
        blueRay = new BlueRay();
        controlBlue = new ControlBlueRay();
        papa = new Padre();
        controles=new ControlRemoto[2];
        controles[0]=controlTV;
        controles[1]= controlBlue ;



        papa.setControlesRemotos(controles);
        controlTV = papa.getControlesRemotos()[0];
        controlTV.apagar(tv);
        ((ControlTV) controlTV).cambiarCanal(tv, 25);
    }

    @Test
    public void testApp() {

        assertSame(25, tv.getCanalActual());
    }
  
}
