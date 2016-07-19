/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica4.test;

import java.util.logging.Level;
import java.util.logging.Logger;
import mx.edu.uam.practica4.aparatos.BlueRay;
import mx.edu.uam.practica4.aparatos.ElectroDomestico;
import mx.edu.uam.practica4.aparatos.Television;
import mx.edu.uam.practica4.controles.ControlBlueRay;
import mx.edu.uam.practica4.controles.ControlRemoto;
import mx.edu.uam.practica4.controles.ControlTV;
import mx.edu.uam.practica4.exceptions.SistemaAparatosException;
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
 * @author sidlors
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
        System.out.println("After Class");
    }
    
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
        try {
            ((ControlTV) controlTV).cambiarCanal(tv, 25);
        } catch (SistemaAparatosException ex) {
            System.err.println("Error: " +ex.getMessage());
            ex.getStackTrace();
            //throw new SistemaAparatosException(ex.getLocalizedMessage());
        }
    }
    
    @After
    public void tearDown() {
        System.out.println("After");
    }

    @Test
    public void testApp() {
    System.out.println("Esto es una Prueba Unitaria");
    assertSame(25, tv.getCanalActual());
    }
    
    
}
