/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica4.test;

import mx.edu.uam.practica4.control.ControlRemoto;
import mx.edu.uam.practica4.control.ControlTv;
import mx.edu.uam.practica4.electroDomestico.Electrodomestico;
import mx.edu.uam.practica4.electroDomestico.Television;
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
 * @author asus
 */
public class AppMainTest {

    private Television tv;
    private ControlRemoto controlTV;
    private Electrodomestico blueRay;
    private ControlRemoto controlBlue;
    private ControlRemoto[] controles;
    private Familiar papa;
    
    public AppMainTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
//        tv = new Television();
        tv = new Television("Sony Inc",50,true,52,25,99,200);
        controlTV = new ControlTv();
        //blueRay = new BlueRay();
        //controlBlue = new ControlBlueRay();
        papa = new Padre("Raul", 30, controles,"Valor1",12);
        controles=new ControlRemoto[2];
        controles[0]=controlTV;
        //controles[1]= controlBlue ;
        
        papa.setControl(controles);
        controlTV = papa.getControl()[0];
        controlTV.apagar(tv);
//        controlTV.encender(tv);
        ((ControlTv) controlTV).cambiaCanal(tv, 25);
        
    }
    
    @Test
    public void testApp() {

        assertSame(25, tv.getCanalActual());
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
